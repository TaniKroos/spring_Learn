package tani.springframework.spring_6_webApp.repositoris;

import org.springframework.data.repository.CrudRepository;
import tani.springframework.spring_6_webApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
