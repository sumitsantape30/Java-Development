package com.api.book.bootrestbook.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.entities.Book;

@Component //component lagane se spring container ko pta chal jayega ki humare pas ek class hai jiska hume object banana hai
public class BookService {
    //13. yeh BookService apke dao layer se interact krhi hogi matlab dao layer database wale layers ko call krhi hogi.
    //abhi database nhi hai to fake service banayenge
    private static List<Book> list = new ArrayList<>();

    //by default mai isme kuch data store kdeta hu.
    //jaisehi humara class load hota hai to pehle static variable run hote hai then static block
    static{

        list.add( new Book(12, "Java Complete Reference", "XYZ"));
        list.add( new Book(36, "Think Java", "abc"));
        list.add( new Book(45, " Head first to Java", "lmn"));
    }
    //get all books
    public List<Book> getAllBook(){
        return list;
    }

    //agar single book deni hai to uski id chahiye hogi hume
    public Book getBookById(int id){
        
        // for( Book book: list){
        //     if( book.id == id){
        //         return book;
        //     }
        // }
        // return null;

        Book book = null;
        book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return book;
    }

}
