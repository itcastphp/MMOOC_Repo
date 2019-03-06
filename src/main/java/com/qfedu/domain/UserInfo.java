package com.qfedu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@Data
@Accessors
@NoArgsConstructor
public class UserInfo {
    private String  nickname;
    private String name;
    private String email;
    private Date createTime;
    private String   username;
    private String school;
    private String   birthday;
    private Integer  userType;
    private List<Operation> operations;
}
