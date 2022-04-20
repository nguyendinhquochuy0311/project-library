package com.project.springboot.controller;

import com.project.springboot.BookRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class ControllerBook {
    public static Logger logger = LoggerFactory.getLogger(ControllerBook.class);

    @Autowired
    BookRepository bookRepository;


    @GetMapping("/booklist")
    public String bookList(Model model) {
        // Trả về đối tượng todoList.
        model.addAttribute("booklist", bookRepository.findAll());
        // Trả về template "listTodo.html"
        return "index";
    }

    @RequestMapping(value = "findbybookname/{bookName}", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> findByBookName(@PathVariable(name = "bookName") String bookName) {
        return new ResponseEntity<>(bookRepository.findByBookName(bookName), HttpStatus.OK);
    }

    @RequestMapping(value = "findbywriter/{writer}", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getByWriter(@PathVariable(name = "writer") String writer) {
        return new ResponseEntity<>(bookRepository.findByWriter(writer), HttpStatus.OK);
    }



    @GetMapping("addbook")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "addbook";
    }



}
