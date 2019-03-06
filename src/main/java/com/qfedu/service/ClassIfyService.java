package com.qfedu.service;

import com.qfedu.domain.Classify;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ClassIfyService {
    public List<Classify> getAllClassify();

    public int selectIdByname(String bigName,String smallName);
}
