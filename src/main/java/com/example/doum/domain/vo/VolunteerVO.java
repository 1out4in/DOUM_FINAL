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
public class VolunteerVO {
    private Long volunteerId;
    private Long locationId;
    private Long organizationId;
    private String title;
    private String content;
    private String category;
    private String target;
    private LocalDateTime recruitStartDate;
    private LocalDateTime recruitEndDate;
    private Long recruitNumber;
    private LocalDateTime volunteerDate;
    private Long isAdultAllowed;
    private Long isTeenAllowed;
    private Long isOnline;

    @Builder
    public VolunteerVO(Long volunteerId, Long locationId, Long organizationId, String title, String content, String category, String target,
                     LocalDateTime recruitStartDate, LocalDateTime recruitEndDate, Long recruitNumber, LocalDateTime volunteerDate,
                     Long isAdultAllowed, Long isTeenAllowed, Long isOnline) {
        this.volunteerId = volunteerId;
        this.locationId = locationId;
        this.organizationId = organizationId;
        this.title = title;
        this.content = content;
        this.category = category;
        this.target = target;
        this.recruitStartDate = recruitStartDate;
        this.recruitEndDate = recruitEndDate;
        this.recruitNumber = recruitNumber;
        this.volunteerDate = volunteerDate;
        this.isAdultAllowed = isAdultAllowed;
        this.isTeenAllowed = isTeenAllowed;
        this.isOnline = isOnline;
    }
}
