package com.template.model.basic.user;

import javax.persistence.*;

/**
 * Project Name:SSHTemplate
 * File Name:UserModel
 * Package Name:com.template.model.basic.user
 * Date:2019/2/18
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


@Entity
@Table(name = "user", schema = "template", catalog = "")
public class UserModel {

    private int userId;

    private String name;

    private int age;

    private String sex;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserModel userModel = (UserModel) o;

        if (userId != userModel.userId) return false;
        if (age != userModel.age) return false;
        if (name != null ? !name.equals(userModel.name) : userModel.name != null) return false;
        return sex != null ? sex.equals(userModel.sex) : userModel.sex == null;

    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
