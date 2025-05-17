package com.api.services;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import io.restassured.response.Response;

public class AuthService extends BaseService {

    private static final String BASE_PATH = "/api/auth/";

    public Response login(LoginRequest payload) {
        return post(payload, BASE_PATH + "login");
    }

    public Response forgotPassword(String payload) {
        return post(payload, BASE_PATH + "forgot-password");
    }

    public Response signup(SignUpRequest payload) {
        return post(payload, BASE_PATH + "signup");
    }
}
