package Lib.Syst;

import java.util.Scanner;

public class Book {
    // These are the attributes that represent essential information about a certain book.
    public String Title;
    public String Author;
    public int ISBN;
    boolean IsAvailable;
    
    // This is the no-arguments constructor to initialize the details of the books.
    public Book() 
    {
        // You can choose to initialize attributes directly or through a method.
    	Attributes();
    }
    
    // This is the method to set the attributes.
    public void Attributes() {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi Student! Enter the title of the book:");
        Title = input.nextLine(); // Taking the title of the book as input.
        
        System.out.println("And now enter the author of the book:");
        Author = input.nextLine(); // Taking the name of the author as input.
        
        System.out.println("Enter the ISBN of the book:");
        ISBN = input.nextInt(); // Taking the ISBN as input.
        
        IsAvailable = true; // Initially, the book is available.
        
        
    }
    
    // This is the method to show the information about a book on the screen.
    public void DisplayData() {
        System.out.println(" *************** See the book details below. ************** ");
        System.out.println("The book title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Status of the book (available): " + IsAvailable);
    }
    
    // This is the method to borrow the book.
    public void borrow() {
        if (IsAvailable) {
            IsAvailable = false;
            System.out.println("You borrowed the book: " + Title);
        } else {
            System.out.println("OOHH SORRY! The book you are borrowing is not available.");
        }
    }
    
    // This is the method to return the book.
    public void returnTheBook() {
        if (!IsAvailable) { // If the book is not available.
            IsAvailable = true;
            System.out.println("Thank you, you returned the book.");
        } else {
            System.out.println("It was not borrowed.");
        }
    }

    // Getter function for the title of the book.
    public String getTitle() {
        return Title;
    }

    // Getter function for the author.
    public String getAuthor() {
        return Author;
    }
}
