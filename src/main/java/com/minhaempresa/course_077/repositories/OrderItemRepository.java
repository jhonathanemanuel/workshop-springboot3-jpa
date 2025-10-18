package com.minhaempresa.course_077.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaempresa.course_077.entities.OrderItem;
import com.minhaempresa.course_077.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
