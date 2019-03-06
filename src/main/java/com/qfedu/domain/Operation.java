package com.qfedu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors
@NoArgsConstructor
public class Operation {
    private String name;
    private Date time;
    private Integer type;
}
