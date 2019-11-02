package com.book.boundary;

import com.book.entity.Book;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResources {
    @Inject
    BookBuilder bookBuilder;

    @GET
    public List<Book> retrieveBooks(){
        return bookBuilder.retrieveBooks();
    }
}
