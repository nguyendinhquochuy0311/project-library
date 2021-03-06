package com.project.springboot.controller;

import com.project.springboot.BookRepository;
import com.project.springboot.JournalRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.entity.Journal;
import com.project.springboot.entity.NewsPaper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ControllerJournal {
    public static Logger logger = LoggerFactory.getLogger(ControllerJournal.class);
    @Autowired
    JournalRepository journalRepository;



    @GetMapping("/journallist")
    public String journalList(Model model) {
        // Trả về đối tượng todoList.
        model.addAttribute("journallist", journalRepository.findAll());
        // Trả về template "listTodo.html"
        return "index";
    }
    @GetMapping("addjournal")
    public String addJournal(Model model) {
        model.addAttribute("journal", new Journal());
        return "addjournal";
    }
}
