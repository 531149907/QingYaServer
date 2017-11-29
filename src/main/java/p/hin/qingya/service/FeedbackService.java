package p.hin.qingya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hin.qingya.entity.Feedback;
import p.hin.qingya.mapper.FeedbackMapper;

@Service
public class FeedbackService {
    @Autowired
    FeedbackMapper feedbackMapper;

    void addNewFeedback(Feedback feedback){
        feedbackMapper.insertFeedback(feedback);
    }
}
