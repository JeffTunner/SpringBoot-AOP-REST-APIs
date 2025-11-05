package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Getter
    @Setter
    @AllArgsConstructor
    public static class User {
        private String name;
        private int age;
        private String address;
    }

    private User user;

    public UserService() {
        user = new User("Abhinav Kaushik", 19, "Ghaziabad, India");
    }

    public void logIn() {
        System.out.println("Logging user in");
    }

    public void logout() throws Exception {
        System.out.println("Logging user out");
        throw new Exception("Unable to logout the user");
    }
}
