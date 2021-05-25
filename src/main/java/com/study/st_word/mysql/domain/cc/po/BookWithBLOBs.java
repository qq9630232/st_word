package com.study.st_word.mysql.domain.cc.po;

public class BookWithBLOBs extends Book {
    private String description;

    private String content;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}