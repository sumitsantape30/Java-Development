package com.api.book.bootrestbook.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bootrestbook.entities.Book;

//5. yeh crudrepository ko extend karega
public interface BookRepository extends CrudRepository<Book, Integer> { //yeh Book type ka database handle krega, aur uski id Integer type ki hai

    public Book findById(int id);
    //6. iss repository ko hume use krna hai humari service mai. hum fake service use krhe the na to ab actual yeh functions use krne hai
}
