package com.api.models.response;

public class ProfileResponse {

    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    public ProfileResponse() {}

    private ProfileResponse(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.mobileNumber = builder.mobileNumber;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public static class Builder {
        private int id;
        private String username;
        private String email;
        private String firstName;
        private String lastName;
        private String mobileNumber;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public ProfileResponse build() {
            return new ProfileResponse(this);
        }
    }
}
