package p.hin.qingya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hin.qingya.entity.Interview;
import p.hin.qingya.mapper.InterviewMapper;

import java.util.List;

@Service
public class InterviewService {
    @Autowired
    InterviewMapper interviewMapper;

    List<Interview> getInterviews(){
        return interviewMapper.getInterviews();
    }

    Interview getIntervewById(int id){
        return interviewMapper.getInterview(id);
    }

    List<Interview> searchInterviewsByKeyword(String keyword){
        return interviewMapper.getInterviews(keyword);
    }
}
