package com.example.librarymanagementsystem.entitities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Author")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorname;
    private int age;
    @Column(unique = true,nullable = false)
    private String email;
    private int noOfBooksWritten;
    @OneToMany (mappedBy = "author", cascade= CascadeType.ALL)
    private List <Book> bookList= new ArrayList<>();

}
