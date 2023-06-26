package com.polar.bookshop.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("The book wiht the ISBN " + isbn + " was not found.");
    }
}
