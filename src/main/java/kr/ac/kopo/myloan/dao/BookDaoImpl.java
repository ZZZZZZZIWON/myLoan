package kr.ac.kopo.myloan.dao;

import kr.ac.kopo.myloan.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    SqlSession sql;

    @Override
    public List<Book> selectList() {
        return sql.selectList("book.list");
    }

    @Override
    public Book select(Long bookId) {
        return sql.selectOne("book.select", bookId);
    }

    @Override
    public void add(Book book) {
        sql.insert("", book);
    }

    @Override
    public void update(Book book) {
        sql.update("book.update",book);

    }

    @Override
    public void delete(Long bookId) {
        sql.delete("book.update", bookId);
    }
}
