package com.ak.Bean;

import com.ak.service.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;

public class MyDataSourceTest {

    @Resource(name="mysqldata")
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
