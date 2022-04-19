package com.project.springboot;

import com.project.springboot.entity.Book;
import com.project.springboot.entity.Manage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByBookName(String bookName);
    List<Book> findByWriter(String writer);
}
