package rh.pramudito.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Book {

    @Min(value = 1, message = "ID should be 1 or greater")
    private Long id;

    @NotBlank(message = "Book name cannot be null")
    private String book;

    @NotBlank(message = "Author cannot be null")
    private String author;

    @Min(value = 1, message = "Book pages should at least 1")
    private int pages;

    public Book(Long id, String book, String author, int pages) {
        this.id = id;
        this.book = book;
        this.author = author;
        this.pages = pages;
    }

    public Book() {
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
