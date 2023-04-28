package com.api.book.bootrestbook.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Component 
public class BookService {

    //8. humne jo dao mai banaye tha uska object chahiye, isko autowire karenge to iske object apne aap yaha ajayega
    
    @Autowired
    private BookRepository BookRepository;
   
    //7. iss list ki jarurat nhi hai to comment krdo
    // private static List<Book> list = new ArrayList<>();
    
    // static{

    //      list.add( new Book(12, "Java Complete Reference", "XYZ"));
    //      list.add( new Book(36, "Think Java", "abc"));
    //      list.add( new Book(45, " Head first to Java", "lmn"));
    // }
    
    public List<Book> getAllBook(){
        List<Book> list = (List<Book>)this.BookRepository.findAll(); //9.yeh ek iterable dega, isko typecast karenge list mai
        return list;
    }

    //10. 
    public Book getBookById(int id){

        Book book = null;
        
        try{

           book =  this.BookRepository.findById(id);

        }catch(Exception e){
            e.printStackTrace();
        }
        return book;
    }

    //11.
     public Book addBook(Book b){ 
        Book result=  BookRepository.save(b);
        return result; 
    }

    public void deleteBook(int bid){
        BookRepository.deleteById(bid);
    }

    public void updateBook(Book book, int bookId){
        //13. agar yeh bookId new id hai to usko book mai dal denge
        book.setId(bookId);

        BookRepository.save(book); //12. save aur update same hi kam krta hai
        //book ko update krdega
    }

}
