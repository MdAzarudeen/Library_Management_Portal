package com.example.library.management.system.RequestDTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssociateStudentCard {
    private int cardId;
    private int studentId;
}
