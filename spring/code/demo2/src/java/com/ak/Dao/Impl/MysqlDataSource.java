package com.ak.Dao.Impl;

import com.ak.Dao.MyDataSource;

public class MysqlDataSource implements MyDataSource {
    @Override
    public void connection() {
        System.out.println("这个是Mysql 数据源");
    }
}
