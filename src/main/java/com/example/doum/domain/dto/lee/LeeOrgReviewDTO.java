package com.example.doum.domain.dto.lee;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LeeOrgReviewDTO {

    private Long organizationReviewId;
    private Long organizationId;
    private Long userId;
    private String content;
    private int rating;





}
