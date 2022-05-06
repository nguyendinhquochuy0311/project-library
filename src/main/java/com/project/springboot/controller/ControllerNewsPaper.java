package com.project.springboot.controller;


import com.project.springboot.BookRepository;
import com.project.springboot.NewsPaperRepository;
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
public class ControllerNewsPaper {
    public static Logger logger = LoggerFactory.getLogger(ControllerNewsPaper.class);

    @Autowired
    NewsPaperRepository newsPaperRepository;

    @GetMapping("/newspaperlist")
    public String newspaperList(Model model) {
        // Trả về đối tượng todoList.
        model.addAttribute("newspaperlist", newsPaperRepository.findAll());
        // Trả về template "listTodo.html"
        return "index";
    }

    @PostMapping("/addnewspaper")
    public String addNewspaper(Model model) {
        model.addAttribute("newspaper", new NewsPaper());
        return "addnewspaper";
    }

    @PutMapping("/updatenewspaper")
    public String updateNewspaper(Model model){
        return "updateNewspaper";
    }

    @DeleteMapping("/deletenewspaper")
    public String deleteNewspaper(Model model){
        return "deletenewspaper";
    }

}
