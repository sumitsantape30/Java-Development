package com.api.book.bootrestbook.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.book.bootrestbook.Services.BookService;
import com.api.book.bootrestbook.entities.Book;

@RestController
public class BookController {

    @Autowired 
    private BookService bookService;
    
   @GetMapping("/books")  //aur jab method GET aur /books hoga to yeh method chalega
    public List<Book> getBooks(){ 
       return this.bookService.getAllBook();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

    //2. post mapping use karenge
    @PostMapping("/books") // jab method Post aur /books hoga to yeh method chalega
    public Book addBook(@RequestBody Book book){ //jo data arha hai use Book ke object mai convert karega
          // jo user se data JSON mai arha hoga woh yeh annotation @RequestBody usko iss Book wale object mai dal dega
       Book b =  this.bookService.addBook(book);
       return b;
    }

}
