package com.sahan.spring.service.impl;

import com.sahan.spring.dto.BookDetailDTO;
import com.sahan.spring.entity.BookDetail;
import com.sahan.spring.repo.BookdetailRepo;
import com.sahan.spring.service.BookDetailService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
@Service
@Transactional
public class BookDetailServiceImpl implements BookDetailService {
    @Autowired
    private BookdetailRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveBookDetail(BookDetailDTO dto) {
        if (!repo.existsById(dto.getIsbn())) {
            BookDetail c = mapper.map(dto, BookDetail.class);
            repo.save(c);
        } else {
            throw new RuntimeException("Book already exist..!");
        }
    }

    @Override
    public void updateBookDetail(BookDetailDTO dto) {
        if (repo.existsById(dto.getIsbn())) {
            BookDetail c = mapper.map(dto, BookDetail.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such book for update..!");
        }
    }

    @Override
    public BookDetailDTO searchBookDetail(String isbn) {
        Optional<BookDetail> bookDetail = repo.findById(isbn);
        if (bookDetail.isPresent()) {
            return mapper.map(bookDetail.get(), BookDetailDTO.class);
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
    public List<BookDetailDTO> getAllBookDetail() {
        List<BookDetail> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<BookDetailDTO>>() {
        }.getType());
    }

}

