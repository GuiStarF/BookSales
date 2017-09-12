package com.test.web.model;

import java.lang.ref.SoftReference;

public class Book {
    private String bookId;
    private String bookName;
    private String bookNum;
    private String bookA;
    private String bookB;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookA() {
        return bookA;
    }

    public void setBookA(String bookA) {
        this.bookA = bookA;
    }

    public String getBookB() {
        return bookB;
    }

    public void setBookB(String bookB) {
        this.bookB = bookB;
    }
}
