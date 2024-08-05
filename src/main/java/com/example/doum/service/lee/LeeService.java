package com.example.doum.service.lee;

import com.example.doum.domain.dto.lee.*;
import com.example.doum.domain.vo.UserVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface LeeService {

   LeeUsersDTO getUserById(Long userId);

   List<LeeUsersDTO> getAllUsers();


    //게시물(내 스토리들) 목록
   List<LeeMyPageStoryDTO> getStoriesByUserId(Long userId);

 // 마이페이지 스토리 상세보기 (custom~ 나중에 추가) !~~~~~~
 LeeMyPageStoryDTO getStoryById(Long storyId);


 // 스토리 총 갯수
    // 페이징 처리할 때 사용할 쿼리
    int getMyPageStoriesCount();


    //게시물(story) 작성 ㅇㅇ
   void saveStory(LeeMyPageStoryDTO myPageStory, List<MultipartFile> files);

    //마이 페이지 스토리 삭제 ㅇㅇ
    void deleteStory(Long storyId);

    // 스토리 업데이트
    // 수정하기를 누르면, 첨부파일은 초기화가 되게끔 구현.
    void updateStory(LeeMyPageStoryDTO story, List<MultipartFile> files);



    //마이페이지 스토리에 들어가는 파일(사진) ㅇㅇ
    void saveFile(Long storyId, List<MultipartFile> files);


    //마이페이지 스토리 이미지 리스트로 가져오기
    List<LeeStoryImageDTO> getStoryImgListByStoryId(Long storyId);

    //마이페이지 스토리 이미지 정보 그 이미지 아이디로 가져오기
    List<LeeStoryImageDTO> getStoryImgById(Long storyImgId);

    // 해당 마이페이지 스토리의 댓글 목록 보기
    List<LeeCommentListDTO> getCommentById(Long storyId);


    //마이페이지 스토리 댓글 남기기 ㅇㅇ
    void saveStoryComment(LeeCommentDTO leeCommentDTO);
    //마이페이지 스토리 댓글 삭제 ㅇㅇ
    void deleteStoryComment(Long storyCommentId);
    //마이페이지 스토리 댓글 수정 ㅇㅇ
    void updateStoryComment(LeeCommentDTO leeCommentDTO);

    public List<UserVO> searchUsers(String search);

    void updateProfilePic(Long userId, MultipartFile profilePic);


    void updateIntroduction(Long userId, String introduction);


   List<LeeOrgReviewDTO> getReviewsForUser(Long userId);
//   스토리 좋아요
//    void LeeStoryLikeDTO(Long storyId, Long userId);


}
