package com.example.library;
public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void displayBook() {
        System.out.println("Book Title: " + bookRepository.getBookTitle());
    }
}
