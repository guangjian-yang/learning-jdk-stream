package com.guangjian.stream.common;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 12:17 上午
 * @Version: 1.0.0
 */
public class Person {
    private String name;
    private Integer age;
    private String sex;

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
