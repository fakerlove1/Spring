package com.ak.Dao;

import com.ak.Pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDao  {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    /**
     * 刷新用户的钱
     * @param goods
     * @return
     */
    public int updateGoods(Goods goods){
        String sql="update goods set price =? where id= ?";
        int result=jdbcTemplate.update(sql,goods.getPrice(),goods.getId());
        return  result;
    }

    /**
     * 查找用户的钱
     * @param id
     * @return
     */
    public Goods SelectGoods(int id){
        String sql="select * from goods where id=?";
        Object [] parameters={id};
        List<Goods> goodsList =new ArrayList<>();
        goodsList= jdbcTemplate.query(sql, parameters, new RowMapper<Goods>() {
            @Override
            public Goods mapRow(ResultSet resultSet, int i) throws SQLException {
                Goods goods=new Goods();
                goods.setPrice(resultSet.getDouble(3));
                goods.setName(resultSet.getString(2));
                goods.setId(resultSet.getInt(1));
                return  goods;
            }
        });
        if(goodsList.size()>0){
            return goodsList.get(0);
        }else {
            return  null;
        }
    }
}
