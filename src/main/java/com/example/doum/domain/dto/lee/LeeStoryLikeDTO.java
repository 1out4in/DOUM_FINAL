package com.example.doum.domain.dto.lee;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LeeStoryLikeDTO {

    private Long storyLikeId;
    private Long storyId;
    private Long userId;




}
