package com.example.doum.controller.won;

import com.example.doum.domain.dto.won.WonAnonymousDTO;
import com.example.doum.domain.dto.won.WonOrganizationReviewDTO;
import com.example.doum.domain.dto.won.WonUserJoinDTO;
import com.example.doum.domain.dto.won.WonVolunteerDTO;
import com.example.doum.service.won.ReviewService;
import com.example.doum.service.won.VolunteerService;
import com.example.doum.service.won.WonAnonymousService;
import com.example.doum.service.won.WonUserJoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller()
@RequestMapping("/Won")
@RequiredArgsConstructor
public class VolunteerController {

    private final VolunteerService volunteerService;
    private final WonAnonymousService wonAnonymousService;
    private final ReviewService reviewService;
    private final WonUserJoinService wonUserJoinService;


    @GetMapping("/guest_main")
    public String getVolunteerTitles(Model model) {
        List<WonVolunteerDTO> volunteerList = volunteerService.getVolunteerTitles();
        List<WonAnonymousDTO> anonymousPosts = wonAnonymousService.getAllAnonymousPosts();
        model.addAttribute("anonymousPosts", anonymousPosts);
        model.addAttribute("volunteers", volunteerList);
        return "won/guest_main";
    }
    // 회원 가입 html 로 가는 경로
    @GetMapping("/user_join")
    public String userJoin(){
        return "won/user_join";
    }



    // 회원이 기관에 리뷰 남기는 html 로 가는 경로
    @GetMapping("/review_org")
    public String reviewOrg(){
        return "won/review";
    }

    @PostMapping("/review_org/{organizationId}")
    public String insertOrgReview(@PathVariable Long organizationId,
                                  @RequestParam String review,
                                  @RequestParam Long rating){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String pk = authentication.getName();

        WonOrganizationReviewDTO newReview = new WonOrganizationReviewDTO();

        newReview.setContent(review);
        newReview.setUserId(1L);
        newReview.setRating(rating);
        newReview.setOrganizationId(organizationId);

        reviewService.insertReview(newReview);

        // 기관에게 리뷰가 달리는 로직.
        // org_review insert

     return "redirect:/Won/org_join";
    }
//    로그인 html로 넘어가는 경로
    @GetMapping("/login_test")
    public String loginTest(){return "won/login_test";}


    //회원가입 insert
    @PostMapping("/user_join")
    public String registerUser(WonUserJoinDTO wonUserJoinDTO, RedirectAttributes redirectAttributes) {
        System.out.println("wonUserJoinDTO: " + wonUserJoinDTO);
        wonUserJoinService.saveUser(wonUserJoinDTO);
        redirectAttributes.addFlashAttribute("message", "회원 가입이 완료되었습니다.");
        return "redirect:/Won/login_test";
    }



}



