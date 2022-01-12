package com.sahan.spring.repo;

import com.sahan.spring.entity.BookDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
public interface BookdetailRepo extends JpaRepository<BookDetail , String > {
//    BookDetail findBookDetailByName(String name);
//
//    List<BookDetail> findAllByAuthor(String author);
//
//    BookDetail findCustomerByNameAndAuthor(String name, String author);
//
//    List<BookDetail> findBookDetailByCategory(String category);
}
