package com.qfedu.service;

import com.qfedu.domain.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserInfoService {
    public UserInfo findUserByUsername(String username);
}
