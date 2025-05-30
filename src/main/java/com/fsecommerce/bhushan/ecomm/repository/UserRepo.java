package com.fsecommerce.bhushan.ecomm.repository;

import com.fsecommerce.bhushan.ecomm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo  extends JpaRepository <User, Long>  {

    Optional<User> findByEmail (String email);
}
