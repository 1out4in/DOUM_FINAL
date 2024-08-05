package com.example.doum.service.won;

import com.example.doum.domain.dto.won.WonUserJoinDTO;
import com.example.doum.mapper.won.WonUserJoinMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WonUserJoinServiceImpl implements WonUserJoinService {

    private final WonUserJoinMapper wonUserJoinMapper;

    @Override
    public void saveUser(WonUserJoinDTO wonUserJoinDTO) {
        wonUserJoinMapper.insertUser(wonUserJoinDTO);

    }
}
