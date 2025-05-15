package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginAPI() {
        RestAssured.baseURI = "http://64.227.160.186:8080";
        RequestSpecification given = RestAssured.given();
        RequestSpecification header = given.header("Content-Type", "application/json");
        RequestSpecification body = header.body("{\"username\": \"syed1234\",\"password\": \"syed1234\"}");
        Response post = body.post("/api/auth/login");
        post.prettyPrint();

        Assert.assertEquals(post.getStatusCode(), 200);
    }
}
