package com.sahan.spring.controller;

import com.sahan.spring.dto.BookDetailDTO;
import com.sahan.spring.dto.BookDetailDTOV2;
import com.sahan.spring.service.BookDetailService;
import com.sahan.spring.service.BookDetailServiceV2;
import com.sahan.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
@RestController
@RequestMapping("/api/v2/book-detail")
@CrossOrigin
public class BookDetailsControllerV2 {

        @Autowired
        BookDetailServiceV2 bookDetailServiceV2;

        @PostMapping("/")
        public ResponseEntity addBookDetail(@RequestBody BookDetailDTOV2 dto) {
            bookDetailServiceV2.saveBookDetail(dto);
            StandradResponse response = new StandradResponse(200, "Success", null);
            return new ResponseEntity(response, HttpStatus.CREATED);
        }

        @DeleteMapping(params = {"isbn"})
        public ResponseEntity deleteBookDetail(@RequestParam String isbn) {
            bookDetailServiceV2.deleteBookDetail(isbn);
            return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
        }

        @PutMapping("/")
        public ResponseEntity updateBookdetail(@RequestBody BookDetailDTOV2 dto) {
            bookDetailServiceV2.updateBookDetail(dto);
            return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
        }

        @GetMapping(path = "/{isbn}")
        public ResponseEntity searchCustomer(@PathVariable String isbn) {
            BookDetailDTOV2 bookDetailDTOV2 = bookDetailServiceV2.searchBookDetail(isbn);
            return new ResponseEntity(new StandradResponse(200, "Success", bookDetailDTOV2), HttpStatus.OK);
        }

        @GetMapping("/view-all")
        public ResponseEntity getAllCustomers() {
            List<BookDetailDTOV2> allBookDetails = bookDetailServiceV2.getAllBookDetail();
            return new ResponseEntity(new StandradResponse(200, "Success", allBookDetails), HttpStatus.OK);
        }

    }

