package com.sahan.spring.repo;


import com.sahan.spring.entity.BookDetailV2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
public interface BookdetailRepoV2 extends JpaRepository<BookDetailV2, String > {
    BookDetailV2 findBookDetailByName(String name);

    List<BookDetailV2> findAllByAuthor(String author);

    BookDetailV2 findCustomerByNameAndAuthor(String name, String author);

    List<BookDetailV2> findBookDetailByCategory(String category);
}
