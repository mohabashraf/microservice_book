package com.book.boundary;

import com.book.domain.Book;
import com.book.domain.Specification;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.util.List;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class BookResources {

    @Context
    UriInfo uriInfo;

    @Inject
    BookBuilder bookBuilder;


    @GET
    public Response retrieveBooks(){
        List<Book> retrieveBooks = bookBuilder.retrieveBooks();
        return Response.ok(retrieveBooks).build();
    }

    @GET
    @Path("{id}")
    public Response retrieveBook(@PathParam("id") String identifier){
        Book book = bookBuilder.retrieveBook(identifier);
        return Response.ok(book).build();
    }

    @POST
    public Response createBook(JsonObject Object){
        Book book = bookBuilder.bookBuilder(new Specification(Object.getString("title"),
                Object.getString("author"), Object.getString("country"),
                Object.getString("imageLink"), Object.getString("language"),
                Object.getString("link"), Object.getInt("pages"),
                Object.getInt("year")));
        URI uri = uriInfo.getBaseUriBuilder()
                    .path(BookResources.class)
                    .path(BookResources.class, "retrieveBook")
                    .build(book.getIdentifier());

        return Response.created(uri).build();
    }


    @PUT
    @Path("{id}")
    public Response updateBook(@PathParam("id") String identifier, Book book){
        bookBuilder.updateBook(identifier, book);
        return Response.ok().build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteBook(@PathParam("id") String identifier){
        bookBuilder.deleteBook(identifier);
        return Response.ok().build();
    }

}
