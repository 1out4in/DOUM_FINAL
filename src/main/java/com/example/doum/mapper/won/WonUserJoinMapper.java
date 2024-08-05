package com.example.doum.mapper.won;

import com.example.doum.domain.dto.won.WonUserJoinDTO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface WonUserJoinMapper {

    void insertUser(WonUserJoinDTO wonUserJoinDTO);
}
