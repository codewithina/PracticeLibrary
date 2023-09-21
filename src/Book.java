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

    //TO DO: metod loanBook = tillgänglig bok eller ej? true/false
    //TO DO: metod returnBook = när bok lämnas tillbaka, ändra tillgänglighet till true
    //TO DO: getter & setter för availability??

    public String toString(){
        return "Title: " + this.name +
                "\nAuthor: " + this.author +
                "\nPublication year: " + this.year +
                "\nVolume: " + this.version +
                "\nAvailable: " + this.available + "\n";
    }

    public boolean returnBook() {
        // kolla om boken ej är tillgänglig, och är det så ändras allt till true
        if(!available) {
            this.available = true;
            return true;
        }
        return false;
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
}
