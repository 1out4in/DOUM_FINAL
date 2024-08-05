package com.example.doum.domain.dto.lee;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LeeCommentListDTO {


    //개인스토리 댓글 아이디
    private Long storyCommentId;
    //개인 스토리 아이디 (댓글 단)
    private Long storyId;
    //댓글 단 사람의 아이디
    private Long userId;
    //댓글 내용
    private String content;
    //댓글 작성 날짜
    private LocalDateTime createdTime;
    //댓글 수정 날짜
    private LocalDateTime updatedTime;

}
