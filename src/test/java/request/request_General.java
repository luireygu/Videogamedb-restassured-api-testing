package request;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import endpoints.endpoint_General;

public class request_General {

    public static Response getAllVideoGames(){
        return given()
                    .log().all()
                .when()
                    .get(endpoint_General.getAllVideoGames);
    }

    public static Response getOneVideoGame( String idVideoGame){
        return given()
                    .log().all()
                .when()
                    .get(endpoint_General.getAllVideoGames + "/" + idVideoGame);
    }

    public static Response postNewOneVideoGameJSON(String content_VideoGame){
        return given()
                    .log().all()
                    .body(content_VideoGame)
                    .contentType("application/JSON")
                .when()
                    .post(endpoint_General.getAllVideoGames);


    }
    public static Response postNewOneVideoGameXML(String content_VideoGamePost){
        return given()
                    .log().all()
                    .body(content_VideoGamePost)
                    .contentType("application/XML")
                .when()
                    .post(endpoint_General.getAllVideoGames);


    }
    public static Response putVideoGameJSON(String id_VideoGame,String content_VideoGamePut){
        return given()
                .log().all()
                .body(content_VideoGamePut)
                .contentType("application/JSON")
                .when()
                .put(endpoint_General.getAllVideoGames + "/" + id_VideoGame);

    }
    public static Response deleteVideoGameJSON(String id_VideoGame){
        return given()
                .log().all()
                .when()
                .delete(endpoint_General.getAllVideoGames + "/" + id_VideoGame);
    }



}
