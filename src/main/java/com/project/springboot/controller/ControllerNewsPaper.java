package com.project.springboot.controller;


import com.project.springboot.BookRepository;
import com.project.springboot.NewsPaperRepository;
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
@RequestMapping("/newspaper")
public class ControllerNewsPaper {
    public static Logger logger = LoggerFactory.getLogger(ControllerNewsPaper.class);

    @Autowired
    NewsPaperRepository newsPaperRepository;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseEntity<List<NewsPaper>> listAllBook(){
        List<NewsPaper> newsPapers = newsPaperRepository.findAll();

        if (newsPapers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<NewsPaper>>(newsPapers,HttpStatus.OK);
    }

    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    public NewsPaper findContact(@PathVariable("id") long id) {
        NewsPaper newsPaper= newsPaperRepository.getOne(id);
        if(newsPaper == null) {
            ResponseEntity.notFound().build();
        }
        return newsPaper;
    }
}
