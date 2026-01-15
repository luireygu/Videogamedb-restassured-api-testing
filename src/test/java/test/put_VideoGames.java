package test;
import core.baseTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import request.request_General;
import assertions.commonAssertions;

public class put_VideoGames extends baseTest{
    @Test
    public void putOneVideoGame(){
        String idVideoGame = "3";
        String putVideoGame = "{\n" +
                "  \"category\": \"Platform\",\n" +
                "  \"name\": \"Mario\",\n" +
                "  \"rating\": \"Mature\",\n" +
                "  \"releaseDate\": \"2012-05-04\",\n" +
                "  \"reviewScore\": 85\n" +
                "}";

        Response response = request_General.putVideoGameJSON(idVideoGame,putVideoGame);
        commonAssertions.assertJson(response);
        commonAssertions.assertStatus200(response);
        commonAssertions.assertResponseTime(response);
        response.body().prettyPrint();

    }
}
