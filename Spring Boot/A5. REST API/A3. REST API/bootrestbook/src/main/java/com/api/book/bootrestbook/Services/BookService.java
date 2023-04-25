package com.api.book.bootrestbook.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.entities.Book;

@Component 
public class BookService {
   
    private static List<Book> list = new ArrayList<>();
    
    static{

        list.add( new Book(12, "Java Complete Reference", "XYZ"));
        list.add( new Book(36, "Think Java", "abc"));
        list.add( new Book(45, " Head first to Java", "lmn"));
    }
    
    public List<Book> getAllBook(){
        return list;
    }

    public Book getBookById(int id){

        Book book = null;
        book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return book;
    }

}
