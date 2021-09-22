package com.devsuperior.dscatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.dscatalog.entities.Category;

@SpringBootApplication
public class DscatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DscatalogApplication.class, args);
		
		Category categoria = new Category();
		categoria.setId(1L);
		categoria.setName("teste");
		
		System.out.println(categoria.toString());
	}
	
	

}
