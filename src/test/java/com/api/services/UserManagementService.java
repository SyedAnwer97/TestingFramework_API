package com.api.services;

import com.api.models.request.ChangePasswordRequest;
import com.api.models.request.ProfileUpdateRequest;
import io.restassured.response.Response;

public class UserManagementService extends BaseService {

    public static final String BASE_PATH = "/api/users/";

    public Response getProfile(String token) {
        setAuthToken(token);
        return get(BASE_PATH + "profile");
    }

    public Response updateProfile(ProfileUpdateRequest payload, String token) {
        setAuthToken(token);
        return put(payload, BASE_PATH + "profile");
    }

    public Response changePassword(ChangePasswordRequest payload, String token) {
        setAuthToken(token);
        return put(payload, BASE_PATH + "change-password");
    }
}
