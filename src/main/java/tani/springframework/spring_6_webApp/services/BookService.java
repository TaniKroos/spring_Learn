package tani.springframework.spring_6_webApp.services;

import tani.springframework.spring_6_webApp.domain.Book;

public interface BookService   {
      Iterable<Book> findAll() ;
}
