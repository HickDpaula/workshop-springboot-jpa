package com.educandoweb.couser.services;

import com.educandoweb.couser.entities.Users;
import com.educandoweb.couser.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
       return obj.get();
    }


}
