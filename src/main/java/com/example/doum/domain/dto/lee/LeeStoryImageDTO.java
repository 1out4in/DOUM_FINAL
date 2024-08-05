package com.example.doum.domain.dto.lee;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class LeeStoryImageDTO {
    //마이스토리 게시물에 들어가는 파일.


    //올린 파일(사진)의 아이디
    private Long storyImgId;
    //올린 파일 해당 스토리 아이디
    private Long storyId;
    // 올린 파일 경로
    private String fileLocation;








}
