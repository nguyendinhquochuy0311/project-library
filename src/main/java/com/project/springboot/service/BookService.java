package com.project.springboot.service;

import com.project.springboot.BookRepository;
import com.project.springboot.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> findBookByTitle(String bookName) {
        List<Book> bookList = bookRepository.findByBookName1(bookName);
        return new ArrayList<>(bookList);
    }
}
