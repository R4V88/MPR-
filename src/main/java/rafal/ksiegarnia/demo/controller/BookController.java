package rafal.ksiegarnia.demo.controller;

import org.springframework.web.bind.annotation.*;
import rafal.ksiegarnia.demo.model.Book;
import rafal.ksiegarnia.demo.services.BookServices;

import java.util.List;

@RequestMapping("/Book")
@RestController
public class BookController {
    private final BookServices bookServices;

    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @GetMapping("/all")
    public List<Book> getBooks() {
        return bookServices.getBooks();
    }

    @GetMapping("/add")
    public Book getBook() {
        Book book = new Book(2,007,"Nowa książka", "On jest autorem");
        return bookServices.save(book);
    }

    @DeleteMapping ("/Book/{id}")
    public void deleteBook(@PathVariable("id") int id) {
        bookServices.delete(id);
    }

    @GetMapping("/Book/{id}")
    private Book getBook(@PathVariable("id") int id) {
        return bookServices.getBoookById(id);
    }
}
