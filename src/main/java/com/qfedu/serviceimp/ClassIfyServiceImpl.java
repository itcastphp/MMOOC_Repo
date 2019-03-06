package com.qfedu.serviceimp;
import com.qfedu.dao.ClassIfyDao;
import com.qfedu.domain.Classify;
import com.qfedu.service.ClassIfyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassIfyServiceImpl implements ClassIfyService {

    @Autowired
    private ClassIfyDao classIfyDao;
    @Override
    public List<Classify> getAllClassify() {
        List<Classify> classifies = null;
        try {
            classifies = classIfyDao.selectAllClassify();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classifies;
    }

    @Override
    public int selectIdByname(String bigName, String smallName) {
        int kind=0;
        try {
            kind= classIfyDao.selectIdByname(bigName, smallName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kind;
    }

}
