package com.daku.bigmall.user.controller;

import com.daku.bigmall.user.bean.UmsMember;
import com.daku.bigmall.user.bean.UmsMemberReceiveAddress;
import com.daku.bigmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
/** 
* @Description:  
* @Param:  
* @return:  
* @Author: dakuzai
* @Date: 2020/1/14 12:04
*/ 
    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello user";
    }
}
