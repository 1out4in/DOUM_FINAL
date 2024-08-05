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
public class AnonymousVO {
    private Long anonymousId;
    private Long userId;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private Long views;

    @Builder
    public AnonymousVO(Long anonymousId, Long userId, String title, String content, LocalDateTime createdDate, Long views) {
        this.anonymousId = anonymousId;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.views = views;
    }
}

