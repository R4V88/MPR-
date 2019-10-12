package rafal.ksiegarnia.demo.services;

import org.springframework.stereotype.Service;
import rafal.ksiegarnia.demo.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServices {

    List<Book> books = new ArrayList<>();

    Book book_1 = new Book(1, 123, "Lord Of The Rings", "Tolkien");
    Book book_2 = new Book(2, 124, "Tak", "Nie");

    public List<Book> getBooks() {
        books.add(book_1);
        books.add(book_2);
        return books;
    }

}
