package com.api.book.bootrestbook.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.Services.BookService;
import com.api.book.bootrestbook.entities.Book;

//@Controller  //5. agar normal mvc mai kam krhe ho aur apko normal response dena hoga to aap simply controller use kr skte ho but for REST Api you have to use rest controller
@RestController
public class BookController {

    //15. 
    @Autowired //autowire uske object banake yaha del dega
    private BookService bookService;
    
    //1.controller ke andar apko url banane keliye handler method banana pdta hai aur woh return krta hai string
    //@RequestMapping(value="/books", method = RequestMethod.GET) //2. client /books se request marega to get all the books.     //@ResponseBody //3. yeh as it is string chala jayega. yeh html output nhi dega kyuki humne ResponseBody likha hai isliye yahi output dega. hume json mai output dena hai
    //6. RequestMapping mai apko barbar method btana padega isliye @GetMapping annotation use kr skte hai.
    @GetMapping("/books") //7.aisehi sare functions keliye PostMapping etc hai ab entities folder banake usme Book banao
    public List<Book> getBooks(){ //4. ip/books jab isse match hojayega to iss method ko call karega.
       // return "this is testing book first";

       //8. yahase book ki information send krne keliye book ka object banana padega usse pehle book ki class banani pdegi.
       //10. book ka object banayenge
    //    Book book = new Book();
    //    book.setId(23345);
    //    book.setTitle("Java Complete");
    //    book.setAuthor("XYZ");
    //    return book;
       //11. ab spring automatic apke object ko convert krdega JSON mai
       //Jaction dependency hoti hai woh automatically object ko json mai convert krdega
       ///ab postman mai url dalke send request karoge to JSON format mai output dega
       // books matlab sari book return krni chahiye but abhi database connected nhi hai to hum fake servie create karenge
       //12. folder/package create karo services

       //14.  uss fake service ka object mujhe yaha lana pdega

       return this.bookService.getAllBook();
    }

    //16. single book keliye banayenge
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

}
