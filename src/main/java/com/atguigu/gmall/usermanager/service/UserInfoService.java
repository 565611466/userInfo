package com.atguigu.gmall.usermanager.service;

import com.atguigu.gmall.usermanager.bean.UserInfo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserInfoService {
    public List<UserInfo> getAll();

    public  UserInfo getUserInfo(UserInfo userInfo);

    public  Integer addUserInfo(UserInfo userInfo);

    public  Integer upDateUserInfo(UserInfo userInfo);

    public Integer deleteUserInfo(UserInfo userInfo);
}
