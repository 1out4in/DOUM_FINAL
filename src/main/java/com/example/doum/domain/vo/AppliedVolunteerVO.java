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
public class AppliedVolunteerVO {
    private Long appliedVolunteerId;
    private Long volunteerId;
    private Long userId;
    private LocalDateTime appliedDate;
    private String status;

    @Builder
    public AppliedVolunteerVO(Long appliedVolunteerId, Long volunteerId, Long userId, LocalDateTime appliedDate, String status) {
        this.appliedVolunteerId = appliedVolunteerId;
        this.volunteerId = volunteerId;
        this.userId = userId;
        this.appliedDate = appliedDate;
        this.status = status;
    }
}
