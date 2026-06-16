package restassure;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Invalidtrainee {

	@Test
	public void invalid_trainee() {
		Response res = RestAssured
				.given()
				.when()
				.get("http://localhost:3000/traineess/1");
		Assert.assertEquals(res.getStatusCode(),404);
	}
}