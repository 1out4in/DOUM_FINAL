package com.example.doum.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Getter
@ToString
@NoArgsConstructor
public class AnonymousCommentVO {
    private Long anonymousCommentId;
    private Long anonymousId;
    private Long userId;
    private String content;
    private LocalDateTime createdDate;

    @Builder
    public AnonymousCommentVO(Long anonymousCommentId, Long anonymousId, Long userId, String content, LocalDateTime createdDate) {
        this.anonymousCommentId = anonymousCommentId;
        this.anonymousId = anonymousId;
        this.userId = userId;
        this.content = content;
        this.createdDate = createdDate;
    }
}

