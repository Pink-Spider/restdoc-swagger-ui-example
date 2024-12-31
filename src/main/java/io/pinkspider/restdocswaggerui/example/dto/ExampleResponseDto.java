package io.pinkspider.restdocswaggerui.example.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExampleResponseDto {

    private String name;

    private Integer age;

    private List<String> hobbies;

    private List<SubClass> subClassList;

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SubClass {

        private String subName;
        private Integer subAge;
    }
}
