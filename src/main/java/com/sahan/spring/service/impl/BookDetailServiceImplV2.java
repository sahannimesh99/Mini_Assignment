package com.sahan.spring.service.impl;

import com.sahan.spring.dto.BookDetailDTOV2;
import com.sahan.spring.entity.BookDetailV2;
import com.sahan.spring.repo.BookdetailRepoV2;
import com.sahan.spring.service.BookDetailServiceV2;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
@Service
public class BookDetailServiceImplV2 implements BookDetailServiceV2 {
    @Autowired
    private BookdetailRepoV2 repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveBookDetail(BookDetailDTOV2 dto) {
        if (!repo.existsById(dto.getIsbn())) {
            BookDetailV2 c = mapper.map(dto, BookDetailV2.class);
            repo.save(c);
        } else {
            throw new RuntimeException("Book already exist..!");
        }
    }

    @Override
    public void updateBookDetail(BookDetailDTOV2 dto) {
        if (repo.existsById(dto.getIsbn())) {
            BookDetailV2 c = mapper.map(dto, BookDetailV2.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such book for update..!");
        }
    }

    @Override
    public BookDetailDTOV2 searchBookDetail(String isbn) {
        Optional<BookDetailV2> bookDetail = repo.findById(isbn);
        if (bookDetail.isPresent()) {
            return mapper.map(bookDetail.get(), BookDetailDTOV2.class);
        } else {
            throw new RuntimeException("No book for id: " + isbn);
        }
    }


    @Override
    public void deleteBookDetail(String isbn) {
        if (repo.existsById(isbn)) {
            repo.deleteById(isbn);
        } else {
            throw new RuntimeException("No customer for delete ID: " + isbn);
        }

    }

    @Override
    public List<BookDetailDTOV2> getAllBookDetail() {
        List<BookDetailV2> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<BookDetailDTOV2>>() {
        }.getType());
    }

}
