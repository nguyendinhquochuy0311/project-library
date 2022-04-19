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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class ControllerJournal {
    public static Logger logger = LoggerFactory.getLogger(ControllerJournal.class);
    @Autowired
    JournalRepository journalRepository;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseEntity<List<Journal>> listAllBook(){
        List<Journal> journals = journalRepository.findAll();

        if (journals.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Journal>>(journals,HttpStatus.OK);
    }
    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    public Journal findContact(@PathVariable("id") long id) {
        Journal journal= journalRepository.getOne(id);
        if(journal == null) {
            ResponseEntity.notFound().build();
        }
        return journal;
    }
}
