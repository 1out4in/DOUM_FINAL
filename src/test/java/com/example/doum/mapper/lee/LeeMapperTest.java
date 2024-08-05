package com.example.doum.mapper.lee;

import com.example.doum.DoumApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = DoumApplication.class)
@Slf4j
class LeeMapperTest {

    @Autowired
    private LeeMapper leeMapper;

    @Test
    void test(){
//        log.info("{}", leeMapper.getUser("1").toString());
        log.info("{}",leeMapper.getStories(Long.valueOf("1")).toString());
    }

}