package com.mycompany.springbootproject.Controller;

import com.mycompany.springbootproject.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/hello")
    public String mainPage(Model model){
        model.addAttribute("topics", topicService.findAll());

        return "hello";
    }
}
