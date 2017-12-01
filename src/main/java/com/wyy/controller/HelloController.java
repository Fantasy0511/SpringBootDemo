package com.wyy.controller;

import com.wyy.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/11/29.
 */
@RestController
@RequestMapping(value = "/girl")
public class HelloController {
    @Autowired
    private Girl girl;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "cupSize:" + girl.getCupSize();
    }

    @GetMapping(value = "/getAge/{age}")
    public int getAge(@PathVariable("age") int age) {
        return age;
    }

    @GetMapping(value = "/getCupSize")
    public String getCupSize(@RequestParam(value = "cupSize", required = false, defaultValue = "B") String cupSize) {
        return cupSize;
    }

}
