package com.AlissonMedeiros.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.AlissonMedeiros.dsdeliver.dto.ProductDTO;
import com.AlissonMedeiros.dsdeliver.entities.Product;
import com.AlissonMedeiros.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {
		
		@Autowired
		private ProductRepository repository;
		
		/*
		public ProductService(ProductRepository repository) {
			this.repository = repository;
		} */
		
		//Por ter o transactional readOnly ele só vai ler o banco e não deixar travar a consulta
		@Transactional(readOnly = true)
		public List<ProductDTO> findall(){
				List<Product> list = repository.findAllByOrderByNameAsc();
				return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		}
}
