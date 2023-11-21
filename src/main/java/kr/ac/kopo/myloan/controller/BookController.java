package kr.ac.kopo.myloan.controller;

import jdk.javadoc.doclet.Reporter;
import kr.ac.kopo.myloan.model.Book;
import kr.ac.kopo.myloan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> selectList() {
        List<Book> bookList = bookService.selectList();
        return ResponseEntity.ok(bookList);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> select(@PathVariable Long bookId) {
        Book book = bookService.select(bookId);
        if(book != null) {
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Book> add(@RequestBody Book book) {
        bookService.add(book);
        return ResponseEntity.ok(book);
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<Book> update(@PathVariable Long bookId, @RequestBody Book book) {
        book.setBookId(bookId);
        bookService.update(book);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<Book> delete(@PathVariable Long bookId) {
        bookService.delete(bookId);
        return ResponseEntity.ok().build();
    }

}
