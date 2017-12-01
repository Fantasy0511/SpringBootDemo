package com.wyy.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/1.
 */
@Component
@ConfigurationProperties(prefix = "man")
public class Man {
    private int length;
    private int age;

    public Man() {
    }

    public Man(int length, int age) {
        this.length = length;
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
