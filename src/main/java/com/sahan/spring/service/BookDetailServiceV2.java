package com.sahan.spring.service;

import com.sahan.spring.dto.BookDetailDTOV2;

import java.util.List;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
public interface BookDetailServiceV2 {
    void saveBookDetail(BookDetailDTOV2 dto);

    void updateBookDetail(BookDetailDTOV2 dto);

    BookDetailDTOV2 searchBookDetail(String isbn);

    void deleteBookDetail(String isbn);

    List<BookDetailDTOV2> getAllBookDetail();
}
