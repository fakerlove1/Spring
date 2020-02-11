package com.ak.Service.Impl;

import com.ak.Service.MoneyService;
import org.springframework.stereotype.Service;

/**
 * 买皮肤
 */
@Service("Hero")
public class MoneyServiceHero implements MoneyService {

    @Override
    public void receive(String name, Double money) {
        System.out.println(name+" 正在找支付宝扣除 钱 ---");
        System.out.println("钱扣除完成");
        System.out.println("正在给"+name+"给你添加成吉思汗英雄  ");
    }

    @Override
    public void happy(String name) {
        System.out.println("贵族 +1+++获得金币 ");
    }
}
