package com.example.library.management.system.Service;

import com.example.library.management.system.Enum.TransactionType;
import com.example.library.management.system.Enum.transactionstatus;
import com.example.library.management.system.Repository.BookRepository;
import com.example.library.management.system.Repository.CardRepository;
import com.example.library.management.system.Repository.TransactionRepository;
import com.example.library.management.system.entitities.Book;
import com.example.library.management.system.entitities.LibraryCard;
import com.example.library.management.system.entitities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private BookRepository bookRepository;

    public String addTransaction ( int bId , int cId) throws Exception {
        //1. get book and card
        Book book= bookRepository.findById(bId).get();
        LibraryCard libraryCard=cardRepository.findById(cId).get();


        //2. check if book is available
        if(!book.isAvailable()){
            throw new Exception("Book is with other student");
        }


        //3. check if card has reached max books issues
        if(libraryCard.getNoOfBooksIssued()>=libraryCard.maxBooksAllowed) {
            throw new Exception("Return atleast one book to issue new book");
        }

        //4.Create transaction
        Transaction transaction=new Transaction();
        transaction.setTransactionType(TransactionType.ISSUED);
        transaction.setTransactionstatus(transactionstatus.SUCCESS);

        //5.update the card and book status
        book.setAvailable(Boolean.FALSE);
        libraryCard.setNoOfBooksIssued(libraryCard.getNoOfBooksIssued()+1);

        Transaction savedTransaction= transactionRepository.save(transaction);
        return "The transaction with TXN ID "+ savedTransaction.getTxnId()+" is saved ";


    }
}
