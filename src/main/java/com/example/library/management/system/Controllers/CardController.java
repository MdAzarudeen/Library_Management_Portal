package com.example.library.management.system.Controllers;

import com.example.library.management.system.Service.CardService;
import com.example.library.management.system.entitities.LibraryCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    private CardService cardService;
    @PostMapping("/generateACard")
    public String getFreshCard(){
        return cardService.getFreshCard();
    }
}
