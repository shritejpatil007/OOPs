// Identify commonalities and differences between Publication, Book and Magazine 
// classes. Title, Price, Copies are common instance variables and saleCopy is common 
// method. The differences are, Bookclass has author and orderCopies(). Magazine 
// Class has methods orderQty, Current issue, receiveissue().Write a program to find 
// how many copies of the given books are ordered and display total sale of publication

// Base class
class Publication {
    protected String title;
    protected double price;
    protected int copies;

    // Constructor
    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    // Method to sell copies
    public void saleCopy(int quantity) {
        if (quantity <= copies) {
            copies -= quantity;
            System.out.println(quantity + " copies of " + title + " sold.");
        } else {
            System.out.println("Not enough copies available to sell.");
        }
    }

    // Method to get total sales
    public double getTotalSales() {
        return price * (copies);
    }

    // Method to display publication details
    public void displayDetails() {
        System.out.println("Title: " + title + ", Price: " + price + ", Copies Available: " + copies);
    }
}

// Derived class for Book
class Book extends Publication {
    private String author;

    // Constructor
    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    // Method to order copies
    public void orderCopies(int quantity) {
        copies += quantity;
        System.out.println(quantity + " copies of " + title + " ordered.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

// Derived class for Magazine
class Magazine extends Publication {
    private String currentIssue;

    // Constructor
    public Magazine(String title, double price, int copies, String currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    // Method to order quantity
    public void orderQty(int quantity) {
        copies += quantity;
        System.out.println(quantity + " copies of " + title + " ordered.");
    }

    // Method to receive issue
    public void receiveIssue(String issue) {
        currentIssue = issue;
        System.out.println("Received issue: " + currentIssue + " for " + title);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Current Issue: " + currentIssue);
    }
}

// Main class to test the implementation
public class PublicationTest {
    public static void main(String[] args) {
        // Create instances of Book and Magazine
        Book book1 = new Book("Effective Java", 45.00, 10, "Joshua Bloch");
        Magazine magazine1 = new Magazine("National Geographic", 5.00, 20, "January 2023");

        // Display details
        book1.displayDetails();
        magazine1.displayDetails();

        // Order copies
        book1.orderCopies(5);
        magazine1.orderQty(10);

        // Sell copies
        book1.saleCopy(3);
        magazine1.saleCopy(5);

        // Display total sales
        System.out.println("Total sales for " + book1.title + ": $" + book1.getTotalSales());
        System.out.println("Total sales for " + magazine1.title + ": $" + magazine1.getTotalSales());
    }
}