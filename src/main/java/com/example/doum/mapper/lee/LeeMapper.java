package com.example.doum.mapper.lee;


import com.example.doum.domain.dto.lee.*;

import com.example.doum.domain.vo.StoryCommentVO;
import com.example.doum.domain.vo.StoryImageVO;
import com.example.doum.domain.vo.StoryVO;
import com.example.doum.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LeeMapper {

  //  void getDate();


    //마이페이지 유저 프로필 정보
   LeeUsersDTO getUser(Long userId);

   //searchUsers 유저들
    List<LeeUsersDTO> getUsers();

     //마이페이지 유저가 작성한 게시물 목록 가져오기
     List<LeeMyPageStoryDTO> getStories(Long userId);


    // 게시글 작성
    void saveStory(LeeMyPageStoryDTO story);


    // 게시판 총 갯수
    // 페이징 처리할 때 사용할 쿼리
    int countMyPageStories();




    // 다음 시퀀스 가져오기
    // 게시글 작성 때 사용할 쿼리ㅇㅇ
    long getSeq();

    //마이페이지 스토리 삭제 ㅇㅇ
    void deleteStory(Long storyId);
    // 조회 수 +1
//    void plusStoryView(Long storyId);


 // 게시글 수정하기
 void updateStory(StoryVO storyVO);



    //fileMapper
    // 첨부파일 insert ㅇㅇ
    // 첨부파일은 게시글이 insert 될 때 날아가면 된다.
    void insertFile(StoryImageVO storyImageVO);

    //마이페이지 스토리 상세보기ㅇㅇ
    LeeMyPageStoryDTO selectMyPageStory(Long storyId);



    //스토리에 올린 이미지 db에서 삭제
    //게시글 업데이트 할 때 사용할 예정
    void deleteStoryImg(Long storyId);

    //스토리에 올린 이미지들 리스트 ㅇㅇ(스토리아이디로 가져오는거임)
    List<LeeStoryImageDTO> selectStoryImgList(Long storyId);

    //스토리에 올린 이미지 (그 스토리이미지아이디로 가져오는거임) ㅇㅇ
    LeeStoryImageDTO getStoryImgById(Long storyImgId);

    // 해당 스토리의 댓글 목록 보기 ㅇㅇ
    List<LeeCommentListDTO> selectCommentById(Long storyId);




    //마이 페이지 스토리에 댓글 달기
    void insertStoryComment(StoryCommentVO storyCommentVO);
    //마이 페이지 스토리 댓글 삭제
    void deleteStoryComment(Long storyCommentId);
    //마이페이지 스토리 댓글 수정후 업데이트
    void updateStoryComment(StoryCommentVO storyCommentVO);


    List<UserVO> selectUser(String search);




    //마이페이지 게시물에 달린 공감 수
    //Long getLikes(String storyId);

    //마이페이지 유저가 받은 리뷰 가져오기
    //List<UserReviewDTO> getReviews(String userId);



    //마이페이지 스토리 수정
    //void updateStory(String storyId, String title,String content);




    //마이페이지 유저가 작성한 게시물 목록
    //List<LeeMyPageStoryDTO> getStories(String userId);

    //마이페이지 총 스토리 갯수
    //Long countStories();


    //마이페이지 속 스토리에 달린 댓글
    //List<LeeCommentDTO> getComments(String storyId);


//            leeMapper.updateProfilePic(userId, fileDbPath);
    void updateProfilePic(@Param("userId") Long userId, @Param("filePath") String filePath);



    void updateIntroduction(@Param("userId") Long userId, @Param("introduction") String introduction);

// 마이페이지 기관이 쓴 유저의 리뷰상세보기
    List<LeeOrgReviewDTO> findReviewsByUserId(Long userId);




}
