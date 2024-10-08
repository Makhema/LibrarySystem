package Lib.Syst;

import java.util.Scanner;

public class LibraryMenu {
    private Library library;
    private Scanner input;

    // Constructor to initialize the LibraryMenu with a Library instance and Scanner
    public LibraryMenu(Library library) {
        this.library = library;
        this.input = new Scanner(System.in); // Scanner for user input
        showMenu(); // Call the menu method to start
    }

    // Method to display the menu and handle user choices
    public void showMenu() {
        int choice; // To store user's menu choice

        do {
            // Displaying the menu
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add a new book");
            System.out.println("2. View all books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Search for a book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            
            choice = input.nextInt(); // Get user's choice
            input.nextLine(); // Consume the newline character after the integer input

            switch (choice) {
                case 1:
                    // Add a new book to the library
                    library.addBook(); // Call updated method
                    break;
                case 2:
                    // Display all the books in the library
                    library.displayBooks();
                    break;
                case 3:
                    // Borrow a book by ISBN
                    System.out.print("Enter the ISBN of the book you want to borrow: ");
                    int borrowISBN = input.nextInt();
                    library.borrowBook(borrowISBN); // Pass the ISBN directly
                    break;
                case 4:
                    // Return a borrowed book by ISBN
                    System.out.print("Enter the ISBN of the book you want to return: ");
                    int returnISBN = input.nextInt();
                    library.returnBook(returnISBN); // Pass the ISBN directly
                    break;
                case 5:
                    // Search for a book by title or author
                    library.searchBook();
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                default:
                    // If the user enters an invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6); // Continue until the user chooses to exit

        input.close(); // Close the scanner
    }
}
