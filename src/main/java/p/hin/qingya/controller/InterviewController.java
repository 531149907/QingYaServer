package p.hin.qingya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import p.hin.qingya.entity.Interview;
import p.hin.qingya.service.InterviewService;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/interview")
public class InterviewController {
    @Autowired
    InterviewService service;

    @RequestMapping(method = RequestMethod.GET)
    List<Interview> getInterviews() {
        return service.getInterviews();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Interview> searchInterviews(String keyword) {
        return service.searchInterviewsByKeyword(keyword);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Interview getInterviewById(@PathVariable("id") int id) {
        return service.getIntervewById(id);
    }

}
