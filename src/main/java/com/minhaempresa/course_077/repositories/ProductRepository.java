package com.minhaempresa.course_077.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaempresa.course_077.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
