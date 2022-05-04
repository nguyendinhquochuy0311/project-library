package com.project.springboot.controller;

import com.project.springboot.BookRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ControllerBook {
    public static Logger logger = LoggerFactory.getLogger(ControllerBook.class);

    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookService bookService;

    @GetMapping("/booklist")
    public String bookList(Model model) {
        // Trả về đối tượng todoList.
        model.addAttribute("booklist", bookRepository.findAll());
        // Trả về template "listTodo.html"
        return "index";
    }


    @RequestMapping(value = "/findbybookname", method = RequestMethod.POST)
    public String findByBook(@RequestBody String bookName, Model model) {

        List<Book> bookList = new ArrayList<>();
        if (bookName != null && !bookName.isEmpty()) {
            bookList = bookService.findBookByTitle(bookName);
        }
        model.addAttribute("books", bookList);
        return "findbybookname";
    }


//    @RequestMapping(value = "findbybookname/{bookName}", method = RequestMethod.GET)
//    public String findByBookName(@PathVariable(name = "bookName") String bookName,Model model) {
//       model.addAttribute("books",new ResponseEntity<>(bookRepository.findByBookName(bookName), HttpStatus.OK));
//       return "findbybookname";
//    }

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
