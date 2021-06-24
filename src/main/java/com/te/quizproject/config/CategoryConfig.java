package com.te.quizproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.quizproject.bean.Category;

@Configuration
public class CategoryConfig {
	
	@Bean
	public Category getCategory() {
		Category c=new Category();
		c.setId(1);
		c.setName("Sports");
		return c;
		
	}
	@Bean
	@Primary
	public Category getScieneceCategory() {
		Category c=new Category();
		c.setId(2);
		c.setName("Science");
		return c;
		
	}

}
