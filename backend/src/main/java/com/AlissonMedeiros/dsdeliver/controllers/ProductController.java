package com.AlissonMedeiros.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AlissonMedeiros.dsdeliver.dto.ProductDTO;
import com.AlissonMedeiros.dsdeliver.services.ProductService;

@RestController
@RequestMapping(value= "/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	//Endpoint metodo Get
	@GetMapping
	public ResponseEntity<List <ProductDTO>> findAll(){
		List<ProductDTO> list = service.findall();
		return ResponseEntity.ok().body(list);
	}
}
