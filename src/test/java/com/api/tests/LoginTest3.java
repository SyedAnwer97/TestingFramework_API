package com.api.tests;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.services.AuthService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest3 {

    @Test
    public void loginTest() {
        AuthService authService = new AuthService();
        LoginRequest loginPayload = new LoginRequest("syed1234", "syed1234");
        Response response = authService.login(loginPayload);
        response.prettyPrint();

        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println("The email in the response : " + loginResponse.getEmail());
        Assert.assertTrue(loginResponse.getToken() != null);
    }

    @Test
    public void forgotPasswordTest() {
        AuthService authService = new AuthService();
        String payload = "{\"email\": \"cifila6907@bamsrad.com\"}";
        Response response = authService.forgotPassword(payload);
        response.prettyPrint();
    }


}
