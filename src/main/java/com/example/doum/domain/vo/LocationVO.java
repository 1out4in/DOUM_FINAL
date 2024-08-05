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
public class LocationVO {
    private Long locationId;
    private String city;
    private String address;
    private String detail;


    // Parameterized constructor
    @Builder
    public LocationVO(Long locationId, String city, String address, String detail) {
        this.locationId = locationId;
        this.city = city;
        this.address = address;
        this.detail = detail;
    }
}
