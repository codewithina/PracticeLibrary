import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Book> allBooks = new ArrayList<>();


    public Library() {
        System.out.println("- - - - WELCOME TO THE LIBRARY - - - -");
    }

    public void writeOutMenu() {
        System.out.println("""
                |  Please pick a number in the menu: |
                |                                    |
                |   [1] Add a book to the library    |
                |   [2] Search for a book by name    |
                |   [3] List all available books     |
                |   [4] Return a book                |
                |   [5] Quit                         |""");
    }

    public void addBookToLibrary() {
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

    }

    public void searchBook() {
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
    }

    public void listAvailableBooks() {
        for (Book books : allBooks) {
            if (books.getAvailable()) {
                System.out.println(books);
            }
        }
    }
    public void returnBook(){
        System.out.println("What book do you want to return?");
        String returnName = sc.nextLine();
        for (Book books : allBooks) {
            if (books.getName().contains(returnName)) {
                books.setAvailable(true);
                System.out.println("Boken är nu återlämnad, tack! \n");
            }
        }
    }

}
