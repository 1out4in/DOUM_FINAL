package com.example.doum.controller.lee;


import com.example.doum.domain.dto.lee.LeeCommentDTO;
import com.example.doum.service.lee.LeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentRestController {



    private final LeeService leeService;


    // 댓글 조회 (특정 게시글의 모든 댓글 조회하기)
    @GetMapping("/{storyId}")
    public ResponseEntity<?> getComment(@PathVariable Long storyId) {
        return ResponseEntity.ok(leeService.getCommentById(storyId));
    }

    // 댓글 추가
    @PostMapping
    public ResponseEntity<?> addComment(@RequestBody LeeCommentDTO commentDTO) {
        leeService.saveStoryComment(commentDTO);

        return ResponseEntity.ok().build();
    }

    // 삭제 추가
    @DeleteMapping("/{storyCommentId}")
    public ResponseEntity<?> deleteComment(@PathVariable Long storyCommentId) {
        leeService.deleteStoryComment(storyCommentId);

        return ResponseEntity.ok().build();
    }

    // 댓글 수정
//    @PutMapping("/{commentId}")
//    public ResponseEntity<?> updateComment(@PathVariable Long storyCommentId, @RequestBody LeeCommentDTO commentDTO) {
//        commentDTO.setStoryCommentId(storyCommentId);
//        leeService.updateStoryComment(commentDTO);
//
//        return ResponseEntity.ok().build();
//    }






}
