package com.wyy.repository;

import com.wyy.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    //    通过年龄查询
    public List<Girl> findGirlByAge(Integer age);
}
