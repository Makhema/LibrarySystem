package Lib.Syst;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    // This ArrayList that will store the books in the Library.
    private ArrayList<Book> books;
    private static Scanner input = new Scanner(System.in);
    
    // No-args Constructor.
    public Library() {
        books = new ArrayList<Book>();
    }
    
    // This is the method to add the book into the library.
    public void addBook() {
        Book newBook = new Book();
        newBook.Attributes(); // Call the Attributes method to set book details
        books.add(newBook);
        System.out.println("The book is now booked!");
    }
    
    // This is the method that will display all the books in the library.
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found in the library.");
        }
        
        for (Book book : books) {
            book.DisplayData();
            System.out.println(" *********** *********** *************");
        }
    }
    
    // Method to borrow a book by ISBN.
    public void borrowBook(int ISBN) {
        for (Book book : books) {
            if (book.ISBN == ISBN) {
                book.borrow();
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }
    
    // Method to return a book by ISBN.
    public void returnBook(int ISBN) {
        for (Book book : books) {
            if (book.ISBN == ISBN) {
                book.returnTheBook();
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }
    
    public void searchBook() {
        System.out.print("Enter the title or author to search for: ");
        String searchQuery = input.nextLine(); // Read the full line as search query

        boolean found = false;
        for (Book book : books) {
            // Check if the search query matches either the title or the author (ignoring case)
            if (book.getTitle().equalsIgnoreCase(searchQuery) || book.getAuthor().equalsIgnoreCase(searchQuery)) {
                book.DisplayData(); // Display the book details if a match is found
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with the title or author: " + searchQuery);
        }
    }
}
