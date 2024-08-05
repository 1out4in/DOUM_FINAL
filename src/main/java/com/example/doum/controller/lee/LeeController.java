package com.example.doum.controller.lee;


import com.example.doum.domain.dto.lee.*;
import com.example.doum.domain.vo.UserVO;
import com.example.doum.mapper.lee.LeeMapper;
import com.example.doum.service.lee.LeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;



@Controller
@RequestMapping("/Lee")
@RequiredArgsConstructor
public class LeeController {


    private final LeeService leeService;
   // private final FileService fileService;

   private final LeeMapper leeMapper;
    private final UserVO userVO;
//마이페이지 띄우기 ㅇㅇ
    @GetMapping("/myPage/{userId}")
    public String myPage(@PathVariable long userId, Model model) {
        LeeUsersDTO user= leeService.getUserById(userId);
        //게시물 리스트가 필요함
        List<LeeMyPageStoryDTO> stories = leeService.getStoriesByUserId(userId);
        List<LeeStoryImageDTO> storyImg = leeService.getStoryImgListByStoryId(userId);

        model.addAttribute("user", user);
        model.addAttribute("stories", stories);
        model.addAttribute("storyImg", storyImg);

        return "lee/myPage";
    }



    @GetMapping("/searchUser/{userId}")
    public String searchUser(@PathVariable long userId, Model model) {
        LeeUsersDTO user= leeService.getUserById(userId);
        // 유저들 리스트가 필요
//        List<LeeUsersDTO> users = leeService.getUsersById(userId);
        List<LeeUsersDTO> users = leeService.getAllUsers();
        model.addAttribute("user", user);
        model.addAttribute("users", users);
        return "lee/searchUser";

    }


//마이페이지 스토리 띄우기 ㅇㅇ
//    @GetMapping("/story(others)/{storyId}")
//    public String getStory(@PathVariable long storyId, Model model) {
////        LeeMyPageStoryDTO storyDTO = new LeeMyPageStoryDTO();
//        LeeMyPageStoryDTO story = leeService.getStoryById(storyId);
//        List<LeeCommentListDTO> comments = leeService.getCommentById(storyId);
//      //  LeeCommentDTO comment = leeService.getCommentById(storyId);
//        List<LeeStoryImageDTO> storyImg = leeService.getStoryImgById(storyId);
//
//
//        model.addAttribute("story", story);
//        model.addAttribute("comments", comments);
//        model.addAttribute("storyImg", storyImg);
//
//        return "lee/story(others)";
//    }


// 마이페이지 누르면 스토리 뜨게끔 하기
//    @GetMapping("/story(others)/{storyId}")
//    public String story(@PathVariable("storyId") long storyId, Model model) {
//        LeeMyPageStoryDTO story = leeService.getStoryById(storyId);
//        List<LeeCommentListDTO> comments = leeService.getCommentById(storyId);
//        List<LeeStoryImageDTO> storyImg = leeService.getStoryImgById(storyId);
//
//        model.addAttribute("story", story);
//        model.addAttribute("comments", comments);
//        model.addAttribute("storyImg", storyImg);
//        return "lee/story(others)";
//
//    }

    //스토리 띄우느넉 이거 맞음 잠깐 주석
    @GetMapping("/story/{storyId}")
    public String story(@PathVariable("storyId") long storyId, Model model) {
        LeeMyPageStoryDTO story = leeService.getStoryById(storyId);
        List<LeeCommentListDTO> comments = leeService.getCommentById(storyId);
        List<LeeStoryImageDTO> storyImg = leeService.getStoryImgById(storyId);
//        스토리 좋아요
//        LeeStoryLikeDTO like = leeService.


        model.addAttribute("story", story);
        model.addAttribute("comments", comments);
        model.addAttribute("storyImg", storyImg);
        return "lee/story";

    }

//        @GetMapping("/storyy/{storyId}")
//    public String story(@PathVariable("storyId") long storyId, Model model) {
//        LeeMyPageStoryDTO story = leeService.getStoryById(storyId);
//        List<LeeCommentListDTO> comments = leeService.getCommentById(storyId);
//        List<LeeStoryImageDTO> storyImg = leeService.getStoryImgById(storyId);
//
//        model.addAttribute("story", story);
//        model.addAttribute("comments", comments);
//        model.addAttribute("storyImg", storyImg);
//        return "lee/storyy";
//
//    }


//마이페이지 프로필 수정
// LeeController.java

    @PostMapping("/updateProfilePic")
    public String updateProfilePic(@RequestParam("profilePic") MultipartFile profilePic, @RequestParam("userId") Long userId) {
        leeService.updateProfilePic(userId, profilePic);
        return "redirect:/Lee/myPage/" + userId;
    }

//마이페이지 자기소개글 수정

    @PostMapping("/updateIntroduction")
    public String updateIntroduction(@RequestParam("introduction") String introduction, @RequestParam("userId") Long userId) {
        leeService.updateIntroduction(userId, introduction);
        return "redirect:/Lee/myPage/" + userId;
    }

//    마이페이지 리뷰 상세보기
@GetMapping("/reviews")
@ResponseBody
public List<LeeOrgReviewDTO> getReviewsForUser(@RequestParam Long userId) {
    return leeService.getReviewsForUser(userId);
}













//자기소개글 수정 버튼 누른 경우 자기소개 수정페이지로 이동
//    @GetMapping("/edit-introduction")
//    public String editIntroduction(Model model, @AuthenticationPrincipal LeeUsersDTO usersDTO) {
//        Long userId = userVO.getUserId();
//       UserVO user = leeService.getUserById(userId);
//        model.addAttribute("user", user);
//        return "kim/edit-introduction"; // 1365테마 자기소개수정페이지 아직 없삼.합쳐야 생김
//
//    }

    //프로필 사진 버튼 클릭 시
//    @PostMapping
//    public String updateProfilePic(@RequestParam("profilePic") MultipartFile profilePic, @AuthenticationPrincipal LeeUsersDTO usersDTO,
//                                   Model model) {
//
//
//        Long userId = userVO.getUserId();
//        leeService.updateProfilePic(userId, profilePic);
//
//        return "redirect:/Lee/myPage";
//    }

//    //마이페이지 스토리 작성 폼으로 이동 ㅇㅇ
//    @GetMapping("/writingStoryT")
//    public String writingStory(Model model) {
////        System.out.println("writingStory 메소드가 호출되었습니다.");
//        model.addAttribute("story", new LeeMyPageStoryDTO());
//        return "lee/writingStoryT";
//    }

    //마이페이지 스토리 작성 폼으로 이동 ㅇㅇ
//    @GetMapping("/writingStoryT")
//    public String writingStory(Model model) {
////        System.out.println("writingStory 메소드가 호출되었습니다.");
//        model.addAttribute("story", new LeeMyPageStoryDTO());
//        return "lee/writingStoryT";
//    }

    @GetMapping("/writingStoryT/{userId}")
    public String writingStory(@PathVariable Long userId,Model model) {
//        System.out.println("writingStory 메소드가 호출되었습니다.");
//        model.addAttribute("userId", userId);
        model.addAttribute("story", new LeeMyPageStoryDTO());
        return "lee/writingStoryT";
    }





    //스토리 작성 처리 로그인 처리 하고나서야 가능해질듯 ---? ? ?
    @PostMapping("/writingStoryT")
    public String write(LeeMyPageStoryDTO story,
//                        @RequestParam("userId")Long userId,
                        List<MultipartFile> files) {

//        story.setUserId(userId);
        leeService.saveStory(story,files);
//        return "redirect:/Lee/myPage/" + userId;
//        return "redirect:/Lee/story/" + story.getStoryId();
        return "redirect:/Lee/myPage/" + story.getStoryId();


//        return "redirect:/lee/myPage";
//        return "redirect:/Lee/story/"+story.getStoryId();

    }



//스토리 작성 처리 로그인 처리 하고나서야 가능해질듯 ---? ? ?
//    @PostMapping("/writingStoryT")
//    public String write(LeeMyPageStoryDTO story,@RequestParam("userId") Long userId,
//                        @RequestParam("attachment") List<MultipartFile> files) {
//
//        story.setUserId(userId);
//        leeService.saveStory(story,files);
//        return "redirect:/lee/myPage";
//    }







    //
//    //마이페이지 스토리 작성 폼으로 이동 수정중
//    @GetMapping("/writingStoryT")
//    public String writingStory(@PathVariable("userId") long userId,
//                               Model model) {
//
//        LeeUsersDTO user = leeService.getUserById(userId);
//
//        model.addAttribute("story", new LeeMyPageStoryDTO());
//        return "lee/writingStoryT";
//    }



//    @PostMapping("/writingStoryT")
//    public String submitWritingStory(@RequestParam("volunteerType") String volunteerType,
//                                    @RequestParam("attachment") MultipartFile attachment,
//                                    @RequestParam("content") String content,
//                                     Model model) {
//
//
//
//        return "redirect:/Lee/myPage";
//    }





//
//    //스토리 작성 처리 ㄴㄴ 아직
//    @PostMapping("/writingStoryT")
//    public String write(LeeMyPageStoryDTO story, @RequestParam("userId") Long userId,
//                        @RequestParam("attachment") List<MultipartFile> files) {
//        story.setUserId(userId);
//
//        leeService.saveStory(story,files);
//        return "redirect:/lee/myPage";
////        return "redirect:/Lee/myPage-orgSee/" + userId;
////        return "lee/writingStory";
//    }




    //마이 스토리 상세보기
//    @GetMapping("/story(others)/{storyId}")
//    public String story(@PathVariable("storyId") Long storyId, Model model) {
//
//        LeeMyPageStoryDTO story = leeService.getStoryById(storyId);
//        List<LeeStoryImageDTO> img = leeService.getStoryImgListByStoryId(storyId);
//
//        model.addAttribute("story", story);
//        model.addAttribute("img", img);
//        return "lee/myPage-story";
//    }


    //스토리 수정 폼으로 이동
//    @GetMapping("/editStory/{storyId}")
//    public String editStory(@PathVariable Long storyId,Model model) {
//        model.addAttribute("story", leeService.getStoryById(storyId));
//        return "lee/editStory";
//    }


    @GetMapping("/editStory/{storyId}")
    public String editStory(@PathVariable Long storyId,Model model){
        LeeMyPageStoryDTO story = leeService.getStoryById(storyId);

        List<LeeStoryImageDTO> images = leeService.getStoryImgListByStoryId(storyId);
        model.addAttribute("story", story);
        model.addAttribute("images", images);


        return "lee/editStory";
    }


    @PostMapping("/editStory")
    public String editStory(LeeMyPageStoryDTO story,List<MultipartFile> files){
        System.out.println("들어옴");
        leeService.updateStory(story,files);

        return "redirect:/Lee/story/"+story.getStoryId();
//        return "redirect:/Lee/story/"+story.getStoryId();

    }



    @PostMapping("/delete/{storyId}")
    public String deleteStory(@PathVariable Long storyId) {
        leeService.deleteStory(storyId);
        return "redirect:/lee/myPage";


    }





    //스토리 수정
//    @PostMapping("/editStory")
//    public String editStory(LeeMyPageStoryDTO story, List<MultipartFile> files) {
//        leeService.updateStory(story , files);
//
//        return "redirect:/lee/myPage-user" + story.getUserId();
//    }



    //마이페이지 스토리 삭제
//    @PostMapping("/delete/{storyId}")
//    public String delete(@PathVariable Long storyId) {
//        leeService.deleteStory(storyId);
//        return "redirect:/lee/myPage-user";
//    }






//    댓 글 !! (rest..?)
//
//    //댓글 조회
//    @GetMapping("/{storyId}")
//    public ResponseEntity<?> getStoryComment(@PathVariable Long storyId) {
//        return ResponseEntity.ok(leeService.getStoryById(storyId));
//    }
//
//    //댓글 추가
//    @PostMapping
//    public ResponseEntity<?> addStoryComment(@RequestBody LeeCommentDTO commentDTO) {
//        leeService.saveStoryComment(commentDTO);
//
//        return ResponseEntity.ok().build();
//    }
//
//    //댓글 삭제
//    @DeleteMapping("/{commentId}")
//    public ResponseEntity<?> deleteStoryComment(@PathVariable Long commentId) {
//
//        leeService.deleteStoryComment(commentId);
//
//        return ResponseEntity.ok().build();
//    }
//
//
//    //댓글 수정
//
//    @PutMapping("/{commentId}")
//    public ResponseEntity<?> updateStoryComment(@PathVariable Long commentId,@RequestBody LeeCommentDTO commentDTO) {
//
//        commentDTO.setStoryCommentId(commentId);
//        leeService.updateStoryComment(commentDTO);
//        return ResponseEntity.ok().build();
//    }

//스토리 이미지 !! (파일.) ( rest..?) -"??






//유저 검색












}
