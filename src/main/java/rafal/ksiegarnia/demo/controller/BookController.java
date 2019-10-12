package rafal.ksiegarnia.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
