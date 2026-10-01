package com.spring_boot_jpa_ex.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring_boot_jpa_ex.project.dto.BookDTO;
import com.spring_boot_jpa_ex.project.entity.Book;
import com.spring_boot_jpa_ex.project.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {

	private final BookRepository repository;

	@Override
	public String bookNoCheck(String bookNo) {
		String res = repository.findBookNoByBookNo(bookNo);
		String result = "available";
		if (res != null) {
			result = "no_available";
		}
		return result;
	}

	@Override
	public ArrayList<BookDTO> bookSearch(HashMap<String, Object> map) {
		String type = (String) map.get("type");
		String keyword = (String) map.get("keyword");
		return repository.findByTypeAndKeyword(type, keyword).stream().map(BookDTO::from)
				.collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public void insertBook(BookDTO bookDto) {
		repository.save(Book.from(bookDto));
	}

	@Override
	public void updateBook(BookDTO bookDto) {
		repository.save(Book.from(bookDto));

	}

	@Override
	public void deleteBook(String bookNo) {
		repository.deleteById(bookNo);
	}

	@Override
	public ArrayList<BookDTO> listAllBook() {
		return repository.findAll().stream().map(BookDTO::from).collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public BookDTO detailViewBook(String bookNo) {
		return BookDTO.from(repository.findById(bookNo).orElseThrow(() ->
        		new IllegalArgumentException("도서가 없습니다."))
		);
	}

}
