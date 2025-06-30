package com.example;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class UserManagerTest {
    @Test
    public void testCreateUser_sendsNotification() {
        NotificationService mockNotificationService = mock(NotificationService.class);
        UserManager userManager = new UserManager(mockNotificationService);
        userManager.createUser("abc");
        verify(mockNotificationService).notifyUser("Welcome, abc");
    }
}
