package com.example.doum.domain.dto.won;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class userRiewDTO {
    private Long userReviewId;
    private Long userId;
    private Long orgazizationId;
    private String content;
    private Long Rating;

}
