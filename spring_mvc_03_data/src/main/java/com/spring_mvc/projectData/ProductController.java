package com.spring_mvc.projectData;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

	@RequestMapping(value = "/product/productForm", method = RequestMethod.GET)
	public String productFormView() {
		return "product/productForm";
	}

	@RequestMapping(value = "/product/newProduct", method = RequestMethod.POST)
	public String insertProduct(HttpServletRequest request, Model model) {

		model.addAttribute("no", request.getParameter("no"));
		model.addAttribute("name", request.getParameter("name"));
		model.addAttribute("price", request.getParameter("price"));
		model.addAttribute("company", request.getParameter("company"));
		model.addAttribute("date", request.getParameter("date"));
		model.addAttribute("stock", request.getParameter("stock"));

		// URL 전달 링크에 사용할 고정 예제 값
		model.addAttribute("prdName", "키보드");
		model.addAttribute("prdStock", 10);
		model.addAttribute("prdNo", "P001");
		return "product/productResult";
	}

	@RequestMapping(value = "/product/productForm2", method = RequestMethod.GET)
	public String productFormView2() {
		return "product/productForm2";
	}

	@RequestMapping(value = "/product/newProduct2", method = RequestMethod.POST)
	public String insertProduct2(@RequestParam("no") String no, @RequestParam("name") String name,
			@RequestParam("price") String price, @RequestParam("company") String company,
			@RequestParam("date") String date, @RequestParam("stock") String stock, Model model) {
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("company", company);
		model.addAttribute("date", date);
		model.addAttribute("stock", stock);
		// URL 전달 링크에 사용할 고정 예제 값
		model.addAttribute("prdName", "키보드");
		model.addAttribute("prdStock", 10);
		model.addAttribute("prdNo", "P001");
		return "product/productResult";
	}

	@RequestMapping(value = "/product/newProduct2-1", method = RequestMethod.POST)
	public String insertProduct2_1(String no, String name, String price, String company, String date, String stock,
			Model model) {
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("company", company);
		model.addAttribute("date", date);
		model.addAttribute("stock", stock);
		// URL 전달 링크에 사용할 고정 예제 값
		model.addAttribute("prdName", "키보드");
		model.addAttribute("prdStock", 10);
		model.addAttribute("prdNo", "P001");
		return "product/productResult";
	}
	

	
	@RequestMapping(value = "/product/productForm3", method = RequestMethod.GET)
	public String productFormView3() {
		return "product/productForm3";
	}
	
	@RequestMapping(value = "/product/productForm4", method = RequestMethod.GET)
	public String productFormView4() {
		return "product/productForm4";
	}
	
	
	@RequestMapping(value = "/product/newProduct3", method = RequestMethod.POST)
	public String insertProduct3(Product product) {
		
		return "product/productResult3";
	}
	
	@RequestMapping(value = "/product/newProduct4", method = RequestMethod.POST)
	public String insertProduct4(@ModelAttribute("productInfo") Product product) {
		
		return "product/productResult4";
	}

	@RequestMapping(value = "/product/productForm2-1", method = RequestMethod.GET)
	public String productFormView2_1() {
		return "product/productForm2-1";
	}

	// URL를 통한 데이터 전달 받기
	@RequestMapping(value = "/product/path/{prdName}", method = RequestMethod.GET)
	public String productPathName(@PathVariable("prdName") String prdName) {
		System.out.println("상품명 : " + prdName);
		return "redirect:/";
	}

	// URL를 통한 여러 데이터 전달 받기
	@RequestMapping(value = "/product/path/{prdName}/{prdStock}/{prdNo}", method = RequestMethod.GET)
	public String productPathInfo(@PathVariable("prdName") String prdName,
			@PathVariable("prdStock") int prdStock, @PathVariable("prdNo") String prdNo) {
		System.out.println("상품명 : " + prdName);
		System.out.println("재고 : " + prdStock);
		System.out.println("상품번호 : " + prdNo);
		return "redirect:/";
	}

	@RequestMapping(value = "/product/prdSearchForm", method = RequestMethod.GET)
	public String prdSearchForm() {
		return "product/prdSearchForm";
	}

	@RequestMapping(value = "/product/prdSearch", method = RequestMethod.POST)
	public String prdSearch(@RequestParam HashMap<String, Object> param, Model model) {
		System.out.println(param.get("type"));
		System.out.println(param.get("keyword"));

		String company = (String) param.get("keyword");

		Product vo1 = new Product();
		vo1.setNo("P001");
		vo1.setName("키보드");
		vo1.setPrice(30000);
		vo1.setCompany(company);
		vo1.setDate("2026-01-10");
		vo1.setStock(10);

		Product vo2 = new Product();
		vo2.setNo("P002");
		vo2.setName("마우스");
		vo2.setPrice(20000);
		vo2.setCompany(company);
		vo2.setDate("2026-02-15");
		vo2.setStock(20);

		ArrayList<Product> prdList = new ArrayList<Product>();
		prdList.add(vo1);
		prdList.add(vo2);
		model.addAttribute("prdList", prdList);

		return "product/prdSearchResult";
	}
}
