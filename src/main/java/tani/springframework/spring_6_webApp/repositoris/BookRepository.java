package tani.springframework.spring_6_webApp.repositoris;

import org.springframework.data.repository.CrudRepository;
import tani.springframework.spring_6_webApp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {


}
