package com.minhaempresa.course_077.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.minhaempresa.course_077.entities.Category;
import com.minhaempresa.course_077.entities.Order;
import com.minhaempresa.course_077.entities.Product;
import com.minhaempresa.course_077.entities.User;
import com.minhaempresa.course_077.entities.enums.OrderStatus;
import com.minhaempresa.course_077.repositories.CategoryRepository;
import com.minhaempresa.course_077.repositories.OrderRepository;
import com.minhaempresa.course_077.repositories.ProductRepository;
import com.minhaempresa.course_077.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of Rings", "A cool book", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "The cool TV", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "The cool macbook", 1250.0, "");
		Product p4 = new Product(null, "PC gamer", "A cool Pc", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummit", "A cool book", 100.99, "");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmailc.com", "99999999999", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmailc.com", "99988888888", "123456");
		
		Order o1 = new Order(null, Instant.parse("2025-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2025-07-21T03:42:17Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2025-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
