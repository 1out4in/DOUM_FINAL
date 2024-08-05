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
public class StoryLikeVO {
    private Long storyLikeId;
    private Long storyId;
    private Long userId;

    @Builder
    public StoryLikeVO(Long storyLikeId, Long storyId, Long userId) {
        this.storyLikeId = storyLikeId;
        this.storyId = storyId;
        this.userId = userId;
    }
}
