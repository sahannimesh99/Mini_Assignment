package com.sahan.spring.service;

import com.sahan.spring.dto.BookDetailDTO;

import java.util.List;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
public interface BookDetailService {
    void saveBookDetail(BookDetailDTO dto);

    void updateBookDetail(BookDetailDTO dto);

    BookDetailDTO searchBookDetail(String isbn);

    void deleteBookDetail(String isbn);

    List<BookDetailDTO> getAllBookDetail();
}
