package com.sahan.spring.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BookDetail {
    @Id
    private String isbn;
    private String name;
    private String author;
    private String category;

}
