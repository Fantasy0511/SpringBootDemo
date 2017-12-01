package com.wyy.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.wyy.domain.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/1.
 */
@RestController
public class ManController {
    @Autowired
    private Man man;

    @GetMapping(value = "/man")
    public Man getMan() {
        return man;
    }
}

