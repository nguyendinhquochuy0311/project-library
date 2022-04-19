package com.project.springboot.controller;

import com.project.springboot.BookRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ControllerBook {
    public static Logger logger = LoggerFactory.getLogger(ControllerBook.class);

    @Autowired
    BookRepository bookRepository;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> listAllBook() {
        List<Book> books = bookRepository.findAll();

        if (books.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @RequestMapping(value = "find/{bookName}", method= RequestMethod.GET)
    public ResponseEntity<List<Book>> findByBookName(@PathVariable(name = "bookName") String bookName) {
        return new ResponseEntity<>(bookRepository.findByBookName(bookName), HttpStatus.OK);
    }

    @RequestMapping(value = "findbywriter/{writer}",method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getByWriter(@PathVariable(name="writer") String writer) {
        return new ResponseEntity<>(bookRepository.findByWriter(writer), HttpStatus.OK);
    }

    @RequestMapping(value = "create",method = RequestMethod.POST)
    public ResponseEntity<Book> createNewCategory(@RequestBody Book book) {
        return new ResponseEntity<>(bookRepository.save(book), HttpStatus.OK);
    }


//    @RequestMapping(value = "find/{bookName}", method= RequestMethod.GET)
//    public String findByBookName(Model model) {
//
//        Book book = new Book();
//
//        //lay data len set vaof book
//
//        model.addAttribute("book_info", book);
//
//        return "home"; // tra ve cho home.html mot doi tuong book, duoi cai ten book_info
//    }

}
