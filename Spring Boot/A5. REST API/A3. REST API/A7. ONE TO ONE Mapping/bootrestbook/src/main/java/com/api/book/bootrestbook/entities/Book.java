package com.api.book.bootrestbook.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="books") 
public class Book{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="book_id")
    private int id; 
    private String title;

    //1. isko non primitive matlab author ke object ki form mai rakhenge, niche sari jagah Author karo and create class Author.java
    @OneToOne(cascade = CascadeType.ALL)   //10. yeh unidirectional hai hum book se author ki taraf jarhe hai, author se book ki taraf nhi jarhe. ek book ke pas ek hi author hoga. cascade ki help jitne bhi authors honge book keandar woh bhi save hojayege nhito yeh error dega, humne book bhi deete ki to uthor bhi automatically delete hojayega
    private Author author;

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "book [id=" + id + ", title=" + title + ", author=" + author + "]";
    }

}
