package rh.pramudito;

import rh.pramudito.entity.Book;
import rh.pramudito.service.BookService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/book")
public class BookResource {
    private static final ArrayList<Book> books = new ArrayList<>();

    static {
        books.add(new Book(1L, "Quarkus 101", "Quarkusio", 200));
        books.add(new Book(2L, "Quarkus 102", "Quarkusio", 220));
    }

    @Inject
    BookService bookService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBook() {
        return Response.status(202).entity(books).build();
        //return Response.ok(books).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addBook(Book book) {
        bookService.checkBook(book);
        if (books.size() > 5) {
            return Response.status(400).entity("No more than 5 books").build();
        }
        books.add(book);
        return Response.status(202).entity(book).build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateBook(@PathParam("id") int index, Book book) {
        books.remove(index);
        books.add(index, book);
        return Response.status(202).entity(book).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteBook(@PathParam("id") int index) {
        books.remove(index);
        return Response.status(202).entity(books).build();
    }
}
