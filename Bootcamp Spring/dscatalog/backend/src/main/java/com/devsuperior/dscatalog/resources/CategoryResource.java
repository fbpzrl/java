package com.devsuperior.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;

@RestController //Defines that the class is a Rest Controller
@RequestMapping(value = "/categories") //Defines the resource's Rest route
public class CategoryResource { //Resource implements the Rest Controller

	/*
	 * 	Endpoint (or Web Service) is a route that gives some answer.
		Each resource can have multiple endpoints.
		Examples of endpoints:
		- Endpoint to Save a record
		- Endpoint to Fetch a record
		- Endpoint to Fetch multiple records
		- etc
	 */
	
	
	
	@GetMapping //Defines that the method is a EndPoint
	public ResponseEntity<List<Category>> findAll() { //ResponseEntity is a Spring object that will encapsulate an Http response
		
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Books"));
		list.add(new Category(2L, "Electronics"));
		
		return ResponseEntity.ok().body(list);
	}
}
