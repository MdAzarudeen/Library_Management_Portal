package com.example.library.management.system.entitities;

import com.example.library.management.system.Enum.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="LibraryCard")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibraryCard {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int cardNo;
    @Enumerated(value= EnumType.STRING)
    private CardStatus cardstatus;
    private int noOfBooksIssued;
    @JoinColumn
    @OneToOne
    private Student student;

}
