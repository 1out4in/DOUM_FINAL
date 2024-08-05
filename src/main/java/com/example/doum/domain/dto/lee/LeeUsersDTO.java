package com.example.doum.domain.dto.lee;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class LeeUsersDTO {
//마이페이지 유저들의 DTO
//erd 에서 유저 테이블

    // 유저 아이디 pk
    private Long userId;
    //유저 이름
    private String name;

    //유저의 이메일
    private String email;
    //유저 등록 날짜
    private LocalDateTime registerDate;
    //생성일
    private String createdDate;
    //유저 위치아이디
    private Long locationId;
    //유저 프로필사진
    private String profilePic;

    //유저 전화번호
    private String phoneNumber;
    //유저 자기소개
    private String introduction;
    //유저 비밀번호
    private String password;
    //승인여부
    private Long emailApprove;
    private Long phoneApprove;

    private LocalDateTime birthDate;
    private String gender;

    private String providerId;
    private String provider;
    private String role;






}
