package com.ak.Dao.Impl;

import com.ak.Dao.MyDataSource;

public class OracleDataSource implements MyDataSource {
    @Override
    public void connection() {
        System.out.println("这个是 Oracle 的数据源");
    }
}
