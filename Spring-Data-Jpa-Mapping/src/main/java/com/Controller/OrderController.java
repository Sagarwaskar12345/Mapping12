package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Custmor;
import com.Entity.Product;
import com.Repository.CustmorRepository;
import com.Repository.ProductRepository;
import com.dto.orderRequest;

@RestController
public class OrderController {
	
	@Autowired
	private CustmorRepository  custmorRepository; 
	
	private ProductRepository  productRepository; 
	
	@PostMapping("/placeOrder")
	public Custmor placeOrder(@RequestBody orderRequest request) {
		return custmorRepository.save(request.getCustmor());
	}
	@GetMapping("/FindAllOrders")
	public List<Custmor>findAllOrders(){
		return custmorRepository.findAll();
	}
	
	@DeleteMapping("/deleteCustmor")
	public Custmor deleteCustmor(@PathVariable Custmor id)
	{
		Product deleteOrder=custmorRepository.deleteById(id);
		
		return Product;
	}
	
	@DeleteMapping("/deleteProduct")
	public Product deleteProduct(@PathVariable Product delete)
	{
		Product deleteOrder=productRepository.deleteById(delete.delete);
		
		return Product;
	}
	
	
	
	
}
