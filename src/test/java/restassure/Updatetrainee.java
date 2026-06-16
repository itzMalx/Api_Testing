package restassure;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Updatetrainee {
	
	@Test
	public void update_trainee() {
		Map<String,Object> payload = new HashMap<>();
		payload.put("name", "Malavicka1");
		Response res = RestAssured
				.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.put("http://localhost:3000/trainees/1");
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(),200);
	}

}