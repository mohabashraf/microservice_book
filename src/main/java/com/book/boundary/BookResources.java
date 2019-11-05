package com.book.boundary;

import com.book.control.BookFactory;
import com.book.entity.Book;
import com.book.entity.Specification;
import com.sun.jndi.toolkit.url.Uri;
import com.sun.tools.classfile.ConstantPool;

import javax.inject.Inject;

import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.util.List;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResources {

    @Context
    UriInfo uriInfo;

    @Inject
    BookBuilder bookBuilder;

    @GET
    public List<Book> retrieveBooks(){
        return bookBuilder.retrieveBooks();
    }

    @POST
    public Response createBook(JsonObject Object){
        Book book = bookBuilder.bookBuilder(new Specification(Object.getString("title")));
        URI uri = uriInfo.getBaseUriBuilder()
                    .path(BookResources.class)
                    .path(BookResources.class, "retrieveBook")
                    .build(book.getIdentifier());

        return Response.created(uri).build();
    }

    @GET
    @Path("{id}")
    public Book retrieveBook(@PathParam("id") String identifier){
        return bookBuilder.retrieveBook(identifier);
    }
}
