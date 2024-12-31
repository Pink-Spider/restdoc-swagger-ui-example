package io.pinkspider.restdocswaggerui.example.service;

import io.pinkspider.restdocswaggerui.example.dto.ExampleRequestDto;
import io.pinkspider.restdocswaggerui.example.dto.ExampleResponseDto;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public ExampleResponseDto example(ExampleRequestDto exampleRequestDto) {
        return ExampleResponseDto.builder()
            .name("name")
            .age(10)
            .hobbies(Arrays.asList("piano", "coding"))
            .build();
    }
}
