package org.example.meteorologicalservice;

import org.springframework.kafka.annotation.KafkaListener;

import java.util.HashMap;
import java.util.Map;

public class WeatherConsumer {
    private final Map<String, Integer> weatherData = new HashMap<>();
    private final Map<String, Integer> maxTemp = new HashMap<>();
    private final Map<String, Integer> minTemp = new HashMap<>();

    @KafkaListener(topics = "weather", groupId = "weather-group")
    public void listen(String message){
        System.out.println("Received " + message);
    }
}
// паттерн Matcher