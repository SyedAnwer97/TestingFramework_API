package com.api.models.request;

public class ProfileUpdateRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;

    public ProfileUpdateRequest() {
    }

    private ProfileUpdateRequest(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.mobileNumber = builder.mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String mobileNumber;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public ProfileUpdateRequest build() {
            return new ProfileUpdateRequest(this);
        }
    }
}
