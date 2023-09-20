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
    //TO DO: getter & setter för availability

    public String toString(){
        return "Title: " + this.name +
                "\nAuthor: " + this.author +
                "\nPublication year: " + this.year +
                "\nVolume: " + this.version +
                "\nAvailable: " + this.available + "\n";
    }

}
