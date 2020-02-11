package com.ak.Service.Impl;

import com.ak.Aop.LoggingXml;
import com.ak.Service.MoneyService;
import org.springframework.stereotype.Service;

/**
 * 改名卡业务
 */
@Service("Change")
public class MoneyServiceChange implements MoneyService {

    @Override
    public void receive(String name, Double money) {

        System.out.println(name+" 正在找支付宝扣除 钱 ---");
        System.out.println("钱扣除完成");
        System.out.println("正在给"+name+"给你添加改名卡+1 ");
    }

    @Override
    public void happy(String name) {
        System.out.println("贵族  --给你的福利 ，送钻石");
    }
}
