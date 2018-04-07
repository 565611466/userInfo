package com.atguigu.gmall.usermanager.service.serviceImpl;

import com.atguigu.gmall.usermanager.Mapper.UserInfoMapper;
import com.atguigu.gmall.usermanager.bean.UserInfo;
import com.atguigu.gmall.usermanager.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getAll(){
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }

    @Override
    public UserInfo getUserInfo(UserInfo userInfo) {
        UserInfo userInfo1=userInfoMapper.selectByPrimaryKey(userInfo);
        return userInfo1;
    }

    @Override
    public Integer addUserInfo(UserInfo userInfo) {
       Integer integer= userInfoMapper.insert(userInfo);
        return integer;
    }

    @Override
    public Integer upDateUserInfo(UserInfo userInfo) {

        Integer integer=userInfoMapper.updateByPrimaryKey(userInfo);
        return integer;
    }

    @Override
    public Integer deleteUserInfo(UserInfo userInfo) {
        Integer integer=userInfoMapper.deleteByPrimaryKey(userInfo);
        return integer;
    }

}
