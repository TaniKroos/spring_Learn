package tani.springframework.spring_6_webApp.controllers;


import org.hibernate.annotations.ConcreteProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tani.springframework.spring_6_webApp.services.BookService;
import org.springframework.ui.Model;
@Controller
public class BookController {


    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookService.findAll());
        return "books";
    }


}
