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

    //9. yaha try catch block lagayenge
    public Book getBookById(int id){

        Book book = null;
        try{
            book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        }catch(Exception e){
            e.printStackTrace();
        }
        return book;
    }//10. ab yeh function exception aane pe 404 not found dikhayega. now open BookContoller

     public Book addBook(Book b){ 
        list.add(b);
        return b; 
    }

    public void deleteBook(int bid){
       list =  list.stream().filter(book -> { 
            if(book.getId() != bid){
                return true;
            }else{
                return false;
            }
        }).collect(Collectors.toList()); 

    }

    //3. update the book
    public void updateBook(Book book, int bookId){


        list = list.stream().map(b -> {
            if(b.getId() == bookId){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());
 
        
    }

}
