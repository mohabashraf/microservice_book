package connection;

import com.book.domain.Book;
import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Dependent
public class Cloudant {


    CloudantClient client;
    Database db;

    @PostConstruct
    public void init() {

        try {

            client = ClientBuilder.url(new URL("https://a680f839-6530-43a7-9aaf-c37e9adc3a58-bluemix:399cdc8b78e397a44de2c87f6d788154e70a350d059eb80a7bdbcdc1a73b9557@a680f839-6530-43a7-9aaf-c37e9adc3a58-bluemix.cloudantnosqldb.appdomain.cloud"))
                        .username("a680f839-6530-43a7-9aaf-c37e9adc3a58-bluemix")
                        .password("399cdc8b78e397a44de2c87f6d788154e70a350d059eb80a7bdbcdc1a73b9557")
                        .build();
            } catch (MalformedURLException e) {
                System.out.println(e);
            }
        db = client.database("book", false);
    }

    public void addBook(Book book){
       Response s =  db.save(book);
    }


}
