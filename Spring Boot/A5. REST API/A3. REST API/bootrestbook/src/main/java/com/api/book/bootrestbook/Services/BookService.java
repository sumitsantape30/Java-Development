package com.api.book.bootrestbook.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Component 
public class BookService {
    
    @Autowired
    private BookRepository BookRepository;
   
    // private static List<Book> list = new ArrayList<>();
    
    // static{

    //      list.add( new Book(12, "Java Complete Reference", "XYZ"));
    //      list.add( new Book(36, "Think Java", "abc"));
    //      list.add( new Book(45, " Head first to Java", "lmn"));
    // }
    
    public List<Book> getAllBook(){
        List<Book> list = (List<Book>)this.BookRepository.findAll(); 
       return list;
    }

    public Book getBookById(int id){

        Book book = null;
        
        try{

           book =  this.BookRepository.findById(id);

        }catch(Exception e){
            e.printStackTrace();
        }
        return book;
    }
   
     public Book addBook(Book b){ 
        Book result=  BookRepository.save(b);
        return result; 
    }

    public void deleteBook(int bid){
        BookRepository.deleteById(bid);
    }

    public void updateBook(Book book, int bookId){
        book.setId(bookId);

        BookRepository.save(book); 
    }

}
