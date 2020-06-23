package com.taxi.apipassenger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiPassengerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiPassengerApplication.class, args);
    }
    @Value("${zone.name}")
    private String zoneName;

    @GetMapping("/zoneName")
    public String apiPassenger(){
        return zoneName;
    }
}
