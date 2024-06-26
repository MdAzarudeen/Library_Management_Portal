package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.Repository.AuthorRepository;
import com.example.librarymanagementsystem.RequestDTOs.AddAuthor;
import com.example.librarymanagementsystem.entitities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public String addAuthor(AddAuthor addAuthor){
        Author newAuthor=new Author();
        newAuthor.setAuthorname(addAuthor.getAuthorname());
        newAuthor.setAge(addAuthor.getAge());
        newAuthor.setEmail(addAuthor.getEmail());

        Author savedAuthor= authorRepository.save(newAuthor);
        return "New author created with author Id "+ savedAuthor.getAuthorId();
    }
}
