package com.ak.Service.Impl;

import com.ak.Dao.AccountDao;
import com.ak.Pojo.Goods;
import com.ak.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Boolean remove(int original, int target, Double money) {

        System.out.println("开始服务");
        Goods o=accountDao.SelectGoods(original);
        Goods t=accountDao.SelectGoods(target);
        System.out.println("转账前 两人");
        System.out.println(o);
        System.out.println(t);
//         首先有这两个人
        if(o!=null&&t!=null&&o.getPrice()>money) {
            System.out.println("进行转账");
            o.setPrice(o.getPrice() - money);
            accountDao.updateGoods(o);
            o = accountDao.SelectGoods(original);
            System.out.println("钱已经扣除的 o" + o);
//            throw new  RunException("事务运行时错误");
            int i = 1 / 0; // 用来测试 Transtraion

            t.setPrice(t.getPrice() + money);
            accountDao.updateGoods(t);
            o = accountDao.SelectGoods(original);
            t = accountDao.SelectGoods(target);

            System.out.println("转账后 两人");
            System.out.println(o);
            System.out.println(t);
        }
        System.out.println("服务结束");
        return true;
    }
}
