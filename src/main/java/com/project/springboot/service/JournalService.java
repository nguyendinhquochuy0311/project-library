package com.project.springboot.service;

import com.project.springboot.JournalRepository;
import com.project.springboot.entity.Journal;
import com.project.springboot.entity.NewsPaper;
import org.springframework.beans.factory.annotation.Autowired;

public class JournalService {
    @Autowired
    JournalRepository journalRepository;

    public void saveJournal(Journal journal){
        journalRepository.save(journal);
    }

    public void deleteBook(Journal journal){
        journalRepository.delete(journal);
    }
}
