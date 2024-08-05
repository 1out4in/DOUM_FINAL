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
public class AnnouncementVO {
    private Long announcementId;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    @Builder
    public AnnouncementVO(Long announcementId, String title, String content, LocalDateTime createdDate) {
        this.announcementId = announcementId;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
    }
}
