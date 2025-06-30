package com.example;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class UserServiceTest {
    @Test
    public void testArgumentMatching() {
        //Create a mock
        UserService userService = mock(UserService.class);
        // Call the method with specific arguments
        userService.sendWelcomeEmail("john@example.com", "john_doe");
        // Use argument matchers to verify the interaction
        verify(userService).sendWelcomeEmail(eq("john@example.com"), anyString());
    }
}
