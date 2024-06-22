package com.example.library.management.system.RequestDTOs;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddAuthor {
    private String authorname;
    private int age;
    private String email;
}
