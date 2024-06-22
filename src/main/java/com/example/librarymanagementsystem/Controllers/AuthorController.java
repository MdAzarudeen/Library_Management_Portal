package com.example.librarymanagementsystem.Controllers;

import com.example.librarymanagementsystem.RequestDTOs.AddAuthor;
import com.example.librarymanagementsystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @PostMapping("/addAuthor")
    public ResponseEntity addAuthor(@RequestBody AddAuthor addAuthor){
        return new ResponseEntity(authorService.addAuthor(addAuthor), HttpStatus.CREATED) ;
    }
}
