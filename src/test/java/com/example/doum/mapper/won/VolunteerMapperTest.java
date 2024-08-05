package com.example.doum.mapper.won;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VolunteerMapperTest {

    @Autowired
    private VolunteerMapper mapper;

    @Test
    void test(){

        System.out.println(mapper.selectVolunteerTitles());

    }




}