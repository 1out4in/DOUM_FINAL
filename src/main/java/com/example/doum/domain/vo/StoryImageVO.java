package com.example.doum.domain.vo;


import com.example.doum.domain.dto.lee.LeeStoryImageDTO;
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
public class StoryImageVO {
    private Long storyImgId;
    private Long storyId;
    private String fileLocation;

    @Builder
    public StoryImageVO(Long storyImgId, Long storyId, String fileLocation) {
        this.storyImgId = storyImgId;
        this.storyId = storyId;
        this.fileLocation = fileLocation;
    }



//    toentity추가
    public static StoryImageVO toEntity(LeeStoryImageDTO storyImageDTO){
    return StoryImageVO.builder().storyImgId(storyImageDTO.getStoryImgId())
            .storyId(storyImageDTO.getStoryId())
            .fileLocation(storyImageDTO.getFileLocation())
            .build();


}
}

