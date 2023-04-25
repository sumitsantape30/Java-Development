package com.api.book.bootrestbook.Services;

import java.util.*;
import java.util.stream.Collectors;

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

     public Book addBook(Book b){ 
        list.add(b);
        return b; 
    }

    //4. 
    public void deleteBook(int bid){
        //for each loop se bhi kr skte ho. hum stream api use krke karenge
       list =  list.stream().filter(book -> { //ek ek book ayegi list se
            if(book.getId() != bid){//jo bhi book hai currently agar uski id match nhi krhi hai
                return true;
            }else{
                return false;
            }
        }).collect(Collectors.toList()); //isko list mai collect karenge

        

    }
}
