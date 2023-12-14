package com.educandoweb.couser.services;

import com.educandoweb.couser.entities.Users;
import com.educandoweb.couser.repositories.UsersRepository;
import com.educandoweb.couser.services.exceptions.DataBaseException;
import com.educandoweb.couser.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UsersRepository repository;

    public List<Users> findAll(){
        return repository.findAll();
    }

    public Users findById(Long id){
       Optional<Users> obj = repository.findById(id);
       return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Users Insert(Users obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        try {
            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
           throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DataBaseException(e.getMessage());
        }
    }

    public Users update(Long id, Users obj){
        try {
            Users entity = repository.getReferenceById(id);

            UpdateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }


    }

    private void UpdateData(Users entity, Users obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }


}
