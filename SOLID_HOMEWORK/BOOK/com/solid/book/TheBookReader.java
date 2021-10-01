package com.solid.book;

import java.util.List;

public class TheBookReader extends Book {

    public TheBookReader(String title, List<String> pages) {
        super(title, pages);
    }

    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}