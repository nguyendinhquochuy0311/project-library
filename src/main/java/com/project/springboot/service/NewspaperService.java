package com.project.springboot.service;

import com.project.springboot.NewsPaperRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.entity.NewsPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewspaperService {
    @Autowired
    NewsPaperRepository newsPaperRepository;

    public void saveNewspaper(NewsPaper newsPaper){
        newsPaperRepository.save(newsPaper);
    }

    public void delete(long id) {
        newsPaperRepository.deleteById(id);
    }
    public NewsPaper get(long id) {
        return newsPaperRepository.findById(id).get();
    }

}
