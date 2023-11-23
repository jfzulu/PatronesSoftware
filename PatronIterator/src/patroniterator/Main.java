/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patroniterator;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Crear algunos libros
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides");
        Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt, David Thomas");
        FictionBook fictionBook1 = new FictionBook("Harry Potter", "J.K. Rowling", "Fantasy");
        FictionBook fictionBook2 = new FictionBook("The Hobbit", "J.R.R. Tolkien", "Adventure");

        // Crear una biblioteca y agregar libros
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addFictionBook(fictionBook1);
        library.addFictionBook(fictionBook2);

        // Crear un iterador y recorrer la biblioteca
        BookIterator iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book currentBook = iterator.next();
            System.out.println("Book: " + currentBook);
        }
    }
}
