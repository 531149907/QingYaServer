package p.hin.qingya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import p.hin.qingya.entity.Feedback;
import p.hin.qingya.service.FeedbackService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/feedback")
public class FeedbackController {
    @Autowired
    FeedbackService service;

    @RequestMapping(method = RequestMethod.POST)
    void addFeedback(Feedback feedback) {
        service.addNewFeedback(feedback);
    }
}
