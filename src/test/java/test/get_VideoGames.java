package test;
import core.baseTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import request.request_General;
import assertions.commonAssertions;

import static io.restassured.RestAssured.given;

public class get_VideoGames  extends baseTest{
    @Test
    public void getAllVideoGames(){
        Response response = request_General.getAllVideoGames();
        commonAssertions.assertStatus200(response);
        commonAssertions.assertResponseTime(response);
        commonAssertions.assertJson(response);
        response.body().prettyPrint();
    }
    @Test
    public void getOneVideoGame(){
        String id_videoGame= "3";
        Response response = request_General.getOneVideoGame(id_videoGame);
        commonAssertions.assertStatus200(response);
        commonAssertions.assertResponseTime(response);
        commonAssertions.assertJson(response);
        commonAssertions.assertContentBody(response,"name","Tetris");
        commonAssertions.assertContentBody(response,"reviewScore",88); // IGUAL
        commonAssertions.assertgreaterThan(response,"reviewScore",80);// MAYOR IGUAL
        commonAssertions.assertlessThanOrEqualTo(response,"reviewScore",90);// MENOR IGUAL
        commonAssertions.assertContentBody(response,"rating","Universal");
        commonAssertions.assertcontainsString(response,"releaseDate","1984-06-");

        commonAssertions.assertstartsWith(response,"category","Puz");
        response.body().prettyPrint();
    }
}
