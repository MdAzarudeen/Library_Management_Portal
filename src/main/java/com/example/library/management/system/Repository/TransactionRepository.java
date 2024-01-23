package com.example.library.management.system.Repository;

import com.example.library.management.system.entitities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository <Transaction,Integer> {
}
