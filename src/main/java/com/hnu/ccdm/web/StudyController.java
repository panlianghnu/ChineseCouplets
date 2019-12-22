package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Charpter;
import com.hnu.ccdm.entity.Hotsearch;
import com.hnu.ccdm.entity.Study;
import com.hnu.ccdm.service.CharpterService;
import com.hnu.ccdm.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/study")
public class StudyController {

    @Autowired
    private StudyService studyService;

    @Autowired
    private CharpterService charpterService;

    @ResponseBody
    @RequestMapping("/getStudyList")
    public List<Study> getStudyList(){
         return studyService.getStudyList();
    }

    @ResponseBody
    @RequestMapping("/getCharpterContent")
    public String getCharpterContent(String bookId,String charpterId){
        List<Charpter> charpterList=charpterService.getCharpterList();
        for (Charpter x:charpterList){
            if (x.getCharpterstudyid().equals(bookId)&&x.getCharpternumber().equals(charpterId)){
                return x.getCharptercontent();
            }
        }
        return "error!";
    }

    @ResponseBody
    @RequestMapping("/getCharpterList")
    public List<Charpter> getCharpterList(String bookId){
        List<Charpter> charpterList=charpterService.getCharpterList();
        List<Charpter> toback=new ArrayList<>();
        for (Charpter x:charpterList){
            if (x.getCharpterstudyid().equals(bookId)){
                toback.add(x);
            }
        }
        Collections.sort(toback, new Comparator<Charpter>() {
            @Override
            public int compare(Charpter o1, Charpter o2) {

                int diff=Integer.valueOf(o1.getCharpternumber())-Integer.valueOf(o2.getCharpternumber());
                if (diff>0) {
                    return 1;
                }
                else if (diff<0){
                    return -1;
                }
                return 0;
            }
        });
        return toback;
    }
}
