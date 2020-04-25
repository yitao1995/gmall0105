package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Sanwish on 2020/4/23.
 */
public interface UserService {

    public List<UmsMember> getAllUser();

    public List<UmsMemberReceiveAddress> getMemberReceiveAddressByMemberId(String id);
}
