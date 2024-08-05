package com.example.doum.controller.lee;//package com.example.board.controller;

//import com.example.board.domain.dto.UserListDTO;
//import com.example.board.service.UserService;
import com.example.doum.domain.vo.UserVO;
import com.example.doum.service.lee.LeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rest")
public class UserRestController {

    private final LeeService leeService;

    @GetMapping("/search")
    public ResponseEntity<List<UserVO>> searchUsers(@RequestParam String search) {
        List<UserVO> users = leeService.searchUsers(search);
        return ResponseEntity.ok(users);
    }
}
