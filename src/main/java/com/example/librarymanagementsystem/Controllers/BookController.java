package com.example.librarymanagementsystem.Controllers;

import com.example.librarymanagementsystem.RequestDTOs.AddBookRequest;
import com.example.librarymanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public ResponseEntity addBook(@RequestBody AddBookRequest addBookRequest){
        return new ResponseEntity(bookService.addBook(addBookRequest),HttpStatus.CREATED);
    }

    @PutMapping("/associateAuthorBook")
    public ResponseEntity associateAuthorBook (@RequestParam int bId,@RequestParam int aId) {
        return new ResponseEntity(bookService.associateAuthorBook(bId,aId),HttpStatus.OK);
    }

}
