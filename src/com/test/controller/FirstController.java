package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
@Controller

public class FirstController {
    @RenderMapping("/login.do")
    @ResponseBody
    public String print(){
        return  "success";
    }
}
