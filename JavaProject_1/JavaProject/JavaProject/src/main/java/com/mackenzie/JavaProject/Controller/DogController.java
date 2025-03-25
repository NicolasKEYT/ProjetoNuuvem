package com.mackenzie.JavaProject.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class DogController {

    private final WebClient webClient;

    public DogController() {
        this.webClient = WebClient.builder()
                .baseUrl("https://dog.ceo/api")
                .defaultHeader("Accept", "application/json")
                .build();
    }

    @GetMapping("/dog")
    public ResponseEntity<Map<String, String>> getDogImage() {
        try {
            // Faz a requisição para a API externa
            Map<String, Object> response = webClient.get()
                    .uri("/breeds/image/random")
                    .retrieve()
                    .bodyToMono(Map.class)
                    .block();

            // Extrai a URL da imagem da resposta
            String imageUrl = (String) response.get("message");

            // Retorna a URL da imagem no formato esperado
            Map<String, String> result = new HashMap<>();
            result.put("url", imageUrl);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            // Retorna uma URL de fallback em caso de erro
            Map<String, String> fallback = new HashMap<>();
            fallback.put("url", "https://example.com/fallback-dog.jpg");
            return ResponseEntity.ok(fallback);
        }
    }
}