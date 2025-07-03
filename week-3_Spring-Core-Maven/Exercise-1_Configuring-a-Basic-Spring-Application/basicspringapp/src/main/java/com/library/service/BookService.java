package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("Calling service to display books...");
        bookRepository.fetchBookDetails();
    }
}
