package com.xianlema.service;

import com.xianlema.dao.UserDao;

public class UserService {
    private UserDao userDao;
    //添加用户
    public void addUser(
            String StudentID,
            String name,
            String password,
            int age,
            byte sex,
            int classgrade,
            String major,
            String headimg
    ){
        userDao.addUser(StudentID,name,password,age,sex,classgrade,major,headimg);
    }
}
