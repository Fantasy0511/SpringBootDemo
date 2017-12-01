package com.wyy.service;

/**
 * Created by Administrator on 2017/11/30.
 */

import com.wyy.domain.Girl;
import com.wyy.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 同时插入两条数据，注意事务
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl("B", 20);
        girlRepository.save(girlA);
        Girl girlB = new Girl("F", 30);
        girlRepository.save(girlB);
    }
}
