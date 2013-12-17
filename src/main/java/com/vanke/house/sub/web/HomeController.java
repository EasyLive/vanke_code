package com.vanke.house.sub.web;

import com.vanke.house.sub.service.VankeBuildService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Mac on 13-12-17.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Resource(name = "vankeBuildService")
    VankeBuildService vankeBuildService;

    @RequestMapping("/{dir}/{page}")
    public String page(@PathVariable String page, @PathVariable String dir){
        return "/"+dir+"/"+page;

    }
}
