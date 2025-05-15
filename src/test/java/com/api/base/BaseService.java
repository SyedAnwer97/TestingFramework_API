package com.api.base;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public class BaseService {

    private static final String BASE_URI = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification;

    protected BaseService() {
        requestSpecification = given().baseUri(BASE_URI);
    }

    protected Response postRequest(Object payload, String endPoint) {
        Response response = requestSpecification.body(payload)
                .contentType(ContentType.JSON)
                .post(endPoint);
        return response;
    }
}
