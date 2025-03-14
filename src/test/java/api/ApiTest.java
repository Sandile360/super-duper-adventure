package api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;


public class ApiTest {

    @Test
    public void testGet(){
        baseURI = "http://localhost:3000";
        given()
                .get("/0")
                .then()
                .statusCode(200)
                .body("accountHolder.name",equalTo("Jane Smith"))
                .body("accounts[0].balance",equalTo(15000));
    }

}
