package com.ll.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/question") //URL prefix
@RequiredArgsConstructor
@Controller
public class QuestionController {


//    private final QuestionRepository questionRepository; //final -> 수정 x
    private final QuestionService questionService; //서비스 도입

    @GetMapping("/list")
    public String list(Model model) {
        
        //List<Question> questionList = this.questionRepository.findAll();
        List<Question> questionList = this.questionService.getList();
        
        model.addAttribute("questionList", questionList);
        return "question_list"; //템플릿(html파일)을 return
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable Integer id) {
        Question question = this.questionService.getQuestion(id);
        model.addAttribute("question", question);
        return "question_detail";
    }
}
