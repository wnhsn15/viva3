
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wanab
 */
public class Library {
    private ArrayList <Book> bookCollection;
    
    public Library(){
        this.bookCollection = new ArrayList<>();
    }
    
    public void addBook(Book book){
        bookCollection.add(book);
    }
    
    public void removeBook(String ISBN){
        Iterator<Book> iterator = bookCollection.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN().equals(ISBN)){
                iterator.remove();
                System.out.println("Book removed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " was not found");
    }
    
    public void searchTitle(String title){
        int bookCount = 0;
        for (Book book : bookCollection){
            if (book.getTitle().equalsIgnoreCase(title)){
                System.out.println("Book found: " + "\n- Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nISBN: " + book.getISBN());
            } else {
                bookCount++;
                if (bookCount == bookCollection.size()){
                    System.out.println("Sorry, this book cannot be found.");
                }
            }
        }
    }
    
    public void searchAuthor(String author){
        int authorCount = 0;
        for (Book book : bookCollection){
            if (book.getAuthor().equalsIgnoreCase(author)){
                authorCount++;
                if (authorCount == 1){
                System.out.println("Books by author: " + book.getAuthor());
                }
                System.out.println("- Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nISBN: " + book.getISBN() + "\n");
            } else{
                authorCount++;
                if (authorCount == 1)
                System.out.println("Sorry, this is author cannot be found.");
            }
        }
    }
    public boolean ifCanBorrow(String ISBN){
        int lastTwoDigits = Integer.parseInt(ISBN.substring(ISBN.length() - 2));
        if (isPrime(lastTwoDigits)) {
        return false;
    } else {
        return true;
    }
}

    private boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0){
            return false;
        }
    }return true;
}
    
    public void sortByTitle(){
        Collections.sort(bookCollection, Comparator.comparing(Book::getTitle));
        for (Book book : bookCollection) {
            System.out.println("- Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nISBN: " + book.getISBN() + "\n");
        }
    }
    
    public void displayBooks(){
        for (Book book : bookCollection) {
            System.out.println("- Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nISBN: " + book.getISBN() + "\n"); 
        }
    }
}

