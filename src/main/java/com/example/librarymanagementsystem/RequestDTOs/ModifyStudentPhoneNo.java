package com.example.librarymanagementsystem.RequestDTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModifyStudentPhoneNo {
    private int studentId;
    private String studentPhoneNo;
}
