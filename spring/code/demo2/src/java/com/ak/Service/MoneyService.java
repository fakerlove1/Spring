package com.ak.Service;

/**
 * 充钱业务
 */
public interface MoneyService {
//     转账
    void receive(String name,Double money);

//    玩家一些 福利操作
    void happy(String name);
}
