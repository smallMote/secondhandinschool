package com.xianlema.dao;

import com.xianlema.bean.User;

public class UserDao {
    private Dao dao;
    private User user;

    private UserDao(){
        user = new User();
        dao  = new Dao();
    }


    /**
     * 新增用户
     * @param StudentID 学生编号
     * @param name 学生姓名
     * @param password 登录密码
     * @param age 年龄
     * @param sex 性别
     * @param classgrade 年级
     * @param major 专业
     * @param headimg 头像地址
     */

    public void addUser(
            String StudentID,
            String name,
            String password,
            int age,
            byte sex,
            int classgrade,
            String major,
            String headimg
    )
    {
        user.setStudentID(StudentID);
        user.setName(name);
        user.setPassword(password);
        user.setAge(age);
        user.setSex(sex);
        user.setClassgrade(classgrade);
        user.setMajor(major);
        user.setHeadimg(headimg);
        //提交事务和关闭资源
        dao.CRUDEND(user);
    }


public static void main(String args[]){
//    new UserDao().addUser("001",
//            "jone",
//            "123456",
//            20,
//            Byte.parseByte("1"),
//            3,
//            "",
//            "");
}
}
