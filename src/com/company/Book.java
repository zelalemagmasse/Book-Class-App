package com.company;

public class Book {
    private String title;
    private String author;
    private String discription;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    private boolean isInStock;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String discription, double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.discription = discription;
        this.price = price;
        this.isInStock = isInStock;
    }

    public Book(String title, String author, String discription, double price) {
        this.title = title;
        this.author = author;
        this.discription = discription;
        this.price = price;

    }

    public Book(String title, String author, String discription) {
        this.title = title;
        this.author = author;

        this.discription = discription;
    }

    public Book(String title) {
        this.title = title;
    }
    public void getDisplayText(){
        System.out.printf("Ther Title of the Book is %s %n The Author of the book is %s%n The discription about the book is %s",this.title,this.author,this.discription);
    }
}
