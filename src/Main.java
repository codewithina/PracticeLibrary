import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
// ************* ALL BOOKS *************
        Book one = new Book("Musse & Helium", "Camilla Brinck", 2023, 1.0);
        Book two = new Book("Dinosauriemysteriet", "Martin Widmark", 2001, 2.3);
        Book three = new Book("Känsloboken", "Reyhaneh Ahangaran", 2007, 1.2);
        Book four = new Book("Så funkar det!", "Conrad Mason", 2018, 1.1);
        Book five = new Book("Handbok för superhjältar", "Elias Våhlund", 2019, 3.0);

        ArrayList<Book> allBooks = new ArrayList<>();
        allBooks.add(one);
        allBooks.add(two);
        allBooks.add(three);
        allBooks.add(four);
        allBooks.add(five);

        System.out.println("- - - - WELCOME TO THE LIBRARY - - - -");

        do {
            writeOutMenu();
            choice = sc.nextLine();
            switch (choice){
                case "1": // Add a book to the library
                    System.out.println("You want to add a book to the library.\nWhat is the title?");
                    String name= sc.nextLine();
                    System.out.println("Who is the author?");
                    String author = sc.nextLine();
                    System.out.println("What year was the book published?");
                    int year = sc.nextInt();
                    System.out.println("Which version is it?");
                    double version = sc.nextDouble();
                    sc.nextLine();  // Töm inläsning, annars enter
                    Book a = new Book(name, author, year, version);
                    allBooks.add(a);
                    break;
                case "2": // Search for a book by name
                    break;
                case "3": // List all available books
                    for (Book books : allBooks) {
                        System.out.println(books);
                    }
                    break;
                case "4": // Return a book
                   /* if (allBooks.get(0)) {

                    } */

                    break;
                case "5": // Quit
                    break;
            }
        }while (!choice.equals("5"));
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