package com.company.ClassesAndObjects;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    private static boolean checkIsbn(String isbn) {
        for (char digit : isbn.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false;
            }
        }
        return true;
    }

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Book obj) {
        return isbn.compareTo(obj.isbn);
    }

    @Override
    public Book clone() {
        try {
            Book result = (Book) super.clone();
            result.title = new String(title);
            result.author = new String(author);
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int hashCode() {
        int result = 0;
        result += title.hashCode();
        result += author.hashCode();
        result += price;
        result += edition;
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Book))
            return false;
        boolean titleEquals = title.equals(((Book) (object)).title),
                authorEquals = author.equals(((Book) (object)).author),
                priceEquals = price == ((Book) (object)).price,
                isbnEquals = isbn.equals(((Book) (object)).isbn);
        return titleEquals && authorEquals && priceEquals && isbnEquals;
    }

    @Override
    public String toString() {
        return "Book title: " + title +
                "\nAuthor: " + author +
                "\nPrice: " + price +
                "\nEdition: " + edition;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        if (edition <= 0)
            throw new RuntimeException("Edition cannot be non-positive!");

        Book.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}

