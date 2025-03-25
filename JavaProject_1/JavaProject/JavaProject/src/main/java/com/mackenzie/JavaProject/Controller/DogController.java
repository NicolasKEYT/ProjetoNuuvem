package com.mackenzie.JavaProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class DogController {

    @GetMapping("/test")
    public String test() {
        return "API is working!";
    }

    private final WebClient webClient;

    public DogController() {
        this.webClient = WebClient.builder()
                .baseUrl("https://dog.ceo/api")
                .defaultHeader("Accept", "application/json")
                .build();
    }

    @GetMapping("/dog")
    public Map<String, Object> getdogImage() {
        try {
            @SuppressWarnings("rawtypes")
            Map response = webClient.get()
                    .uri("/breeds/image/random")
                    .retrieve()
                    .bodyToMono(Map.class)
                    .block();

            Map<String, Object> result = new HashMap<>();
            result.put("url", response.get("message"));
            return result;
        } catch (Exception e) {
            Map<String, Object> fallback = new HashMap<>();
            fallback.put("url", "URL DA API");
            return fallback;
        }
    }
}
