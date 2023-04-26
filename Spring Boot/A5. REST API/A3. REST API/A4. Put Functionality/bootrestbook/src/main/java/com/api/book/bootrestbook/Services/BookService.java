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

        //jo books ki list hai usme yeh bookId wali book dhundni hai aur jaisehi woh book mile uski information update krni hai iss book ke information ke sath.

        list = list.stream().map(b -> {
            //ek ek book niklega, jaisehi koi book ki is bookId se match karegi  usi case mai update krdenge
            if(b.getId() == bookId){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
                //id update nhi krenge, primary key thodi update karenge
            }
            return b;
        }).collect(Collectors.toList());
        //isme filter use nhi kiya kyuki hume existing data se kuch chatna nhi hai kuch filter nhi krna hai 
 
        
    }

}
