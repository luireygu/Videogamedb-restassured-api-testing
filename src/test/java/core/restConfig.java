package core;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.jupiter.api.BeforeAll;

public class restConfig {
    @BeforeAll
    public static void setup(){
                RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://videogamedb.uk/")
                .setBasePath("api/v2/")
//                .setContentType("application/Json")
                .setPort(443)
  //              .addHeader("Accept", "application/json")
                .build();



    }

}
