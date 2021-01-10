package com.AlissonMedeiros.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.AlissonMedeiros.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	
	@Query("SELECT DISTINCT obj from Order obj JOIN FETCH obj.products "
			+ " WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List<Order> findOrdersWithProducts();
}
