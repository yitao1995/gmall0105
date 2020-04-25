package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Sanwish on 2020/4/22.
 */
@Controller
public class UserController {


    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "index";
    }

}
