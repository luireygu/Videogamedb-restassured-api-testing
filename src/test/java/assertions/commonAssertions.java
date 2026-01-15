package assertions;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;
public class commonAssertions {

    public static void assertStatus200 (Response response) {
        response.then().statusCode(200);
    }


    public static void assertResponseTime(Response response) {
        response.then().time(lessThan(3000L));
    }
    public static void assertJson(Response response) {
        response.then().contentType("application/json");
    }
    public static void assertTextPlain(Response response) {
        response.then().contentType("text/plain");

    }
    public static void assertContentBody(Response response, String label_name , Object content_label){
        response.then().body(label_name,equalTo(content_label));
    }
    public static void assertgreaterThan(Response response,String label_name, int reviewScore){
        response.then().body(label_name,greaterThan(reviewScore));
    }
    public static void assertlessThanOrEqualTo(Response response, String label_name ,int reviewScore){
        response.then().body(label_name,lessThanOrEqualTo(reviewScore));
    }
    public static void assertcontainsString(Response response,String label_name ,  String content){
        response.then().body(label_name,containsString(content));
    }
    public static void assertstartsWith(Response response,String label_name ,  String content){
        response.then().body(label_name,startsWith(content));
    }



}
