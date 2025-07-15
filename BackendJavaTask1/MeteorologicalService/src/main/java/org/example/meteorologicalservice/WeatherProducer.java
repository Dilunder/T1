package org.example.meteorologicalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
@EnableScheduling
public class WeatherProducer {
    private static final String topic = "weather";
    private static final List<String> cities = Arrays.asList("Магадан", "Чукотка", "Санкт-петербург", "Тюмень");
    private static final List<String> conditions = Arrays.asList("солнечно", "облачно", "дождь");
    private final Random random = new Random();
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendWeather(){

        String city = cities.get(random.nextInt(cities.size()));
        String weatherCondition = conditions.get(random.nextInt(conditions.size()));
        int temp = random.nextInt(36);
        LocalDate now = LocalDate.now().minusDays(random.nextInt(7));

        String message = String.format("{\"city\":\"%s\",\"date\":\"%s\",\"temp\":%d\",\"condition\":\"%s\"}", city, now, temp, weatherCondition);

        kafkaTemplate.send(topic, city, message);
        System.out.println("Sent to topic: weather");
    }
}
