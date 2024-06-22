package com.example.librarymanagementsystem.entitities;

import com.example.librarymanagementsystem.Enum.Genre;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="Book")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Book {

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private int bookId;
        @Column (unique = true)
        private String bookname;
        @Enumerated(value=EnumType.STRING)
        private Genre bookgenre;
        private int noOfPages;
        private int price;
        private String publishDate;
        private boolean isAvailable=true;
        @JoinColumn
        @ManyToOne
        private Author author;

        @OneToMany (mappedBy = "book",cascade = CascadeType.ALL )
        private List<Transaction> transactionList=new ArrayList<>();

        public Book(String bookname, Genre bookgenre, int noOfPages, int price, String publishDate) {
                this.bookname = bookname;
                this.bookgenre = bookgenre;
                this.noOfPages = noOfPages;
                this.price = price;
                this.publishDate = publishDate;
        }
}
