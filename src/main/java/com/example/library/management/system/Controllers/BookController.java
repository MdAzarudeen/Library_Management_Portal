package com.example.library.management.system.Controllers;

import com.example.library.management.system.RequestDTOs.AddBookRequest;
import com.example.library.management.system.Service.BookService;
import com.example.library.management.system.entitities.Book;
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

}
