package com.example.doum.domain.dto.won;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class WonUserJoinDTO {
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private LocalDate birthDate;
    private String locationId;
    private String introduction;
    private LocalDateTime registerDate;
    private Long emailApprove;
    private Long phoneApprove;
    private String profilePic;
    private String addressDetail;
}


