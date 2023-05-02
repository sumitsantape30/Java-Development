package com.api.book.bootrestbook.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity 
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;

    @Column(name="first_name")
    private String firstName;
    private String lastName;

    private String language;

    //1. yaha book banayenge. ab humare book ke pas author hai aur author ke pas book, this is multidirectional
    @OneToOne(mappedBy = "author") 
    @JsonBackReference //6. means iske piche nhi jana hai kyuki Book se author ke pas aaye hai agar idhar se bhi udhar jaoge to infite loop chalta rahega. ab jab aap book nikaloge to author milega aur author nikaloge to book nhi milega
    private Book book; //2.hum chahte hai yeh book ek extra column na create krde humare database mai 
    //3. iske getters setter bana lo. ab hum application ko run karenge to infinite loop hojayega kyuki dono objects overlap krhe hai
    //4. isliye book.java mai author ke upaer JsonManagedReference lagao

    public int getAuthorId() {
        return authorId;
    }

    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", firstName=" + firstName + ", lastName=" + lastName + ", language="
                + language + ", book=" + book + "]";
    }
    public Author(int authorId, String firstName, String lastName, String language) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
    }

    public Author(){
        
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
}
