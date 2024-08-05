package com.example.doum.service.won;

import com.example.doum.domain.dto.won.WonOrganizationReviewDTO;
import org.springframework.stereotype.Service;

@Service
public interface ReviewService {

    public void insertReview(WonOrganizationReviewDTO dto);

}
