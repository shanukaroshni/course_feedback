package com.example.cou_feed.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    @GetMapping("/feedback")
    public String showForm() {
        return "feedback"; 
    }

    @PostMapping("/submitFeedback")
    public String submitFeedback(@ModelAttribute Feedback feedback, Model model) {

        // Add success message
        model.addAttribute("message", "Feedback submitted successfully!");


}
}