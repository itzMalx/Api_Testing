package restassure;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateTraniee {
	
	@Test
	public void create_post() {
		Map<String, Object> payload = new HashMap<>();
		payload.put("name","Malavicka");
		payload.put("email", "erty@gmail.com");
		payload.put("company", "Expleo");
		payload.put("id", "35");
		
		Response res = RestAssured
				.given()
				.contentType(ContentType.JSON)
                .body(payload)
				.when()
				.post("http://localhost:3000/trainees");
		res.prettyPrint();
	   System.out.println(res.getStatusCode());
	   res.then()
	   .statusCode(201);
	   Assert.assertEquals(res.jsonPath().getString("company"),"Expleo");
	}

}