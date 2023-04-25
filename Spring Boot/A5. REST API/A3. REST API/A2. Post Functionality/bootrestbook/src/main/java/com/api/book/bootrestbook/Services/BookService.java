package com.api.book.bootrestbook.Services;

import java.util.*;


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

     //1. hume new book banani hai, agar user ne book ka data diya to usse new book banani hai
     public Book addBook(Book b){ //parameter mai book ka object ayega
        //simply apne pas jo list hai usme iss book ko add krdena hai
        list.add(b);
        return b; //jo book add krhe ho wahi return bhi krdo
    }//yeh method mujhe mere controller se call krna hai to hum controller mai ek handler banayenge jo humare request ko handle krha hoga

}
