package com.polar.bookshop.exception;

public class BookAlreadyExistException extends RuntimeException{
    public BookAlreadyExistException(String isbn) {
        super("Book with ISBN " + isbn + " already exists.");
    }
}
