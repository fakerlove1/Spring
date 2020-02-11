package com.ak.service.impl;

import com.ak.service.MyDataSource;

public class OracleDataSource implements MyDataSource {
    @Override
    public void connection() {
        System.out.println("这个是 Oracle 的数据源");
    }
}
