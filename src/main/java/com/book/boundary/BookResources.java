package com.book.boundary;

import com.book.control.BookFactory;
import com.book.entity.Book;
import com.book.entity.Specification;
import com.sun.tools.classfile.ConstantPool;

import javax.inject.Inject;

import javax.json.JsonObject;
import javax.ws.rs.*;
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

    @POST
    public void createBook(JsonObject Object){
        bookBuilder.bookBuilder(new Specification(Object.getString("title")));
    }
}
