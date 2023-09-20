import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        // ************* ALL BOOKS *************
        Book one = new Book("Musse & Helium", "Camilla Brinck", 2023, 1.0);
        Book two = new Book("World of art", "Ina Burström", 2001, 2.3);
        Book three = new Book("World of art", "Ina Burström", 2007, 1.2);
        Book four = new Book("World of art", "Ina Burström", 2018, 1.1);
        Book five = new Book("World of art", "Ina Burström", 2019, 3.0);

        ArrayList<Book> allBooks = new ArrayList<>();
        allBooks.add(one);
        allBooks.add(two);
        allBooks.add(three);
        allBooks.add(four);
        allBooks.add(five);


        System.out.println("""
                ---------WELCOME TO THE LIBRARY--------
                Please choose one of the five alternatives:
                
                1. Add a book to the library
                2. Search for a book by name
                3. List all available books
                4. Return a book
                5. Quit""");
        do {
            choice = sc.nextLine();
            switch (choice){
                case "1": // Add a book to the library
                    break;
                case "2": // Search for a book by name
                    break;
                case "3": // List all available books
                    for (Book books : allBooks) {
                        System.out.println(books);
                    }
                    break;
                case "4": // Return a book
                    break;
                case "5": // Quit
                    break;
            }
        }while (!choice.equals("5"));
    }
}