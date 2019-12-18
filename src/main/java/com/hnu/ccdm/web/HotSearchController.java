package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Hotsearch;
import com.hnu.ccdm.entity.Lasthotsearch;
import com.hnu.ccdm.service.HotSearchService;
import com.hnu.ccdm.service.LastHotSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HotSearchController {
    @Autowired
    private HotSearchService hotSearchService;

    @Autowired
    private LastHotSearchService lastHotSearchService;

    @ResponseBody
    @RequestMapping("/hotSearch")
    public List<String> getHotSearch(){
        List<String> toback=new ArrayList<>();
        List<Lasthotsearch> lasthotsearchList=lastHotSearchService.getLastHotSearch();
        List<Hotsearch> hotsearchList=hotSearchService.getHotSearchList();
        if (lasthotsearchList.isEmpty()){
            Lasthotsearch lasthotsearch=new Lasthotsearch();
            lasthotsearch.setLasthotsearchid(String.valueOf(new Date()));
            lasthotsearch.setLasthotsearchtime(new Date());
            lastHotSearchService.addLastHotSearch(lasthotsearch);
        }
        for (Lasthotsearch x:lasthotsearchList){
            Date date=x.getLasthotsearchtime();
            System.out.println(date);
        }
        return toback;
    }
}
