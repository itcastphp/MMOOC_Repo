package com.qfedu.dao;

import com.qfedu.domain.UserInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {
    @Select("select u.*,o.name oname,o.time,o.type from userinfo u left join operation o on u.username=o.username where u.username=#{username}")
    @ResultMap("MyUserInfo")
    public UserInfo selectUserInfoByUsername(String username) throws  Exception;
}
