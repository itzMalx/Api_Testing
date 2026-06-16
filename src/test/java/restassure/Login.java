package restassure;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Login {
    @Test
    public void loginTest() {
        String requestBody = """
                {
                    "username": "admin",
                    "password": "admin123"
                }
                """;
        Response response = RestAssured
                .given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post("http://localhost:5000/login");
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body:");
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 200);
        String token = response.jsonPath().getString("token");
        Assert.assertNotNull(token, "Token is missing");
        System.out.println("Generated Token: " + token);
    }
}