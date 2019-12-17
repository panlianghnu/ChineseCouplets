package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Feedback;
import com.hnu.ccdm.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @ResponseBody
    @RequestMapping("/feedback")
    public String feedback(String account,String content){
        Feedback feedback=new Feedback();
        feedback.setFeedbackid(account+new Date());
        feedback.setFeedbackaccount(account);
        feedback.setFeedbackcontent(content);
        feedback.setFeedbacktime(new Date());
        if(feedbackService.addFeedback(feedback)>0){
            return "反馈成功";
        }
        return "反馈失败";
    }
}
