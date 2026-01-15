package test;
import assertions.commonAssertions;
import core.baseTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import request.request_General;

public class delete_VideoGames extends baseTest{
    @Test
    public void deletevideoGame(){
        String idVideoGame = "3";
        Response response = request_General.deleteVideoGameJSON(idVideoGame);

        commonAssertions.assertTextPlain(response);
        commonAssertions.assertStatus200(response);
        commonAssertions.assertResponseTime(response);
        response.body().prettyPrint();
    }
}
