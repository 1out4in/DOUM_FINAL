package com.example.doum.mapper.won;


import com.example.doum.domain.dto.won.WonAnonymousDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WonAnonymousMapper {

    // 모든 익명 게시글 조회
    List<WonAnonymousDTO> selectAllAnonymousPosts();

}
