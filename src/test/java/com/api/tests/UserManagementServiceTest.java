package com.api.tests;

import com.api.models.request.ChangePasswordRequest;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileUpdateRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.ProfileResponse;
import com.api.services.AuthService;
import com.api.services.UserManagementService;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListeners.class)
public class UserManagementServiceTest {

    @Test
    public void getProfileTest() {
        AuthService authService = new AuthService();
        LoginRequest loginPayload = new LoginRequest("syed1234", "syed1234");
        Response response = authService.login(loginPayload);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        String token = loginResponse.getToken();

        Response userResponse = new UserManagementService().getProfile(token);
        ProfileResponse profileResponse = userResponse.as(ProfileResponse.class);
        System.out.println(profileResponse.getFirstName());
    }

    @Test
    public void updateProfileTest() {
        AuthService authService = new AuthService();
        LoginRequest loginPayload = new LoginRequest("syed1234", "syed1234");
        Response response = authService.login(loginPayload);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        String token = loginResponse.getToken();

        ProfileUpdateRequest payload = new ProfileUpdateRequest.Builder()
                .setFirstName("sabi")
                .setLastName("rabi")
                .setEmail("cifila6907@bamsrad.com")
                .setMobileNumber("8428443322").build();
        Response userResponse = new UserManagementService().updateProfile(payload, token);
        userResponse.prettyPrint();
        //ProfileResponse profileResponse = userResponse.as(ProfileResponse.class);
        //System.out.println(profileResponse.getFirstName());
    }

    @Test
    public void changePasswordTest() {
        AuthService authService = new AuthService();
        LoginRequest loginPayload = new LoginRequest("syed1234", "syed1234");
        Response response = authService.login(loginPayload);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        String token = loginResponse.getToken();
        System.out.println(token);

        ChangePasswordRequest payload = new ChangePasswordRequest.Builder()
                .currentPassword("syed1234")
                .newPassword("syed1234")
                .confirmPassword("syed1234")
                .build();
        Response changePasswordResponse = new UserManagementService().changePassword(payload, token);
        changePasswordResponse.prettyPrint();
        System.out.println(changePasswordResponse.getStatusCode());
    }
}
