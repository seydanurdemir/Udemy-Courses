package org.demir.quarkus;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;
//import java.util.logging.Logger;

@Path("/api/books")
public class BookResource {

    @Inject
    BookRepository repository;

//    @Inject
//    Logger logger;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
//        logger.info("Returns all books");
        return repository.getAllBooks();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks() {
//        logger.info("Returns the number of books");
        return repository.getAllBooks().size();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Book> getBook(@PathParam("id") int id) {
//        logger.info("Returns a single book with id " + id);
        return repository.getBook(id);
    }

}