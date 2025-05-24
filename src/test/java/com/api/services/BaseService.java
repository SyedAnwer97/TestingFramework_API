package com.api.services;

import com.api.filter.LoggingFilter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseService {

    private static final String BASE_URI = "http://64.227.160.186:8080";
    private final RequestSpecification requestSpec;

    static {
        RestAssured.filters(new LoggingFilter());
    }

    protected BaseService() {
        this.requestSpec = given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON);
    }

    public void setAuthToken(String token) {
        requestSpec.header("Authorization", "Bearer " + token);
    }

    protected Response post(Object payload, String endpoint) {
        return requestSpec
                .body(payload)
                .post(endpoint);
    }

    protected Response get(String endpoint) {
        return requestSpec
                .get(endpoint);
    }

    protected Response put(Object payload, String endpoint) {
        return requestSpec
                .body(payload)
                .put(endpoint);
    }
}
