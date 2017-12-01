package com.wyy.controller;

import com.wyy.domain.Girl;
import com.wyy.repository.GirlRepository;
import com.wyy.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    /**
     * 获取女生列表
     *
     * @return
     */
    @GetMapping(value = "/getGirlsList")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * 添加女生
     */
    @PostMapping(value = "/addGirl")
    public Girl addGirl(@RequestParam("cupSize") String cupSize, @RequestParam("age") Integer age) {
        Girl girl = new Girl(cupSize, age);
        return girlRepository.save(girl);
    }

    @PostMapping(value = "/addGirlValid")
    public Girl addGirlValid(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.print(bindingResult.getFieldError().toString());
            return null;
        }
        return girlRepository.save(girl);
    }


    /**
     * 获取一个女生
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/getGirl/{id}")
    public Girl getOneGirl(@PathVariable("id") Integer id) {
        return girlRepository.getOne(id);
    }

    //更新
    @PutMapping(value = "/updateGirl/{id}")
    public Girl updateGirl(@PathVariable("id") int id, @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = girlRepository.getOne(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    //    删除
    @DeleteMapping(value = "deleGirl/{id}")
    public void deleteGirl(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }

    //    通过年龄查询列表
    @GetMapping(value = "/girls/getGirlByAge/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findGirlByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo() {
        girlService.insertTwo();
    }
}
