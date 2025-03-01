package tani.springframework.spring_6_webApp.services;

import org.springframework.stereotype.Service;
import tani.springframework.spring_6_webApp.domain.Author;
import tani.springframework.spring_6_webApp.repositoris.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService{


    private final AuthorRepository authorRepository;
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @Override
    public Iterable<Author> findAll(){
        return authorRepository.findAll();
    }
}
