package com.ak.Pojo;


/**
 * 使用 属性的方式来 初始化的回调
 */
public class HelloWorld {
    private String Message;
    private int code;

    @Override
    public String toString() {
        return "HelloWorld{" +
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

    public void init(){
        System.out.println("属性方式 的Hello World 初始化开始"+this.hashCode());
        this.Message="init() 初始化的信息";
        this.code=300;
    }

    public void destory(){
        System.out.println("属性方式的 Hello World 销毁");
        this.Message=null;
        this.code=0;
    }

}
