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
    //1. humare pas ResponseEntity krke class hai uske help se hum response bhejte haii. ResponseEntity HTTPEntity ki child class hai.
    

    @Autowired 
    private BookService bookService;
    
    //get all books handler
   @GetMapping("/books")  
    public ResponseEntity<List<Book>> getBooks(){  //4. statuscode bhejne keliye iska return type ResponseEntity karenge. ResponseEntity ke generic type book hai
        //2. yeh sari books return krta hai to agar books present nhi hai to hum status code bhejenge
        //inn sari books ko ek list mai store karenge
        List<Book> books = this.bookService.getAllBook();
        if( books.size() <= 0){ //3. books ka size 0 hai books nhi mili to statuscode return karenge
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); //yeh build method puri responseEntity ko bana dega
        }
       return ResponseEntity.of(Optional.of(books)); //5. isme optional list pass krni pdegi. yeh apki list ko OK statuscode ke sath leke jayega
    }

    //get a book by id handler
    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id){ //7. return type ke andar single book rakhenge kyuki yeh single method pass krha hai
        //6. 
        Book book = bookService.getBookById(id);
        if( book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    } //8. agar user ne aisi id ki book mangi jo exist hi nhi krti to woh exception throw karega to hume exception handle krna pdega.
    //getBookById exception throw karega so open BookService

    //add new book handler
    // 11. yaha bhi exception handle karenge
    @PostMapping("/books") 
    public ResponseEntity<Book> addBook(@RequestBody Book book){ 
        //12. 
       Book b = null;

       try{
         b =  this.bookService.addBook(book);
         System.out.println(book);
         return ResponseEntity.status(HttpStatus.CREATED).build();

       }catch(Exception e){

        //13. exception aayi internal server error bhej denge

         e.printStackTrace();
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }

    //14. isme bhi exception handle karo
    // delete book handler
    @DeleteMapping("/books/{bookId}")
    public ResponseEntity<Void> deleteBook( @PathVariable("bookId") int booktId){ //return type sahise kre

        try{
            this.bookService.deleteBook(booktId); 
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); //NO_CONTENT matlab delete kiya to bas 202 or 404 dedega
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();//agar delete krte samay kuch error agyi to yahase internal server bhej denge
        }
        //agar kuch gadbad hoti hai to console pe ajayega
    }
    
    //15. 
    //update book handler
    @PutMapping("/books/{bookId}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int booktId){ 
        try{ //sabkuch sahi hua to OK return krdenge
            this.bookService.updateBook(book, booktId);
            return ResponseEntity.ok().body(book);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
