package com.spring_boot_react.project.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_react.project.dto.ProductDTO;
import com.spring_boot_react.project.service.ProductService;

@CrossOrigin("*")
@RestController
public class ProductRestController {
	
	private final ProductService service;
	
	public ProductRestController(ProductService service) {
		this.service = service;
	}

	@GetMapping("hello")
	public String hello() {
		return "안녕하세요";
	}
	
	@GetMapping("/product/productList")
	public ArrayList<ProductDTO> listAllProduct() {
		ArrayList<ProductDTO> prdList = service.listAllProduct();
		return prdList;
	}
	
	// 상품상세보기
	@GetMapping("/product/productDetailView/{prdNo}")
	public ProductDTO detailViewProduct(@PathVariable("prdNo") String prdNo) {
		return service.detailViewProduct(prdNo);
	}
	
	// 상품등록 
	@PostMapping("/product/insert")
	public void insertProduct(ProductDTO prd) {
		service.insertProduct(prd);
	}
	
	// 상품정보 수정
	@PutMapping("/product/update")
	public void updateProduct(ProductDTO prd) {
		service.updateProduct(prd);
	}
	
	// 상품정보 삭제 
	@DeleteMapping("/product/delete/{prdNo}")
	public void deleteProduct(@PathVariable String prdNo) {
		service.deleteProduct(prdNo);
		System.out.println(prdNo + "삭제완료");
	}
	

}
