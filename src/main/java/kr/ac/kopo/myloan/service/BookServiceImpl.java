package kr.ac.kopo.myloan.service;

import kr.ac.kopo.myloan.dao.BookDao;
import kr.ac.kopo.myloan.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookDao bookDao;
    @Override
    public List<Book> selectList() {
        return bookDao.selectList();
    }

    @Override
    public Book select(Long bookId) {
        return bookDao.select(bookId);
    }

    @Override
    public void add(Book book) {
        bookDao.add(book);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public void delete(Long bookId) {
        bookDao.delete(bookId);
    }
}
