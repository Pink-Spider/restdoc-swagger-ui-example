package io.pinkspider.restdocswaggerui.example.controller;

import io.pinkspider.restdocswaggerui.api.ApiResult;
import io.pinkspider.restdocswaggerui.example.dto.ExampleRequestDto;
import io.pinkspider.restdocswaggerui.example.dto.ExampleResponseDto;
import io.pinkspider.restdocswaggerui.example.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    // Method GET
    // Header 포함
    @PostMapping("/{pathVariable}")
    public ApiResult<?> example01(@RequestHeader HttpHeaders headers,
                                  @PathVariable String pathVariable,
                                  @RequestBody ExampleRequestDto exampleRequestDto) {

        ExampleResponseDto exampleResponseDto = exampleService.example(exampleRequestDto);

        return ApiResult.<ExampleResponseDto>builder()
            .value(exampleResponseDto)
            .build();
    }
}
