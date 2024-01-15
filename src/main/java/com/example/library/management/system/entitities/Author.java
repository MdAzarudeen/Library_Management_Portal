package com.example.library.management.system.entitities;

import jakarta.persistence.*;
import lombok.*;

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
    private String email;

}
