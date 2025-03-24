package io.pinkspider.restdocswaggerui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class RestdocSwaggerUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestdocSwaggerUiApplication.class, args);
    }
}
