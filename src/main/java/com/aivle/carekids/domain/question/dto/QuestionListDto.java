package com.aivle.carekids.domain.question.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class QuestionListDto {
    @NotEmpty
    @JsonProperty("id")
    private Long QuestionId;

    @NotEmpty @JsonProperty("title")
    private String QuestionTitle;
}
