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
        private Date publishDate;
        @JoinColumn
        @ManyToOne
        private Author author;

}
