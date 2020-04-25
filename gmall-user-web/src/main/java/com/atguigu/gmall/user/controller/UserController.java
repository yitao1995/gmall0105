package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Sanwish on 2020/4/22.
 */
@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @ResponseBody
    @RequestMapping("getMemberReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getMemberReceiveAddressByMemberId(String id) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getMemberReceiveAddressByMemberId(id);
        return umsMemberReceiveAddresses;
    }

    @ResponseBody
    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
