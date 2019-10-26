package rafal.ksiegarnia.demo.services;

import org.springframework.stereotype.Service;
import rafal.ksiegarnia.demo.model.Book;
import rafal.ksiegarnia.demo.repository.BookRespository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServices {

    private final BookRespository bookRespository;
    List<Book> books = new ArrayList<>();

    Book book_1 = new Book(1, 123, "Lord Of The Rings", "Tolkien");
    Book book_2 = new Book(2, 124, "Tak", "Nie");

    public BookServices(BookRespository bookRespository) {
        this.bookRespository = bookRespository;
    }

    public List<Book> getBooks() {
        books.add(book_1);
        books.add(book_2);
        return books;
    }

    public Book save (Book book) {
        return bookRespository.save(book);
    }

    public void delete(int id) {
        bookRespository.deleteById(id);
    }

    public Book getBoookById(int id) {
        return bookRespository.findById(id).get();
    }

}
