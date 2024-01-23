package com.example.library.management.system.entitities;

import com.example.library.management.system.Enum.Genre;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

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
        @JoinColumn
        @ManyToOne
        private Author author;

        public Book(String bookname, Genre bookgenre, int noOfPages, int price, String publishDate) {
                this.bookname = bookname;
                this.bookgenre = bookgenre;
                this.noOfPages = noOfPages;
                this.price = price;
                this.publishDate = publishDate;
        }
}
