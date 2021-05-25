package com.study.st_word.mysql.domain.cc.po;

public class Book {
    private Integer bookId;

    private String bookName;

    private String bookUser;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookUser() {
        return bookUser;
    }

    public void setBookUser(String bookUser) {
        this.bookUser = bookUser;
    }
}