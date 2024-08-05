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
public class OrganizationNotificationVO {
    private Long organizationNotificationId;
    private Long organizationId;
    private String title;
    private String content;
    private String status;

    @Builder
    public OrganizationNotificationVO(Long organizationNotificationId, Long organizationId, String title, String content, String status) {
        this.organizationNotificationId = organizationNotificationId;
        this.organizationId = organizationId;
        this.title = title;
        this.content = content;
        this.status = status;
    }
}
