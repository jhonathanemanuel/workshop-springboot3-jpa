package com.minhaempresa.course_077.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaempresa.course_077.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
