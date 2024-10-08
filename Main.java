import Lib.Syst.*;

public class Main {
    // This is the main method where the library system will be run.
    public static void main(String[] args) {
        Library library = new Library(); // Create an instance of the Library class
        new LibraryMenu(library); // Pass the library to the LibraryMenu
    }
}
