package com.qfedu.serviceimp;

import com.qfedu.dao.UserInfoDao;
import com.qfedu.domain.UserInfo;
import com.qfedu.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;


    @Override
    public UserInfo findUserByUsername(String username) {
        UserInfo userInfo=null;
        try {
            userInfo = userInfoDao.selectUserInfoByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInfo;
    }
}
