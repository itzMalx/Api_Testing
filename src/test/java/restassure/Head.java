package restassure;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Head {

	@Test
	public void head_trainee() {

	    Response res = RestAssured
	            .given()
	            .when()
	            .head("http://localhost:3000/trainees/VxIN38pSDTQ");
	    System.out.println("Status Code : " + res.getStatusCode());
	    System.out.println("Headers : " + res.getHeaders());
	    res.then()
	    .statusCode(400);
	}
}