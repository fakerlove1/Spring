package com.ak.Pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 继承了 接口的话，也会实现 初始化 的 回调
 */
public class HelloWorld2 implements InitializingBean, DisposableBean {

    private String Message;
    private int code;

    @Override
    public String toString() {
        return "HelloWorld2{" +
                "Message='" + Message + '\'' +
                ", code=" + code +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("继承接口的 初始化");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.Message="afterPropertiesSet() 初始化的信息";
        this.code=300;
    }
}
