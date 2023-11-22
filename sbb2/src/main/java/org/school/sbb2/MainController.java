package org.school.sbb2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String sbb() {
        return "안녕하세요~ 환영합니다~";
    }

    @GetMapping("/")
    public String index(){
        return "redirect:/question/list";
    }
}
