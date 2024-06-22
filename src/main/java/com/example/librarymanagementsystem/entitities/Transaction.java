package com.example.librarymanagementsystem.entitities;

import com.example.librarymanagementsystem.Enum.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String txnId;

    @CreatedDate
    private Date createdOn;
    private com.example.librarymanagementsystem.Enum.transactionstatus transactionstatus;
    private int fineamount;
    private TransactionType transactionType;

    @JoinColumn
    @ManyToOne
    private LibraryCard libraryCard;

    @JoinColumn
    @ManyToOne
    private Book book;



}
