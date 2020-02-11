package com.ak.MyTest;

import com.ak.Dao.GoodsDao;
import com.ak.Pojo.Good;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)

            @ContextConfiguration("classpath:Context_10.xml")
            public class Context_10 {

                @Autowired
                private GoodsDao goodsDao;

                @Test
                public void  kk(){

                    List<Good> goods=new ArrayList<>();
                    for(int i=0;i<5;i++){
                        Good goods1=new Good();
                        goods1.setPrice(new Random().nextDouble());
                        goods1.setId(new Random().nextInt(1000));
            goods1.setName(getRandomString(10));
            goods.add(goods1);
            System.out.println(goods.size());
        }
        for(Integer integer:goodsDao.AddGoodAll(goods)){
            System.out.println(integer);
        }

        System.out.println();
        Pr(goodsDao.SelectAll());
        Good goods1=new Good();
        goods1.setPrice(new Random().nextDouble());
        goods1.setId(new Random().nextInt(100));
        goods1.setName(getRandomString(10));
       System.out.println(goodsDao.AddGood(goods1));
       Pr(goodsDao.SelectAll());

       goods1.setName("修改过后的数据");
       goodsDao.UpdateGood(goods1);
       Pr(goodsDao.SelectAll());
       goodsDao.DeleteGood(goods1.getId());
       Pr(goodsDao.SelectAll());

       goods1.setName("joker--修改过后的");
    }

    public void Pr(List<Good> list){
        for(Good goods:list){
            System.out.println(goods);
        }
        System.out.println();
    }
    public  String getRandomString(int length){
        //定义一个字符串（A-Z，a-z，0-9）即62位；
        String str="zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        //由Random生成随机数
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        //长度为几就循环几次
        for(int i=0; i<length; ++i){
            //产生0-61的数字
            int number=random.nextInt(62);
            //将产生的数字通过length次承载到sb中
            sb.append(str.charAt(number));
        }
        //将承载的字符转换成字符串
        return sb.toString();
    }

}
