package com.example.doum.service.won;

import com.example.doum.domain.dto.won.WonUserJoinDTO;
import org.springframework.stereotype.Service;

@Service
public interface WonUserJoinService {
    void saveUser(WonUserJoinDTO wonUserJoinDTO);
}
