package com.example.service;
import com.example.api.WeatherApiClient;
public class WeatherService {
    private final WeatherApiClient apiClient;
    public WeatherService(WeatherApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public int fetchTemperature() {
        return apiClient.getTemperature();
    }
}
