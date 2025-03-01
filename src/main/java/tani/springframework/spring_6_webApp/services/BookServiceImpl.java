package tani.springframework.spring_6_webApp.services;

import org.springframework.stereotype.Service;
import tani.springframework.spring_6_webApp.domain.Book;
import tani.springframework.spring_6_webApp.repositoris.BookRepository;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> findAll(){
        return bookRepository.findAll();
    }
}
