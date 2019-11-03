package com.book.boundary;

import com.book.control.BookFactory;
import com.book.entity.Book;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("book")
@Produces(MediaType.APPLICATION_JSON)
public class BookResources {

    @Inject
    BookFactory bookFactory;

    @GET
    public String retrieveBooks(){
        return "Hello World";
    }
}
