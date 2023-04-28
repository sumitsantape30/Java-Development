package com.api.book.bootrestbook.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //1. configuration karenge
@Table(name="books") // databse table ka nam books rakha
public class Book{

    //2. so Book as a entity treat hoga, Entity banate ho to apko ek primary key banani hoti hai so @Id likhenge aur auto increament krna hai to @GeneratedValue
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="book_id")
    private int id; //3. yeh automatic generate hojayega depeding upon database algorithm. har book keliye automatic generate hogi. application-properties open krke configuration karo
    private String title;
    private String author;

    public Book(int id, String title, String author) {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "book [id=" + id + ", title=" + title + ", author=" + author + "]";
    }

}
