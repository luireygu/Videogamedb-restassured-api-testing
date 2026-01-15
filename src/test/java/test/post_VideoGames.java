package test;
import core.baseTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import request.request_General;
import assertions.commonAssertions;


public class post_VideoGames extends baseTest{
    @Test
    public void postOneVideoGameJson(){
        String newVideoGame ="{\n" +
                "  \"category\": \"Platform\",\n" +
                "  \"name\": \"Mario\",\n" +
                "  \"rating\": \"Mature\",\n" +
                "  \"releaseDate\": \"2012-05-04\",\n" +
                "  \"reviewScore\": 85\n" +
                "}";
        Response response = request_General.postNewOneVideoGameJSON(newVideoGame);
        commonAssertions.assertResponseTime(response);
        commonAssertions.assertStatus200(response);
        commonAssertions.assertJson(response);
        commonAssertions.assertContentBody(response,"name","Mario");
        response.body().prettyPrint();
    }
    @Test
    public void postOneVideoGameXML(){
        String newVideoGame ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<VideoGameRequest>\n" +
                "\t<category>Platform</category>\n" +
                "\t<name>Mario</name>\n" +
                "\t<rating>Mature</rating>\n" +
                "\t<releaseDate>2012-05-04</releaseDate>\n" +
                "\t<reviewScore>85</reviewScore>\n" +
                "</VideoGameRequest>";
        Response response = request_General.postNewOneVideoGameXML(newVideoGame);
        commonAssertions.assertResponseTime(response);
        commonAssertions.assertStatus200(response);
        commonAssertions.assertJson(response);
        response.body().prettyPrint();
    }

}
