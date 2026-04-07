package com.example.loginvalidator.controller;

import com.example.loginvalidator.model.Feedback;
import com.example.loginvalidator.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService service;

    @GetMapping("/feedback")
    public String showForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }

    @PostMapping("/submitFeedback")
    public String submitFeedback(@ModelAttribute Feedback feedback, Model model) {
        
        service.saveFeedback(feedback);

        // Add acknowledgment message
        model.addAttribute("message", "Thank you! Your feedback has been submitted successfully.");

        return "acknowledgment";
    }
}