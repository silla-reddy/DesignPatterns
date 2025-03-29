package com.pattern2.builder;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;

    // Private constructor to enforce the use of Builder
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.age = builder.age;
    }

    // Getters (No setters to ensure immutability)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public int getAge() { return age; }

    // Static Builder Class
    // Doesn't need to be static class builder class can be a separate class and there should be a method to return User object.
    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private int age;

        // Builder methods for each field
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        // Build method to return a User object
        public User build() {
            return new User(this);
        }
    }
}
