package com.example.doum.mapper.won;

import com.example.doum.domain.dto.won.WonOrganizationReviewDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewMapper {

    void insertReview(WonOrganizationReviewDTO organizationReview);

}
