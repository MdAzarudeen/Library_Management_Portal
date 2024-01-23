package com.example.library.management.system.Service;


import com.example.library.management.system.Enum.CardStatus;
import com.example.library.management.system.Repository.CardRepository;
import com.example.library.management.system.Repository.StudentRepository;
import com.example.library.management.system.RequestDTOs.AssociateStudentCard;
import com.example.library.management.system.entitities.LibraryCard;
import com.example.library.management.system.entitities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    @Autowired
    private StudentRepository studentRepository;
    public String getFreshCard() {
        LibraryCard newCard=new LibraryCard();

        newCard.setCardstatus(CardStatus.NEW);
        newCard.setNoOfBooksIssued(0);
        LibraryCard savedCard = cardRepository.save(newCard);

        return ("New card generated with cardNo " + savedCard.getCardNo());
    }

    public String AssociateAcardWithAStudent (AssociateStudentCard associateStudentCard) throws Exception {
        int cardId=associateStudentCard.getCardId();
        int studentId=associateStudentCard.getStudentId();
        Optional<LibraryCard> optionalCard=cardRepository.findById(cardId);
        if(optionalCard.isEmpty()){
            throw new Exception("Incorrect card id");
        }

        LibraryCard libraryCard=optionalCard.get();

        Optional<Student> optionalStudent=studentRepository.findById(studentId);
        if(optionalStudent.isEmpty()){
            throw new Exception("Incorrect student id");
        }

        Student student=optionalStudent.get();

        libraryCard.setStudent(student);
        libraryCard.setCardstatus(CardStatus.Active);
        libraryCard.setNoOfBooksIssued(0);

        cardRepository.save(libraryCard);
        return "card with cardId"+ libraryCard.getCardNo() +"associated with student having studentId"+ student.getStudentId();
    }
}
