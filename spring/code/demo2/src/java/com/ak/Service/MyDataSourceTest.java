package com.ak.Service;

import com.ak.Dao.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;


public class MyDataSourceTest {

//    @Autowired
//    @Qualifier("mysqldata")
//    private MyDataSource myDataSource;

    @Resource(name = "mysqldata")
    private MyDataSource myDataSource;

    @Override
    public String toString() {
        return "MyDataSourceTest{" +
                "myDataSource=" + myDataSource +
                '}';
    }

    public MyDataSource getMyDataSource() {
        return myDataSource;
    }

    public void setMyDataSource(MyDataSource myDataSource) {
        this.myDataSource = myDataSource;
    }
}
