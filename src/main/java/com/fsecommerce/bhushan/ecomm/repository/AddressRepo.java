package com.fsecommerce.bhushan.ecomm.repository;


import com.fsecommerce.bhushan.ecomm.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


public interface AddressRepo extends JpaRepository<Address, Long> {


}