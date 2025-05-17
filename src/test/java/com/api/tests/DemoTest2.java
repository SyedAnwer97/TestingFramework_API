package com.api.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DemoTest2 {

    @Test
    public void loginAPI() {
        Response response = given()
                .baseUri("http://64.227.160.186:8080")
                .header("Content-Type", "application/json")
                .body("{\"username\": \"syed1234\",\"password\": \"syed1234\"}")
                .post("/api/auth/login");
        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
