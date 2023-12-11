package com.educandoweb.couser.services;

import com.educandoweb.couser.entities.Order;
import com.educandoweb.couser.entities.Users;
import com.educandoweb.couser.repositories.OrderRepository;
import com.educandoweb.couser.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> obj = repository.findById(id);
       return obj.get();
    }


}
