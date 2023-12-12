package com.educandoweb.couser.repositories;

import com.educandoweb.couser.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
