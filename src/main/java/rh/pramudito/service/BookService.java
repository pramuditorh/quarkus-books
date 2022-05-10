package rh.pramudito.service;

import rh.pramudito.entity.Book;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;

@ApplicationScoped
public class BookService {
    public Book checkBook(@Valid Book book) {
        return book;
    }

}
