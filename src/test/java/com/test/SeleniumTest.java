package com.test;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
public class SeleniumTest {
    @Test
    public void testGetRequest() {
        given()
        .when()
        .get("https://jsonplaceholder.typicode.com/posts/1")
        .then()
            .statusCode(200);
        System.out.println("API Test Passed");
    }
}