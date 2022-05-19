package com.project.springboot.controller;

import com.project.springboot.BookRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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
    public String findByBook(@RequestParam("bookName") String book, Model model) {

        List<Book> bookList = new ArrayList<>();
        if (book != null && !book.isEmpty()) {
            bookList = bookService.findBookByTitle(book);
        }
        if (bookList.isEmpty()){
            bookList = bookService.findWriter(book);
        }
        model.addAttribute("books",bookList);

        return "findbybookname";
    }




    @RequestMapping("/addbook")
    public String addBook(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "addbook";
    }

    @RequestMapping(value = "/savebook",method = RequestMethod.POST)
    public String saveBook(@ModelAttribute("book") Book book){
        bookService.saveBook(book);
        return "redirect:/";
    }

    @RequestMapping("/editbook/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("editbook");
        Book book = bookService.get(id);
        mav.addObject("book", book);
        return mav;
    }

    @RequestMapping("/deletebook/{id}")
    public String deleteBook(@PathVariable(name = "id") int id) {
        bookService.delete(id);
        return "redirect:/";
    }
}
