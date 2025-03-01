package tani.springframework.spring_6_webApp.bootstrap;


import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tani.springframework.spring_6_webApp.domain.Author;
import tani.springframework.spring_6_webApp.domain.Book;
import tani.springframework.spring_6_webApp.domain.Publisher;
import tani.springframework.spring_6_webApp.repositoris.AuthorRepository;
import tani.springframework.spring_6_webApp.repositoris.BookRepository;
import tani.springframework.spring_6_webApp.repositoris.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {



    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }






    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("George");
        eric.setLastName("R R Martin");

        Book got = new Book();
        got.setTitle("Game of Thrones");
        got.setIsbn("1234312");

        Author ericSaved = authorRepository.save(eric);
        Book gotSaved = bookRepository.save(got);

        Author jk = new Author();
        jk.setFirstName("JK ");
        jk.setLastName("Rowling");

        Book hp = new Book();
        hp.setTitle("Harry Potter");
        hp.setIsbn("098768990");

        Author jkSaved = authorRepository.save(jk);
        Book hpSaved = bookRepository.save(hp);

        ericSaved.getBooks().add(gotSaved);
        jkSaved.getBooks().add(hpSaved);
        gotSaved.getAuthors().add(ericSaved);
        hpSaved.getAuthors().add(jkSaved);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("McGraaw");
        publisher.setAddress("123 Main");

        Publisher savedPublisher = publisherRepository.save(publisher);

        gotSaved.setPublisher(savedPublisher);
        hpSaved.setPublisher(savedPublisher);

        authorRepository.save(jkSaved);
        authorRepository.save(ericSaved);
        bookRepository.save(hpSaved);
        bookRepository.save(gotSaved);

        System.out.println("In bootstrap");
        System.out.println("ACount" + authorRepository.count());
        System.out.println("Bcount" + bookRepository.count());


        System.out.println("PubCount" + publisherRepository.count());
    }








}
