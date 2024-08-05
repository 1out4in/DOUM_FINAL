package com.example.doum.controller.won;

import com.example.doum.domain.dto.won.WonAnonymousDTO;
import com.example.doum.service.won.WonAnonymousService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

@RequiredArgsConstructor
public class WonAnonymousController {

    @Autowired
    private WonAnonymousService wonAnonymousService;

    @GetMapping("/guest_main")
    public String getAllAnonymousPosts(Model model) {
        List<WonAnonymousDTO> anonymousPosts = wonAnonymousService.getAllAnonymousPosts();
        model.addAttribute("anonymousPosts", anonymousPosts);
        return "won/guest_main";
    }
}
