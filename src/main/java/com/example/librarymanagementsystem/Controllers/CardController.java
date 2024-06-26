package com.example.librarymanagementsystem.Controllers;

import com.example.librarymanagementsystem.RequestDTOs.AssociateStudentCard;
import com.example.librarymanagementsystem.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    private CardService cardService;
    @PostMapping("/generateACard")
    public String getFreshCard(){
        return cardService.getFreshCard();
    }

    @PutMapping ("/AssociateAcardWithAStudent")
    public ResponseEntity AssociateAcardWithAStudent  (@RequestBody AssociateStudentCard associateStudentCard) throws Exception {
         try{
            return new ResponseEntity (cardService.AssociateAcardWithAStudent(associateStudentCard),HttpStatus.OK);
         }
         catch(Exception e){
             return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);

         }
    }
}
