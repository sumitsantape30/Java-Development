package com.api.book.bootrestbook.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.Services.BookService;
import com.api.book.bootrestbook.entities.Book;

@RestController
public class BookController {
    
    @Autowired 
    private BookService bookService;
    
   @GetMapping("/books")  
    public ResponseEntity<List<Book>> getBooks(){  
        List<Book> books = this.bookService.getAllBook();
        if( books.size() <= 0){ 
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); 
        }
       return ResponseEntity.status(HttpStatus.CREATED).body(books); 
    }

    //get a book by id handler
    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id){ 

        Book book = bookService.getBookById(id);
        if( book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    } 

    @PostMapping("/books") 
    public ResponseEntity<Book> addBook(@RequestBody Book book){ 

        try{
         this.bookService.addBook(book);
         System.out.println(book);
         return ResponseEntity.status(HttpStatus.CREATED).build();
         
       }catch(Exception e){

         e.printStackTrace();
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @DeleteMapping("/books/{bookId}")
    public ResponseEntity<Void> deleteBook( @PathVariable("bookId") int booktId){ 

        try{
            this.bookService.deleteBook(booktId); 
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); 
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @PutMapping("/books/{bookId}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int booktId){ 
        try{ 
            this.bookService.updateBook(book, booktId);
            return ResponseEntity.ok().body(book);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
