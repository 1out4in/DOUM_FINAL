package com.example.doum.service.won;

import com.example.doum.domain.dto.won.WonVolunteerDTO;
import com.example.doum.mapper.won.VolunteerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerServiceImpl implements VolunteerService {

    private final VolunteerMapper volunteerMapper;

    @Autowired
    public VolunteerServiceImpl(VolunteerMapper volunteerMapper) {
        this.volunteerMapper = volunteerMapper;
    }

    @Override
    public List<WonVolunteerDTO> getVolunteerTitles() {
        return volunteerMapper.selectVolunteerTitles();
    }
}
