package resources;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;

import javax.enterprise.context.Dependent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
@Dependent
public class Cloudant {


        @org.jetbrains.annotations.Contract(pure = true)
        Cloudant(){

        }
    CloudantClient client;
        public List<String> testDatabase() {
            try {
                client = ClientBuilder.url(new URL("https://a680f839-6530-43a7-9aaf-c37e9adc3a58-bluemix:399cdc8b78e397a44de2c87f6d788154e70a350d059eb80a7bdbcdc1a73b9557@a680f839-6530-43a7-9aaf-c37e9adc3a58-bluemix.cloudantnosqldb.appdomain.cloud"))
                        .username("a680f839-6530-43a7-9aaf-c37e9adc3a58-bluemix")
                        .password("399cdc8b78e397a44de2c87f6d788154e70a350d059eb80a7bdbcdc1a73b9557")
                        .build();
            } catch (MalformedURLException e) {
                System.out.println(e);
            }
            System.out.println("Server Version: " + client.serverVersion());
            List<String> databases = client.getAllDbs();
            return databases;
        }




}
