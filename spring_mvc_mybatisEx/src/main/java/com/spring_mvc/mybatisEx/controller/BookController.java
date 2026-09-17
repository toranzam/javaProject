
package com.spring_mvc.mybatisEx.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_mvc.mybatisEx.dto.BookDTO;
import com.spring_mvc.mybatisEx.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;

	@GetMapping("/")
	public String viewIndex() {
		return "index";
	}

	@GetMapping("/book/listAllBook")
	public String listAllBook(Model model) {
		ArrayList<BookDTO> bookList = service.listAllBook();
		model.addAttribute("bookList", bookList);
		return "book/bookListView";
	}

	@GetMapping("/book/newBookForm")
	public String newBookForm() {
		return "book/newBookForm";
	}

	@PostMapping("/book/insertBook")
	public String insertBook(BookDTO dto) {
		service.insertBook(dto);
		return "redirect:/book/listAllBook";
	}

	@GetMapping("/book/detailViewBook/{bookNo}")
	public String detailViewBook(@PathVariable("bookNo") String bookNo, Model model) {
		BookDTO result = service.detailViewBook(bookNo);
		model.addAttribute("book", result);
		return "book/bookDetailView";
	}

	@GetMapping("/book/updateBookForm/{bookNo}")
	public String updateBookForm(@PathVariable("bookNo") String bookNo, Model model) {
		BookDTO result = service.detailViewBook(bookNo);
		model.addAttribute("book", result);
		return "book/updateBookForm";
	}

	@PostMapping("/book/updateBook")
	public String updateBook(BookDTO dto) {
		service.updateBook(dto);
		return "redirect:/book/lsitAllBook";
	}

	@PostMapping("/book/deleteBook/{bookNo}")
	public String deleteBook(@PathVariable("bookNo") String bookNo) {
		service.deleteBook(bookNo);
		return "redirect:/book/listAllBook";
	}

	@ResponseBody
	@RequestMapping("/book/bookNoCheck1")
	public String prdCheck1(@RequestParam("bookNo") String bookNo) {
		String res = service.bookNoCheck(bookNo);
		return res;
	}

	@ResponseBody
	@RequestMapping("/book/bookNoCheck2")
	public String prdCheck2(@RequestParam("bookNo") String bookNo) {
		String res = service.bookNoCheck(bookNo);
		return res;
	}

	@ResponseBody
	@RequestMapping("/book/bookNoCheck3")
	public String prdCheck3(@RequestParam("bookNo") String bookNo) {
		String res = service.bookNoCheck(bookNo);
		return res;
	}

	@GetMapping("/book/bookSearchForm1")
	public String viewBookSearchForm1() {
		return "book/bookSearchForm1";
	}

	@ResponseBody
	@PostMapping("/book/bookSearch1")
	public ArrayList<BookDTO> bookSearch1(@RequestParam HashMap<String, Object> map) {
		ArrayList<BookDTO> bookList = service.bookSearch(map);
		return bookList;
	}

	@GetMapping("/book/bookSearchForm2")
	public String viewBookSearchForm2() {
		return "book/bookSearchForm2";
	}

	@PostMapping("/book/bookSearch2")
	public String bookSearch2(@RequestParam HashMap<String, Object> map, Model model) {
		ArrayList<BookDTO> bookList = service.bookSearch(map);
		model.addAttribute("bookList", bookList);
		return "book/bookSearchResultView";
	}

	@GetMapping("/book/bookSearchForm3")
	public String viewBookSearchForm3() {
		return "book/bookSearchForm3";
	}

	@ResponseBody
	@PostMapping("/book/bookSearch3")
	public ArrayList<BookDTO> bookSearch3(@RequestParam HashMap<String, Object> map) {
		ArrayList<BookDTO> bookList = service.bookSearch(map);
		return bookList;
	}

	

}
