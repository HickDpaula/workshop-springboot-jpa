package com.educandoweb.couser.resources;

import com.educandoweb.couser.entities.Order;
import com.educandoweb.couser.entities.Users;
import com.educandoweb.couser.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@ResponseBody
@Controller
@RequestMapping(value = "/users")
public class ResourcesUsers {
    @Autowired
    private UsersService service;
    @GetMapping
    public ResponseEntity<List<Users>> findAll() {
        List<Users> list = service.findAll();
         return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id){
        Users users = service.findById(id);
        return ResponseEntity.ok().body(users);
    }
}
