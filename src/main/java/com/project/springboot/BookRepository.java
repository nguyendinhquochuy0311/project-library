package com.project.springboot;

import com.project.springboot.entity.Book;
import com.project.springboot.entity.Manage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByBookName(String bookName);

    List<Book> findByWriter(String writer);


    @Query(value = "SELECT * FROM book where book_name like %:bookName%", nativeQuery = true)
    List<Book> findByBookName1(@Param("bookName") String bookName);

    @Query(value = "SELECT * FROM book where writter like %:writer%", nativeQuery = true)
    List<Book> findWriter(@Param("writer") String writer);

    @Query(value = "SELECT * FROM book", nativeQuery = true)
    List<Book> findByBookNameAll();

}
