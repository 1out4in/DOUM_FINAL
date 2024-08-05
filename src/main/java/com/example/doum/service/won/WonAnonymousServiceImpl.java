package com.example.doum.service.won;


import com.example.doum.domain.dto.won.WonAnonymousDTO;
import com.example.doum.mapper.won.WonAnonymousMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WonAnonymousServiceImpl implements WonAnonymousService {

  private WonAnonymousMapper wonAnonymousMapper;
  @Autowired
  public WonAnonymousServiceImpl(WonAnonymousMapper wonAnonymousMapper) {
    this.wonAnonymousMapper = wonAnonymousMapper;
  }

    @Override
    public List<WonAnonymousDTO> getAllAnonymousPosts() {
        return wonAnonymousMapper.selectAllAnonymousPosts();
    }
}
