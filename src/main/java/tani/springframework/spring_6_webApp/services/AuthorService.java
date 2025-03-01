package tani.springframework.spring_6_webApp.services;

import tani.springframework.spring_6_webApp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
