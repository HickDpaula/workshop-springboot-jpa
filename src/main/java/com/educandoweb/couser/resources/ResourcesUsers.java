package com.educandoweb.couser.resources;

import com.educandoweb.couser.entities.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class ResourcesUsers {
    @GetMapping
    public ResponseEntity<Users> findAll() {
        Users users = new Users(1L, "Maria", "Maria@gmail.com", "99998888", "123456");
         return ResponseEntity.ok().body(users);

    }
}
