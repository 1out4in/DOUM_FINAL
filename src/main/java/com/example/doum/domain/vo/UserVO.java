package com.example.doum.domain.vo;

import com.example.doum.domain.dto.lee.LeeUsersDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Getter
@ToString
@NoArgsConstructor
public class UserVO {
    private Long userId;
    private Long locationId;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private LocalDateTime registerDate;
    private Long emailApprove;
    private Long phoneApprove;
    private LocalDateTime birthDate;
    private String introduction;
    private String providerId;
    private String provider;
    private String role;

    @Builder
    public UserVO(Long userId, Long locationId, String email, String password, String name, String phoneNumber, LocalDateTime registerDate,
                Long emailApprove, Long phoneApprove, LocalDateTime birthDate, String introduction) {
        this.userId = userId;
        this.locationId = locationId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.registerDate = registerDate;
        this.emailApprove = emailApprove;
        this.phoneApprove = phoneApprove;
        this.birthDate = birthDate;
        this.introduction = introduction;
    }
    //entity 추가 0722 이현수
    public static UserVO toEntity(LeeUsersDTO usersDTO) {

        return UserVO.builder().userId(usersDTO.getUserId())
                .locationId(usersDTO.getLocationId())
                .email(usersDTO.getEmail())
                .password(usersDTO.getPassword())
                .name(usersDTO.getName())
                .phoneNumber(usersDTO.getPhoneNumber())
                .registerDate(usersDTO.getRegisterDate())
                .emailApprove(usersDTO.getEmailApprove())
                .phoneApprove(usersDTO.getPhoneApprove())
                .birthDate(usersDTO.getBirthDate())


                .build();

    }




}
