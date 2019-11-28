package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Coupletintro;
import com.hnu.ccdm.service.CoupletIntroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class CoupletIntroController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CoupletIntroService coupletIntroService;

   @ResponseBody
   @RequestMapping("/coupletIntro")
    public Coupletintro retCoupletIntro(String id){
       List<Coupletintro> list=coupletIntroService.getCoupletintroList();
       for(Coupletintro x:list){
           if(x.getCoupletsexistedId().equals(id))
               return x;
       }
       return null;
   }
}
