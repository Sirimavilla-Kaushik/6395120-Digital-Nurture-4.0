package com.example.library;

public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor injection is used.");
        this.bookRepository = bookRepository;
    }
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter injection is used.");
        this.bookRepository = bookRepository;
    }
    public void showBooks() {
        bookRepository.displayBooks();
    }
}
