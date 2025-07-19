package EncapsulationAndAbstraction;

import java.util.Scanner;

class Writer {
    private String name;
    private String email;
    private char gender;

    public Writer(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
    	return name; 
    	}
    public String getEmail() {
    	return email; 
    	}
    public char getGender() {
    	return gender; 
    	}
}

class Book {
    private String name;
    private Writer writer;
    private double price;
    private int qtyInStock;

    public Book(String name, Writer writer, double price, int qtyInStock) {
        this.name = name;
        this.writer = writer;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
    	return name;
    	}
    public Writer getWriter() { 
    	return writer; 
    	}
    public double getPrice() { 
    	return price; 
    	}
    public int getQtyInStock() {
    	return qtyInStock;
    	}

    public void setName(String name) {
    	this.name = name; 
    	}
    public void setPrice(double price) { 
    	this.price = price; 
    	}
    public void setQtyInStock(int qtyInStock) {
    	this.qtyInStock = qtyInStock; 
    	}
    public void displayDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Author Name: " + writer.getName());
        System.out.println("Writer Email: " + writer.getEmail());
        System.out.println("Writer Gender: " + writer.getGender());
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + qtyInStock);
    }
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Writer name: ");
        String writerName = sc.nextLine();

        System.out.print("Enter Writer email: ");
        String email = sc.nextLine();

        System.out.print("Enter writer gender: ");
        char gender = sc.next().charAt(0);
        sc.nextLine(); 

        Writer writer = new Writer(writerName, email, gender);

        System.out.print("Enter book name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity in stock: ");
        int qty = sc.nextInt();

        Book book = new Book(bookName, writer, price, qty);

        System.out.println("\n Book Details");
        book.displayDetails();

        sc.close();
   }

}
		        