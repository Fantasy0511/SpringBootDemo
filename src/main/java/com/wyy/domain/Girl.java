package com.wyy.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by Administrator on 2017/11/29.
 */
@Component
@ConfigurationProperties(prefix = "girl")
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private int id;
    private String cupSize;
    @Min(value = 18, message = "未成年少女")
    private int age;

    public Girl() {
    }

    public Girl(String cupSize, int age) {
        this.cupSize = cupSize;
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
