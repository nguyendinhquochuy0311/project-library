package com.project.springboot.service;

import com.project.springboot.JournalRepository;
import com.project.springboot.entity.Book;
import com.project.springboot.entity.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JournalService {
    @Autowired
    JournalRepository journalRepository;

    public void saveJournal(Journal journal){
        journalRepository.save(journal);
    }

    public void delete(long id) {
        journalRepository.deleteById(id);
    }

    public Journal get(long id) {
        return journalRepository.findById(id).get();
    }

}
