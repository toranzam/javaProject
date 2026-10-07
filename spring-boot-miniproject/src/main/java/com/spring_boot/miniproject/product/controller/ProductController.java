package com.spring_boot.miniproject.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/product/detail")
	public String detail() {
		return "product/detail";
	}
}
