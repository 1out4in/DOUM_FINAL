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
public class UserNotificationVO {
    private Long userNotificationId;
    private Long userId;
    private String title;
    private String content;
    private String status;

    @Builder
    public UserNotificationVO(Long userNotificationId, Long userId, String title, String content, String status) {
        this.userNotificationId = userNotificationId;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.status = status;
    }
}
