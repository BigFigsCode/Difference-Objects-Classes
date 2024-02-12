// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating objects of the Book class
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("1984", "George Orwell");

        // Calling a method on the book1 object
        book1.displayDetails(); // Displays: Book: The Alchemist by Paulo Coelho

        // Calling a method on the book2 object
        book2.displayDetails(); // Displays: Book: 1984 by George Orwell
    }
}
