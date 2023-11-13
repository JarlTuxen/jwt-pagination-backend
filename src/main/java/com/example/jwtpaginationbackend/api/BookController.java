package com.example.jwtpaginationbackend.api;

import com.example.jwtpaginationbackend.entity.Book;
import com.example.jwtpaginationbackend.services.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {

  private BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping
  public Page<Book> getAllBooks(Pageable pageable) {
    return bookService.getAllBooks(pageable);
  }

}

