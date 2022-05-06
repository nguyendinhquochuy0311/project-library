package com.project.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "book_id")
    private String bookId;

    @Column(name = "writter")
    private String writer;

    @Column(name = "number_of_pages")
    private int numberOfPages;

    @Column(name = "number_of_release")
    private int numberOfRelease;

    @Column(name = "book_name")
    private String bookName;

    public Book() {
    }

    public Book(Long id, String bookId, String writer, int numberOfPages, int numberOfRelease, String bookName) {
        this.id = id;
        this.bookId = bookId;
        this.writer = writer;
        this.numberOfPages = numberOfPages;
        this.numberOfRelease = numberOfRelease;
        this.bookName = bookName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfRelease() {
        return numberOfRelease;
    }

    public void setNumberOfRelease(int numberOfRelease) {
        this.numberOfRelease = numberOfRelease;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
