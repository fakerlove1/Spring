package com.ak.service.impl;

import com.ak.service.MyDataSource;

public class MysqlDataSource implements MyDataSource {


    @Override
    public void connection() {
        System.out.println("这个是Mysql 数据源");
    }
}
