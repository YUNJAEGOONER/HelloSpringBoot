package com.ll.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody //문자열을 반환...
    public String index(){
        return "index";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }
}
