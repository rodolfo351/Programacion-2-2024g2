package PROR;

import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;
    private List<Book> books;

    
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        this.books.add(book);
    }

  
    public void addBook(String title, double price) {
        Book newBook = new Book(title, this, price); 
        this.books.add(newBook);
    }

    public List<Book> getBooks() {
        return books;
    }

   
    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private Author author;
    private double price;

    
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    public void getInfo() {
        System.out.println("Título: " + this.title);
        System.out.println("Autor: " + this.author.getName()); 
        System.out.println("Precio: " + this.price);
    }

    
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
