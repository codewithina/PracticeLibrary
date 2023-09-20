import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";

        ArrayList<Book> allBooks = new ArrayList<>();

        System.out.println("- - - - WELCOME TO THE LIBRARY - - - -");
        writeOutMenu();

        do {
            choice = sc.nextLine();
            switch (choice) {
                case "1": // Add a book to the library
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
                    writeOutMenu();
                    break;
                case "2": // Search for a book by name
                    writeOutMenu();
                    break;
                case "3": // List all available books
                    for (Book books : allBooks) {
                        System.out.println(books);
                    }
                    writeOutMenu();
                    break;
                case "4": // Return a book
                    writeOutMenu();
                    break;
                case "5": // Quit
                    writeOutMenu();
                    break;
            }
        } while (!choice.equals("5"));
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