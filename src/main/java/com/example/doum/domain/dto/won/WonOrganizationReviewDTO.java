package com.example.doum.domain.dto.won;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class WonOrganizationReviewDTO {

    private Long organizationReview;
    private Long organizationId;
    private Long userId;
    private String content;
    private Long rating;
}

