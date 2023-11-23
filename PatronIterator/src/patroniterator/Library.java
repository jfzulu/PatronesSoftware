/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroniterator;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    
    public void addFictionBook(FictionBook fictionBook) {
        books.add(fictionBook);
    }
    public BookIterator createIterator() {
        return new LibraryIterator();
    }

    private class LibraryIterator implements BookIterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }

        @Override
        public Book next() {
            if (hasNext()) {
                return books.get(currentIndex++);
            }
            return null;
        }
    }
}

