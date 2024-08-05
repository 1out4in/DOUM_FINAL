package com.example.doum.service.won;

import com.example.doum.domain.dto.won.WonOrganizationReviewDTO;
import com.example.doum.mapper.won.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewMapper reviewMapper;

    @Override
    public void insertReview(WonOrganizationReviewDTO dto) {
        reviewMapper.insertReview(dto);
    }
}
