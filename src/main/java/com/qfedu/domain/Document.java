package com.qfedu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors
@NoArgsConstructor
public class Document {
    private  Integer id;
    private  String name;
    private Classify classify;
    private UserInfo userInfo;
    private Date uploadDate;
    private String key;
    private String url;
    private String summary;
}
