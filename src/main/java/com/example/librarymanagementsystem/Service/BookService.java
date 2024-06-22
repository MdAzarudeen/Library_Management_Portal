package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.Repository.AuthorRepository;
import com.example.librarymanagementsystem.Repository.BookRepository;
import com.example.librarymanagementsystem.RequestDTOs.AddBookRequest;
import com.example.librarymanagementsystem.entitities.Author;
import com.example.librarymanagementsystem.entitities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public String addBook(AddBookRequest addBookRequest){

        //1.get the author entity from author id
        Author author= authorRepository.findById(addBookRequest.getAuthorId()).get();

        //2.create the book entity
        Book newbook= new Book(addBookRequest.getBookname(),addBookRequest.getBookgenre(),addBookRequest.getNoOfPages(),addBookRequest.getPrice(),addBookRequest.getPublishDate());
        //3.set the foreign key variables/mapping in both book and author
        newbook.setAuthor(author);

        author.getBookList().add(newbook);
        author.setNoOfBooksWritten(author.getNoOfBooksWritten()+1);
        //4.save the parent
        Book savedbook=bookRepository.save(newbook);
        authorRepository.save(author);
        return "New book saved with bookId "+savedbook.getBookId();
    }


    public String associateAuthorBook (int bId,  int aId) {
        Book book=bookRepository.findById(bId).get();
        Author author=authorRepository.findById(aId).get();
        book.setAuthor(author);
        bookRepository.save(book);
        return aId+" ASSOCIATED WITH BOOK ID "+bId;

    }
}
