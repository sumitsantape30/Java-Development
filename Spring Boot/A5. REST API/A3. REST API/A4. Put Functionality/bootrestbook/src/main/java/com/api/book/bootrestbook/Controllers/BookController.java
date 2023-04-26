package com.api.book.bootrestbook.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    
    //get all books handler
   @GetMapping("/books")  
    public List<Book> getBooks(){ 
       return this.bookService.getAllBook();
    }

    //get a book by id handler
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

    //add new book handler
    @PostMapping("/books") 
    public Book addBook(@RequestBody Book book){ 
       Book b =  this.bookService.addBook(book);
       return b;
    }

    // delete book handler
    @DeleteMapping("/books/{bookId}")
    public void deleteBook( @PathVariable("bookId") int booktId){ //2. jo bhi data ayega woh hume simply is bookId variable mai mil jayega

        this.bookService.deleteBook(booktId); //3. ab BookService mai deleteBook method define krni pdegi

    }

    //1.update(put) the book handler
    //kis book ko update krna hai iske liye user se id lenge.
    @PutMapping("/books/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable("bookId") int booktId){ // updated book ki information wapas bhej denge. aur input mai id ke sath naye book ki information bhi arhi hogi to usko book variable mai lenge. @RequestBody is used to convert in json format.

        this.bookService.updateBook(book, booktId);
        //2. Bookservie mai yeh function banao
        return book;
    }

}
