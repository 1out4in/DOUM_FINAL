package com.example.doum.domain.dto.won;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class WonJoinOrgDTO {

    // 기관 테이블
    private Long organizationId;
    private Long  locationId;
    private String email;
    private String password;
    private String name;
    private Long  phoneNumber;
    private LocalDateTime resisterDate;
    private Long emailApprove;
    private Long   privatePhoneApprove;

    private String managerName;
    private String managerPhoneNumber;
    private String  fileLocation;
    private String status;

    private String  providerId;
    private String provider;
    private String role;


}
