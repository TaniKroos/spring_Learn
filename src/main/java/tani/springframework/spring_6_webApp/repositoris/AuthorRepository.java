package tani.springframework.spring_6_webApp.repositoris;

import org.springframework.data.repository.CrudRepository;
import tani.springframework.spring_6_webApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
