package com.project.springboot.controller;

import com.project.springboot.BookRepository;
import com.project.springboot.JournalRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.entity.Journal;
import com.project.springboot.entity.NewsPaper;
import com.project.springboot.service.JournalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ControllerJournal {
    public static Logger logger = LoggerFactory.getLogger(ControllerJournal.class);
    @Autowired
    JournalRepository journalRepository;

    @Autowired
    JournalService journalService;

    @GetMapping("/journallist")
    public String journalList(Model model) {
        // Trả về đối tượng todoList.
        model.addAttribute("journallist", journalRepository.findAll());
        // Trả về template "listTodo.html"
        return "index";
    }

    @RequestMapping("/addjournal")
    public String addJournal(Model model) {
        Journal journal = new Journal();

        model.addAttribute("journal", journal);
        return "addjournal";
    }

    @RequestMapping(value = "/savejournal", method = RequestMethod.POST)
    public String saveJournal(@ModelAttribute("journal") Journal journal) {
        journalService.saveJournal(journal);
        return "redirect:/";
    }

    @RequestMapping("/editjournal/{id}")
    public ModelAndView editJournal(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("editjournal");
        Journal journal = journalService.get(id);
        mav.addObject("journal", journal);

        return mav;
    }

    @RequestMapping("/deletejournal/{id}")
    public String deleteJournal(@PathVariable(name = "id") int id) {
        journalService.delete(id);
        return "redirect:/";
    }


}
