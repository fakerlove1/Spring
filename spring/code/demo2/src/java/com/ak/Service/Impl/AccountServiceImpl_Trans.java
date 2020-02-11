package com.ak.Service.Impl;

import com.ak.Dao.AccountDao;
import com.ak.Pojo.Goods;
import com.ak.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountserviceImpl_trans")
public class AccountServiceImpl_Trans implements AccountService {

    @Autowired
    private AccountDao accountDao;
// value、transactionManager属性
//     propagation用于指定事务的传播行为，默认值为 REQUIRED
//        isolation用于指定事务的隔离规则
//       timeout用于设置事务的超时属性。
//    readOnly用于设置事务是否只读属性。
//     rollbackFor、rollbackForClassName用于设置那些异常需要回滚；noRollbackFor、noRollbackForClassName用于设置那些异常不需要回滚。他们就是在设置事务的回滚规则。

    @Transactional(propagation = Propagation.REQUIRED,noRollbackFor = ArithmeticException.class)
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
