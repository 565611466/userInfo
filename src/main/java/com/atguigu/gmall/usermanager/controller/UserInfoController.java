package com.atguigu.gmall.usermanager.controller;

import com.atguigu.gmall.usermanager.bean.UserInfo;
import com.atguigu.gmall.usermanager.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/users")
    @ResponseBody
    public ResponseEntity<List<UserInfo>> getUserList( UserInfo userInfo){
        List<UserInfo> all = userInfoService.getAll();
       return  ResponseEntity.ok().body(all);
    }
    @ResponseBody
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public  ResponseEntity<UserInfo> getUserInfoById(UserInfo userInfo ){
        UserInfo userInfo1=userInfoService.getUserInfo(userInfo);

        return ResponseEntity.ok().body(userInfo1);
    }
    @ResponseBody
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public ResponseEntity<Integer> addUserInfo(UserInfo userInfo){
        Integer integer=userInfoService.addUserInfo(userInfo);

        return ResponseEntity.ok().body(integer);
    }
    @ResponseBody
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public ResponseEntity<Integer> upDateUserInfo(UserInfo userInfo){
        Integer integer=userInfoService.upDateUserInfo(userInfo);
        return ResponseEntity.ok().body(integer);

    }
    @ResponseBody
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public ResponseEntity<Integer> deleteUserInfo(UserInfo userInfo){
        Integer integer =userInfoService.deleteUserInfo(userInfo);
        return  ResponseEntity.ok().body(integer);
    }
}
