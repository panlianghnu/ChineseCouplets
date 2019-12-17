package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Feedback;
import com.hnu.ccdm.mapper.FeedbackMapper;
import com.hnu.ccdm.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackImpl  implements FeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;

    @Override
    public int addFeedback(Feedback feedback) {
        return feedbackMapper.insert(feedback);
    }
}
