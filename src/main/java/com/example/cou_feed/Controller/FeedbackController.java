package com.example.cou_feed.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class FeedbackController {

    @GetMapping("/feedback")
    public String showForm() {
        return "feedback"; 
    } 
    
    @PostMapping("/submitFeedback")
    public String submitFeedback (@RequestBody String entity) {
        
        
        return entity;
    }
    


}
