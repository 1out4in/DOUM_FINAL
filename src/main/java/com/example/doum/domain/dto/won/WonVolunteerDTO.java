package com.example.doum.domain.dto.won;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
public class WonVolunteerDTO {
    private Long volunteerId;
    private Long locationId;
    private Long rganizationId;
    private String title;
    private String content;
    private String category;
    private String target;
    private LocalDateTime recruitStartDate;
    private LocalDateTime recruitEndDate;
    private Long recruitNumber;
    private LocalDateTime volunteerDate;
    private  Long isAdultAllowed;
    private Long isTeenAllowed;
    private Long isOnline;
}

