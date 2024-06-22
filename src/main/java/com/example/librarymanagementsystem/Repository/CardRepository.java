package com.example.librarymanagementsystem.Repository;

import com.example.librarymanagementsystem.entitities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository <LibraryCard,Integer> {

}
