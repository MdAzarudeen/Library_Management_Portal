package com.example.librarymanagementsystem.Repository;

import com.example.librarymanagementsystem.entitities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository <Transaction,Integer> {
}
