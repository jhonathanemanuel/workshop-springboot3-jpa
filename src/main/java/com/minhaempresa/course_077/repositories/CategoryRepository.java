package com.minhaempresa.course_077.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaempresa.course_077.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
