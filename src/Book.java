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

    public String getName() {
        return name;
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
