package com.library;
public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(String title) {
        Book book = new Book(title);
        bookRepository.save(book);
    }
}
