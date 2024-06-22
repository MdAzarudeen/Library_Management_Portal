package com.example.library.management.system.entitities;

import com.example.library.management.system.Enum.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="LibraryCard")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibraryCard {
    public static final int maxBooksAllowed = 3;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int cardNo;
    @Enumerated(value= EnumType.STRING)
    private CardStatus cardstatus;
    private int noOfBooksIssued;

    @JoinColumn
    @OneToOne
    private Student student;

    @OneToMany (mappedBy = "libraryCard",cascade = CascadeType.ALL )
    private List<Transaction> transactionList =new ArrayList<>();

}
