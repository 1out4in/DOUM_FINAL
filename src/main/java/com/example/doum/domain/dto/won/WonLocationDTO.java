package com.example.doum.domain.dto.won;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class WonLocationDTO {
    //    주소 테이블
    private Long location;
    private String city;
    private String address;
}
