package com.xianlema.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {
    private Configuration cfx;
    private SessionFactory sft;
    private Session session;
    private Transaction transaction;
    public Dao(){
        //加载核心配置文件
        cfx = new Configuration().configure();
        //创建SessionFactory对象
        sft = cfx.buildSessionFactory();
        //实现session实例
        session = sft.openSession();
        //开启事务
        transaction = session.beginTransaction();
    }

    /**
     * crud的收尾工作
     */
    public void CRUDEND(Object o){
        session.save(o);
        transaction.commit();
        session.close();
        sft.close();
    }
}
