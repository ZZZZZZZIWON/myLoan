package kr.ac.kopo.myloan.service;

import kr.ac.kopo.myloan.model.Book;

import java.util.List;

public interface BookService {
    List<Book> selectList();

    Book select(Long bookId);

    void add(Book book);

    void update(Book book);

    void delete(Long bookId);
}
