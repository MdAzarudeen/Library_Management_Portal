package com.example.library.management.system.Controllers;

import com.example.library.management.system.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @PostMapping("/addTransaction")
    public ResponseEntity addTransaction (@RequestParam int bId ,@RequestParam int cId) {

            try{
                return new ResponseEntity(transactionService.addTransaction(bId,cId),HttpStatus.CREATED);
            }
            catch (Exception e){
                return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
            }
    }

}
