package com.example.service;
import com.example.api.WeatherApiClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class WeatherServiceTest {
    @Mock
    WeatherApiClient apiClient;

    @InjectMocks
    WeatherService weatherService;

    @Test
    void fetchTemperature_returnsValuesInSequence() {
        when(apiClient.getTemperature()).thenReturn(25, 28, 30);
        assertEquals(25, weatherService.fetchTemperature());
        assertEquals(28, weatherService.fetchTemperature());
        assertEquals(30, weatherService.fetchTemperature());
        verify(apiClient, times(3)).getTemperature();
    }
}
