package be.intecbrussel;

//import statements


import java.awt.*;
import java.util.Scanner;

public class Book {

    //properties

    private String title = "Unknown";

    private double price = 12.5;

    private boolean isAvailable = false;

    private int stock = 2;


    //constructors (als je geen constructor maakt dan, is er een default constructor)
    //All-args constructor(alle parameters)
    public Book() {
        System.out.println("Book created");
    }

    public Book(String title) {
        this.title = title;
        System.out.println("Book created with 1 parameter");
    }

    public Book(String title, double price, boolean isAvailable) {
        this.price = price;
        this.isAvailable = isAvailable;
        this.title = title;
        System.out.println("All-args constructor");
    }


    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getisAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    // eigen methodes

    public void requestBook(int totalCopies) {
        Scanner scanner = new Scanner(System.in);

        for (int index = 1; index <= totalCopies; index++) {
            System.out.println("Hello, enter title");
            title = scanner.nextLine();
            Book book = new Book(title);
            System.out.println(book);

        }


    }


    //override methodes
    @Override
    public String toString() {
        return "Book { Title: " + title + " Price: " + price + " isAvailable: " + isAvailable + "}";
    }


}
