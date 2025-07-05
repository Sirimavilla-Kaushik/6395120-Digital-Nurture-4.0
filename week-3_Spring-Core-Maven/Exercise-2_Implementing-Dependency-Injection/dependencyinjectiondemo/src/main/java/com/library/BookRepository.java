package com.library;
public class BookRepository {
    public void save(Book book) {
        System.out.println("Book saved: " + book.getTitle());
    }
}
