
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wanab
 */
public class vivaQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        String title, author, ISBN;
        Library hogwartsLibrary = new Library();
        
        Book book1 = new Book("The Standard Book of Spells", "Miranda Goshawk", "9452297");
        Book book2 = new Book("Advanced Potion-Making", "Libatius Borage", "4826972");
        Book book3 = new Book("Fantastic Beasts and Where to Find Them", "Newt Scamander", "1564815");
        Book book4 = new Book("The Dark Forces: A Guide to Self-Protection", "Quirinus Quirrell", "1891568");
        Book book5 = new Book("Forbidden Spells", "Salazar Slytherin", "7134567");
        Book book6 = new Book("Cooking the Muggle Way", "Mordicus Egg", "6385124");
        Book book7 = new Book("Goshawk's Guide to Herbology", "Miranda Goshawk", "8823541");
        
        hogwartsLibrary.addBook(book1);
        hogwartsLibrary.addBook(book2);
        hogwartsLibrary.addBook(book3);
        hogwartsLibrary.addBook(book4);
        hogwartsLibrary.addBook(book5);
        hogwartsLibrary.addBook(book6);
        hogwartsLibrary.addBook(book7);
        
        System.out.println("Welcome! Select what to do: \n1 (Search by author)\n2 (Search by title)\n3 (Sort books in the library)\n4 (Borrow a book)\n5 (Exit)");
        num = input.nextInt();
        
        switch (num){
                case 1:
                    input.nextLine();
                    System.out.println("Please enter author's name: ");
                    author = input.nextLine();
                    System.out.println("Searching for books by author...");
                    hogwartsLibrary.searchAuthor(author);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Please enter book title: ");
                    title = input.nextLine();
                    System.out.println("Searching for books by title...");
                    hogwartsLibrary.searchTitle(title);
                    break;
                case 3:
                    System.out.println("\nSorted books in the library:");
                    hogwartsLibrary.sortByTitle();
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("Please enter book's ISBN: ");
                    ISBN = input.nextLine();
                    hogwartsLibrary.ifCanBorrow(ISBN);
                    if (true){
                        System.out.println("You've borrowed a book!");
                        hogwartsLibrary.removeBook(ISBN);
                        System.out.println("Updated library: ");
                        hogwartsLibrary.sortByTitle();
                    } else{
                        System.out.println("Sorry, this book is not available for borrowing.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter the proper number");
                    return;
        }
    }
}
