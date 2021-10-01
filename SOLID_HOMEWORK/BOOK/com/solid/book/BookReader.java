package com.solid.book;


import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        TheBookReader book = new TheBookReader("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
