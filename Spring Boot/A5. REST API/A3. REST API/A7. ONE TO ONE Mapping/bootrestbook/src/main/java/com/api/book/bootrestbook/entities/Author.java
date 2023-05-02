package com.api.book.bootrestbook.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//5. jab book ki id, title save hoga to hume Author bhi sathme save krna hai so iss Author ko bhi @Entity mark pdega
@Entity //6. @Table(name= "authors") //apne yaha nam nhi diya to bydefault "Author" hojayega name
public class Author {
    //2. author ke pas kya hoga hum yaha explicitely bta skte hai

    //7. isko primary ke banayenge aur yeh automatically update honi chahiye
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;

    //8. 
    @Column(name="first_name")
    private String firstName;
    private String lastName;

    //9. main bat yeh hai ki yeh Author.jav class Book.java mai declare kiye hue author se mapped kaise hai
    //obvious bat hai ek book ke pas ek hi author hoga to mai yaha bat krne wala hu one-to-one relationship
    //open Book.java aur author ko oneToone declare karo

    //3. aap is author ke andar aur koi non primitive datatype rakh skte ho like Language
    //private Language language ;
    private String language;

    //4. getter setters etc add krdo
    public int getAuthorId() {
        return authorId;
    }
    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", firstName=" + firstName + ", lastName=" + lastName + ", language="
                + language + "]";
    }
    public Author(int authorId, String firstName, String lastName, String language) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
    }

    public Author(){
        
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    
}
