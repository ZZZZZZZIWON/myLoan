package kr.ac.kopo.myloan.dao;

import kr.ac.kopo.myloan.model.Book;

import java.util.List;

public interface BookDao {
    List<Book> selectList();

    Book select(Long bookId);

    void add(Book book);

    void update(Book book);

    void delete(Long bookId);
}
