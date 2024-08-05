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
public class UserReviewVO {
    private Long userReviewId;
    private Long userId;
    private Long organizationId;
    private String content;
    private Long rating;

    @Builder
    public UserReviewVO(Long userReviewId, Long userId, Long organizationId, String content, Long rating) {
        this.userReviewId = userReviewId;
        this.userId = userId;
        this.organizationId = organizationId;
        this.content = content;
        this.rating = rating;
    }
}

