package com.aivle.carekids.domain.question.dto;

import com.aivle.carekids.domain.common.dto.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class QuestionDto extends BaseDto {
    @NotEmpty
    @JsonProperty("id")
    private Long QuestionId;

    @NotEmpty @JsonProperty("title")
    private String QuestionTitle;

    @NotEmpty @JsonProperty("text")
    private String QuestionText;

    @JsonProperty("check")
    private boolean QuestionCheck;

    @JsonProperty("IsSecret")
    private boolean IsSecret;


}
