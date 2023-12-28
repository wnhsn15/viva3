/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wanab
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
   
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
