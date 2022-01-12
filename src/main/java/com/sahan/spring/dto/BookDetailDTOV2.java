package com.sahan.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetailDTOV2 {
    private String isbn;
    private String name;
    private String author;
    private String category;
    private String pages;
}
