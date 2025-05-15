package com.api.models.response;

import java.util.List;

public class LoginResponse {

    private String token;
    private String type;
    private int id;
    private String username;
    private String email;
    private List<String> roles;

    public LoginResponse() {
    }

    public LoginResponse(String token, String type, int id, String username, String email, List<String> roles) {
        this.token = token;
        this.type = type;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public LoginResponse setToken(String token) {
        this.token = token;
        return this;
    }

    public String getType() {
        return type;
    }

    public LoginResponse setType(String type) {
        this.type = type;
        return this;
    }

    public int getId() {
        return id;
    }

    public LoginResponse setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public LoginResponse setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public LoginResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<String> getRoles() {
        return roles;
    }

    public LoginResponse setRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "token='" + token + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                '}';
    }
}
