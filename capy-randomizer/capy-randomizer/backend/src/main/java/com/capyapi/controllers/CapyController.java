package com.capyapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import lombok.Data;

@RestController
@RequestMapping("/capy")
public class CapyController {

    private static final String API_URL = "https://api.capy.lol/v1/capybara?json=true";

    @GetMapping
    public CapyResponse getRandomCapy() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, CapyResponse.class);
    }
}

@Data
class CapyResponse {
    private String capybara;
}
