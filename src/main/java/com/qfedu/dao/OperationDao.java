package com.qfedu.dao;


import com.qfedu.domain.Operation;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OperationDao {
    public List<Operation> selectOperationByUsername(String username) throws  Exception;
}
