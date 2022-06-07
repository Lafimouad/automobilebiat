package com.pfevalue.automobilebiat;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "AutomobileBiat", version = "2.0", description = "AutomobileBiat Information"))

public class AutomobilebiatApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutomobilebiatApplication.class, args);
    }

}
