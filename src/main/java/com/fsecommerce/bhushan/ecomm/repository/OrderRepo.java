package com.fsecommerce.bhushan.ecomm.repository;

import com.fsecommerce.bhushan.ecomm.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
