package com.example.library.management.system.Repository;

import com.example.library.management.system.entitities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository <LibraryCard,Integer> {

}
