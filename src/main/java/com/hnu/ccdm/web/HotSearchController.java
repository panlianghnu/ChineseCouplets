package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Hotsearch;
import com.hnu.ccdm.entity.Lasthotsearch;
import com.hnu.ccdm.service.HotSearchService;
import com.hnu.ccdm.service.LastHotSearchService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class HotSearchController {
    @Autowired
    private HotSearchService hotSearchService;

    @ResponseBody
    @RequestMapping("/hotSearch")
    public List<String> getHotSearch(){

        List<String> toback=new ArrayList<>();
        List<Hotsearch> hotsearchList=hotSearchService.getHotSearchList();
        System.out.println(hotsearchList.size());
        Date date=new Date();
        for (Hotsearch x:hotsearchList){
            SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");

            if (!fmt.format(date).equals(fmt.format(x.getHotsearchtime()))){
                hotSearchService.deleteHotSearch(x.getHotsearchid());
                hotsearchList.remove(x);
                System.out.println(hotsearchList.size());
            }
        }
        Collections.sort(hotsearchList, new Comparator<Hotsearch>() {
            @Override
            public int compare(Hotsearch o1, Hotsearch o2) {
                int diff=o2.getHotsearchnumber()-o1.getHotsearchnumber();
                if (diff>0) {
                    return 1;
                }
                else if (diff<0){
                    return -1;
                }
                return 0;
            }
        });
        int i=0;
        for (Hotsearch x:hotsearchList){
            if (i<10){
                toback.add(x.getHotsearchkeywords());
            }
            else
            {
                return toback;
            }
        }
        return toback;
    }
}
