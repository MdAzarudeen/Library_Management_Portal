package com.example.librarymanagementsystem.RequestDTOs;

import com.example.librarymanagementsystem.Enum.Genre;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBookRequest {
    private String bookname;
    private Genre bookgenre;
    private int noOfPages;
    private int price;
    private String publishDate;
    private int authorId;
}
