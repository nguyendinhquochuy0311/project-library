package com.project.springboot.service;

import com.project.springboot.NewsPaperRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.entity.NewsPaper;
import org.springframework.beans.factory.annotation.Autowired;

public class NewspaperService {
    @Autowired
    NewsPaperRepository newsPaperRepository;

    public void saveNewspaper(NewsPaper newsPaper){
        newsPaperRepository.save(newsPaper);
    }

    public void deleteNewspaper(NewsPaper newsPaper){
        newsPaperRepository.delete(newsPaper);
    }

}
