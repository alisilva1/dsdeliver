package com.AlissonMedeiros.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AlissonMedeiros.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
