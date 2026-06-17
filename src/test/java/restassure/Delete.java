package restassure;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete {
	
	@Test
	public void delete_trainee() {
		Response res = RestAssured
				.given()
				.when()
				.delete("http://localhost:3000/trainees/Cq6tBAKk96w");
		Assert.assertEquals(res.getStatusCode(),200);
	}
}