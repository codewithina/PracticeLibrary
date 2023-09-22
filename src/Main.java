import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        // ************* TEST BOOKS *************
        ArrayList<Book> allBooks = new ArrayList<>();
        Book one = new Book("Musse & Helium", "Camilla Brinck", 2023, 1.0);
        Book two = new Book("Dinosauriemysteriet", "Martin Widmark", 2001, 2.3);
        Book three = new Book("Känsloboken", "Reyhaneh Ahangaran", 2007, 1.2);
        Book four = new Book("Så funkar det!", "Conrad Mason", 2018, 1.1);
        Book five = new Book("Handbok för superhjältar", "Elias Våhlund", 2019, 3.0);
        allBooks.add(one);
        allBooks.add(two);
        allBooks.add(three);
        allBooks.add(four);
        allBooks.add(five);

        System.out.println("- - - - WELCOME TO THE LIBRARY - - - -");

        while (true) {
            writeOutMenu();
            choice = sc.nextInt();
            sc.nextLine();// Töm inläsning, annars tar med enter

            switch (choice) {
                case 1: // Add a book to the library
                    System.out.println("You want to add a book to the library.\nWhat is the title?");
                    String name = sc.nextLine();
                    System.out.println("Who is the author?");
                    String author = sc.nextLine();
                    System.out.println("What year was the book published?");
                    int year = sc.nextInt();
                    System.out.println("Which version is it?");
                    double version = sc.nextDouble();
                    Book a = new Book(name, author, year, version);
                    allBooks.add(a);
                    break;

                case 2: // Search for a book by name
                    System.out.println("What book are you looking for?");
                    String searchName = sc.nextLine();
                    for (Book books : allBooks) {
                        if (books.getName().contains(searchName)) {
                            System.out.println("\n" + books.toString());
                            System.out.println("Enter YES if you want to loan this book, otherwise enter NO.");
                            String loanBook = sc.nextLine();
                            if (loanBook.equalsIgnoreCase("yes")) {
                                books.setAvailable(false);
                                System.out.println("The book is now loaned, happy reading!");
                            } else if (loanBook.equalsIgnoreCase("no")) {
                                System.out.println("OK, choose what you want to do in the menu.\n");
                            } else {
                                System.out.println("Invalid input, try again.\n");
                            }
                        }
                    }
                    break;

                case 3: // List all available books
                    for (Book books : allBooks) {
                        if (books.getAvailable()) {
                            System.out.println(books);
                        }
                    }
                    break;

                case 4: // Return a book
                    System.out.println("What book do you want to return?");
                    String returnName = sc.nextLine();
                    for (Book books : allBooks) {
                        if (books.getName().contains(returnName)) {
                            books.setAvailable(true);
                            System.out.println("Boken är nu återlämnad, tack! \n");
                        }
                    }
                    break;

                case 5: // Quit
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    static void writeOutMenu() {

        System.out.println("""
                |  Please pick a number in the menu: |
                |                                    |
                |   [1] Add a book to the library    |
                |   [2] Search for a book by name    |
                |   [3] List all available books     |
                |   [4] Return a book                |
                |   [5] Quit                         |""");

    }

}