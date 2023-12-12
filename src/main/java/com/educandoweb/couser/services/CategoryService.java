package com.educandoweb.couser.services;

import com.educandoweb.couser.entities.Category;
import com.educandoweb.couser.entities.Users;
import com.educandoweb.couser.repositories.CategoryRepository;
import com.educandoweb.couser.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
       Optional<Category> obj = repository.findById(id);
       return obj.get();
    }


}
