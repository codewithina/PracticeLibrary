import java.util.Scanner;

public class Book {
    private String name;
    private String author;
    private int year;
    private double version;
    private boolean available;

    public Book(String name, String author, int year, double version) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.version = version;
        this.available = true;
    }

    public void loanBook() {
        this.available = false;
    }

    public void returnBook() {
        if (!available) {
            this.available = true;
            System.out.println("Your book is returned, thank you!");
        }
        System.out.println("Something wet wrong, try again.");
        ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return "  " + this.name.toUpperCase() +
                "\n| Author: " + this.author +
                "\n| Publication: " + this.year +
                "\n| Edition: " + this.version +
                "\n| Available: " + this.available + "\n";
    }
}
