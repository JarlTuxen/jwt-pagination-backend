package com.example.jwtpaginationbackend.repositories;

import com.example.jwtpaginationbackend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
