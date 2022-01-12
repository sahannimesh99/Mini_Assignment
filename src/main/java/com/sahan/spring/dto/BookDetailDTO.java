package com.sahan.spring.dto;

import lombok.*;
/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetailDTO {
    private String isbn;
    private String name;
    private String author;
    private String category;
}
