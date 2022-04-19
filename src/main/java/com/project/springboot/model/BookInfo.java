package com.project.springboot.model;

public class BookInfo {
    private int id;
    private String bookId;
    private String writer;
    private int numberOfPages;
    private int numberOfRelease;
    private String bookName;

    public BookInfo() {
    }

    public BookInfo(int id, String bookId, String writer, int numberOfPages, int numberOfRelease, String bookName) {
        this.id = id;
        this.bookId = bookId;
        this.writer = writer;
        this.numberOfPages = numberOfPages;
        this.numberOfRelease = numberOfRelease;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
