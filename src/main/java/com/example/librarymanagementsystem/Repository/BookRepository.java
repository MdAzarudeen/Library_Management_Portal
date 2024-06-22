package com.example.library.management.system.Repository;

import com.example.library.management.system.entitities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book,Integer> {
}
