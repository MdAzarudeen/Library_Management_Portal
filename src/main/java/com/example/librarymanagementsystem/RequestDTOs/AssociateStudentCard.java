package com.example.librarymanagementsystem.RequestDTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssociateStudentCard {
    private int cardId;
    private int studentId;
}
