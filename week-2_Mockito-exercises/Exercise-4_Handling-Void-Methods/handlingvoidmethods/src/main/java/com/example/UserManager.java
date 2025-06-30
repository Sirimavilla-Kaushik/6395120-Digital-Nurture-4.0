package com.example;
public class UserManager {
    private NotificationService notificationService;
    public UserManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void createUser(String username) {
        notificationService.notifyUser("Welcome, " + username);
    }
}
