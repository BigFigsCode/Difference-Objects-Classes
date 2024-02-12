// Book.java
public class Book {
    // Class variables (properties)
    String title;
    String author;

    // Constructor to initialize a new Book object
    public Book(String title, String author) {
        this.title = title; // Assign the class variable 'title' from the parameter 'title'
        this.author = author; // Assign the class variable 'author' from the parameter 'author'
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book: " + title + " by " + author);
    }
}
