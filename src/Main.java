import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library myLibrary = new Library();
        int choice;

        // ********************* TEST BOOKS ************************

        myLibrary.allBooks.add(new Book("Musse & Helium", "Camilla Brinck", 2023, 1.0));
        myLibrary.allBooks.add(new Book("Dinosauriemysteriet", "Martin Widmark", 2001, 2.3));
        myLibrary.allBooks.add(new Book("Känsloboken", "Reyhaneh Ahangaran", 2007, 1.2));
        myLibrary.allBooks.add(new Book("Så funkar det!", "Conrad Mason", 2018, 1.1));
        myLibrary.allBooks.add(new Book("Handbok för superhjältar", "Elias Våhlund", 2019, 3.0));

        // **********************************************************


        while (true) {
            myLibrary.writeOutMenu();
            choice = sc.nextInt();
            sc.nextLine();// Töm inläsning, annars tar med enter

            switch (choice) {
                case 1: // Add a book to the library
                    myLibrary.addBookToLibrary();
                    break;

                case 2: // Search for a book by name
                    myLibrary.searchBook();
                    break;

                case 3: // List all available books
                    myLibrary.listAvailableBooks();
                    break;

                case 4: // Return a book
                    myLibrary.returnBook();
                    break;

                case 5: // Quit
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}