package com.example.library.management.system.entitities;

import com.example.library.management.system.Enum.Genre;
import com.example.library.management.system.Enum.TransactionType;
import com.example.library.management.system.Enum.transactionstatus;
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
    private transactionstatus transactionstatus;
    private int fineamount;
    private TransactionType transactionType;

    @JoinColumn
    @ManyToOne
    private LibraryCard libraryCard;

    @JoinColumn
    @ManyToOne
    private Book book;



}
