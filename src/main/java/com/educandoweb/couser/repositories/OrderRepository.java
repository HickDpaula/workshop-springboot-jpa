package com.educandoweb.couser.repositories;

import com.educandoweb.couser.entities.Order;
import com.educandoweb.couser.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
