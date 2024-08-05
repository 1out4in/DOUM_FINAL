package com.example.doum.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
@NoArgsConstructor
public class OrganizationReviewVO {
    private Long organizationReviewId;
    private Long organizationId;
    private Long userId;
    private String content;
    private Long rating;

    @Builder
    public OrganizationReviewVO(Long organizationReviewId, Long organizationId, Long userId, String content, Long rating) {
        this.organizationReviewId = organizationReviewId;
        this.organizationId = organizationId;
        this.userId = userId;
        this.content = content;
        this.rating = rating;
    }
}

