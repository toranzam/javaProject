package com.spring_boot_jpa_ex.project.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring_boot_jpa_ex.project.entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {

	@Query(value = "SELECT b FROM Book b WHERE b.bookNo = :bookNo")
	String findBookNoByBookNo(@Param("bookNo") String bookNo);

	@Query(value = "SELECT b FROM Book b "
			+ "WHERE (:type = 'bookName' AND b.bookName LIKE CONCAT('%', :keyword, '%')) "
			+ "OR (:type = 'bookAuthor' AND b.bookAuthor LIKE CONCAT('%', :keyword, '%'))")
	ArrayList<Book> findByTypeAndKeyword(@Param("type") String type, @Param("keyword") String keywrod);

}
