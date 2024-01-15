package com.example.library.management.system.Service;


import com.example.library.management.system.Enum.CardStatus;
import com.example.library.management.system.Repository.CardRepository;
import com.example.library.management.system.entitities.LibraryCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    public String getFreshCard() {
        LibraryCard newCard=new LibraryCard();

        newCard.setCardStatus(CardStatus.NEW);
        newCard.setnoOfBooksIssued(0);

        LibraryCard savedCard = cardRepository.save(newCard);

        return ("New card generated with cardNo " + savedCard.getcardno());
    }
}
