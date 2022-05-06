package com.project.springboot.controller;


import com.project.springboot.BookRepository;
import com.project.springboot.NewsPaperRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.entity.Journal;
import com.project.springboot.entity.NewsPaper;
import com.project.springboot.service.NewspaperService;
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
public class ControllerNewsPaper {
    public static Logger logger = LoggerFactory.getLogger(ControllerNewsPaper.class);

    @Autowired
    NewsPaperRepository newsPaperRepository;

    @Autowired
    NewspaperService newspaperService;

    @GetMapping("/newspaperlist")
    public String newspaperList(Model model) {
        // Trả về đối tượng todoList.
        model.addAttribute("newspaperlist", newsPaperRepository.findAll());
        // Trả về template "listTodo.html"
        return "index";
    }

    @RequestMapping("/addnewspaper")
    public String addNewspaper(Model model) {
        NewsPaper newsPaper = new NewsPaper();
        model.addAttribute("newspaper", newsPaper);
        return "addnewspaper";
    }

    @RequestMapping(value = "/savenewspaper", method = RequestMethod.POST)
    public String saveNewspaper(@ModelAttribute("newspaper") NewsPaper newsPaper) {
        newspaperService.saveNewspaper(newsPaper);
        return "redirect:/";
    }

    @RequestMapping("/editnewspaper/{id}")
    public ModelAndView editNewspaper(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("editnewspaper");
        NewsPaper newsPaper = newspaperService.get(id);
        mav.addObject("newspaper", newsPaper);

        return mav;
    }

    @RequestMapping("/deletenewspaper/{id}")
    public String deleteNewspaper(@PathVariable(name = "id") int id) {
        newspaperService.delete(id);
        return "redirect:/";
    }

}
