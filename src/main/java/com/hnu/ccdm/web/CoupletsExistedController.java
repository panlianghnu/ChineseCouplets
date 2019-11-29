package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.*;
import com.hnu.ccdm.mapper.CoupletsexistedCoupletsauthor22Mapper;
import com.hnu.ccdm.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/coupletsExisted")
public class CoupletsExistedController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CoupletsExistedService coupletsExistedService;

    @Autowired
    private CoupletsexistedCoupletsauthor22Seivice coupletsexistedCoupletsauthor22Seivice;

    @Autowired
    private ClassificationService classificationService;

    @Autowired
    private ClassificationCoupletsexisted23KeyService classificationCoupletsexisted23KeyService;

    @Autowired
    private CoupletIntroService coupletIntroService;

    @Autowired
    private CoupletsAuthorService coupletsAuthorService;

    @ResponseBody
    @RequestMapping("/getTenCouplets")
    List<Coupletsexisted> getTenCouplets(String num){
        int index = Integer.valueOf(num);
        List<Coupletsexisted> list = coupletsExistedService.getCoupletList();
        if(list.size() <= index){
            return null;
        }
        List<Coupletsexisted> toBack = new LinkedList<>();
        //从index开始  ， 传最多10条楹联过去
        for(int i=index ; i<list.size() && i < index+10 ; i++){
            toBack.add( list.get(i) );
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("/getCoupletById")
    Coupletsexisted getCoupletById(String id) {
        return coupletsExistedService.getCoupletById(id);
    }

    @ResponseBody
    @RequestMapping("getCoupletsByAuthorId")
    List<Coupletsexisted> getCoupletsByAuthorId(String id) {
        List<CoupletsexistedCoupletsauthor22Key> list = coupletsexistedCoupletsauthor22Seivice.getCoupletsAuthorList();
        //list 是所有的author 和 couplets_existed 的映射关系
        List<Coupletsexisted> list1 = coupletsExistedService.getCoupletList();
        //list1是所有的现有楹联
        List<Coupletsexisted> toBcak = new ArrayList<>();
        for (CoupletsexistedCoupletsauthor22Key x : list) {
            if (x.getCoupletsauthorId().equals(id))     //如果作者id匹配成功 ， 遍历现有楹联找对应的楹联
            {
                for (Coupletsexisted y : list1) {
                    if (x.getCoupletsexistedId().equals(y.getCoupletsexistedId()))
                        toBcak.add(y);
                }
            }
        }
        return toBcak;
    }


    @ResponseBody
    @RequestMapping("getCoupletsByClassificationId")
    List<Coupletsexisted> getCoupletsByClassificationId(String id) {
        List<ClassificationCoupletsexisted23Key> list = classificationCoupletsexisted23KeyService.getClassificationWithCouplets();
        //list 是所有的分类和现有楹联的映射关系
        List<Coupletsexisted> list1 = coupletsExistedService.getCoupletList();
        //list1是所有的现有楹联
        List<Coupletsexisted> toBcak = new ArrayList<>();
        for (ClassificationCoupletsexisted23Key x : list) {
            if (x.getClassificationClassificationid().equals(id)) {  //如果分类id匹配成功， 遍历现有楹联
                for (Coupletsexisted y : list1) {
                    if (x.getCoupletsexistedId().equals(y.getCoupletsexistedId())) {
                        toBcak.add(y);
                    }
                }
            }
        }
        return toBcak;
    }

    @ResponseBody
    @RequestMapping("getClassificationsByCoupletId")
    List<Classification> getClassificationsByCoupletId(String id){
        List<ClassificationCoupletsexisted23Key> list = classificationCoupletsexisted23KeyService.getClassificationWithCouplets();
        //list 是所有的分类和现有楹联的映射关系
        List<Classification> list1 = classificationService.getClassificationList();
        List<Classification> toBack = new LinkedList<>();
        for(ClassificationCoupletsexisted23Key x : list){
            if(x.getCoupletsexistedId().equals(id)){       //在分类映射关系中找到对应的楹联
                for(Classification y : list1){             //遍历所有的分类、把映射关系映射到分类中
                    if(x.getClassificationClassificationid().equals(y.getClassificationClassificationid()))
                        toBack.add(y);                     //保存这个分类
                }
            }
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("getCoupletDetailById")
    CoupletDetail getCoupletDetailById(String id) {
        coupletsExistedService.autoIncreaseBroseCount(id);       //浏览量++

        CoupletDetail toBack = new CoupletDetail();
        //通过楹联id找到它的内容、作者、简介
        Coupletsexisted coupletsexisted = coupletsExistedService.getCoupletById(id);  //找到对应楹联
        if (coupletsexisted == null) return null;
        toBack.setCoupletsexistedId(id);   //设置楹联Id
        toBack.setCoupletsexistedBrosecount(coupletsexisted.getCoupletsexistedBrosecount());   //设置楹联浏览量
        toBack.setCoupletsexistedTitle(coupletsexisted.getCoupletsexistedTitle());             //设置楹联标题
        toBack.setCoupletsexistedInputdate(coupletsexisted.getCoupletsexistedInputdate());     //设置楹联录入时间
        toBack.setCoupletsexistedUpcouplets(coupletsexisted.getCoupletsexistedUpcouplets());   //设置上联
        toBack.setCoupletsexistedDowncouplets(coupletsexisted.getCoupletsexistedDowncouplets());//设置下联

        CoupletintroWithBLOBs coupletintro = coupletIntroService.getCoupletintroById(id);      //找到对应楹联简介
        if (coupletintro != null) {
            toBack.setCoupletintroImage(coupletintro.getCoupletintroImage());
            toBack.setCoupletintroName(coupletintro.getCoupletintroName());
            toBack.setCoupletintroOrigin(coupletintro.getCoupletintroOrigin());
            toBack.setCoupletintroJSNR(coupletintro.getCoupletintroJsnr());
        }

        List<CoupletsexistedCoupletsauthor22Key> list = coupletsexistedCoupletsauthor22Seivice.getCoupletsAuthorList();
        //list 是所有的author 和 couplets_existed 的映射关系
        for (CoupletsexistedCoupletsauthor22Key x : list) {
            if (x.getCoupletsexistedId().equals(id)) {                  //遍历映射关系 通过对联id找到authorId
                Coupletsauthor coupletsauthor = coupletsAuthorService.getAuthorById(x.getCoupletsauthorId());
                toBack.setCoupletsauthorId(coupletsauthor.getCoupletsauthorId());
                toBack.setCoupletsauthorName(coupletsauthor.getCoupletsauthorName());
                toBack.setCoupletsauthorDynasty(coupletsauthor.getCoupletsauthorDynasty());
                toBack.setCoupletsauthorSex(coupletsauthor.getCoupletsauthorSex());
                toBack.setCoupletsauthorStyle(coupletsauthor.getCoupletsauthorStyle());
                toBack.setCoupletsauthorRemarks(coupletsauthor.getCoupletsauthorSex());
                break;
            }
        }

        return toBack;
    }
}
