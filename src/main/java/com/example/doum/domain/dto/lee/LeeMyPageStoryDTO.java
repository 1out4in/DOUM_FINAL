package com.example.doum.domain.dto.lee;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class LeeMyPageStoryDTO {

    //개인 스토리 (마이 페이지 속 봉사 게시물)
    //그니까 마이페이지의 디테일.


    //pk
    private Long storyId;
    //작성자 .. providerID?
    private Long userId;

    private Long anonymousId;
    //게시물 제목
    private String title;
    //게시물 내용
    private String content;
    //게시물의 조회수
    private int view;

    //첨부파일 갯수
    private int fileCount;
    // 게시물 좋아요 수
    private int like;
    // 게시물 지원한 봉사자의 아이디
    private Long appliedVolunteerId;

    private LocalDateTime createdDate;
    private Long views;




}
