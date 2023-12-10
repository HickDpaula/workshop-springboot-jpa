package com.educandoweb.couser.repositories;

import com.educandoweb.couser.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
