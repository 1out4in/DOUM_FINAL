package com.example.doum.mapper.won;


import com.example.doum.domain.dto.won.WonVolunteerDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VolunteerMapper {
    List<WonVolunteerDTO> selectVolunteerTitles();
}