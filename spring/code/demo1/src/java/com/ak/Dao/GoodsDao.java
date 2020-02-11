package com.ak.Dao;

import com.ak.Pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GoodsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加商品
     *
     * @param goods 需要添加商品的信息，不能为空
     * @return
     */
    public int AddGoods(Goods goods) {
        if (goods == null || goods.getName() == null) {
            return 0;
        }
        String sql = "insert into goods(id,name,price) value(?,?,?); ";
        int result = jdbcTemplate.update(sql, goods.getId(), goods.getName(), goods.getPrice());

        return result;
    }

    /**
     * 根据 goods的 id 来修改信息
     *
     * @param goods 用来修改商品的信息 ,商品的每一个字段都不能空
     * @return
     */
    public int UpdateGoods(Goods goods) {
        if (goods == null || goods.getName() == null) {
            return 0;
        }
        String sql = "update goods set name=?,price=? where id=?";

        int result = jdbcTemplate.update(sql, goods.getName(), goods.getPrice(), goods.getId());
        return result;
    }

    /**
     * 批量增加
     * @param list 批量 增加商品的信息
     * @return
     */
    public int[] AddGoodsAll(List<Goods> list) {
        if(list==null&&list.size()<=0){
            return null;
        }
        System.out.println("AddGoodsAll  -----------");
        String sql = "insert into goods(id,name,price) value(?,?,?);";
       int[] result= jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setInt(1,list.get(i).getId());
                preparedStatement.setString(2,list.get(i).getName());
                preparedStatement.setDouble(3,list.get(i).getPrice());

            }

//            一定要注意
            @Override
            public int getBatchSize() {
                return list.size();
            }
        });
       return result;
    }

    /**
     * 查找出所有的信息
     * @return
     */
    public List<Goods> SelectAll() {
        /* 无条件查询*/
        String sql="select * from goods";
        List<Goods> list=new ArrayList<>();
//        RowMapper<Goods>() 这个是自己实现 装配
        list=jdbcTemplate.query(sql, new RowMapper<Goods>() {
            @Override
            public Goods mapRow(ResultSet resultSet, int i) throws SQLException {
                Goods goods=new Goods();
                goods.setId(resultSet.getInt(1));
                goods.setName(resultSet.getString(2));
                goods.setPrice(resultSet.getDouble(3));
                return goods;
            }
        });

        /* 有条件查询*/
        if(list.size()>2){
            sql="select * from goods where id =?";

            Object [] parameters={list.get(0).getId()};
            List<Goods> list1=new ArrayList<>();
//            paramaters 表示参数 ，sql 语句中？ 有几个 paramaters 就得有几个

            // sql="select count(*) from goods ";
//            jdbcTemplate.queryForList(sql,parameters,Integer.class);
//            queryForList 只适用于返回一列 的数据 int ，String ,否则会报错
            list1=jdbcTemplate.query(sql, parameters, new RowMapper<Goods>() {
                @Override
                public Goods mapRow(ResultSet resultSet, int i) throws SQLException {
                    Goods goods=new Goods();
                    goods.setId(resultSet.getInt(1));
                    goods.setName(resultSet.getString(2));
                    goods.setPrice(resultSet.getDouble(3));
                    return goods;
                }
            });
            for(Goods goods:list1){
                System.out.println("有条件查询的"+goods);
            }
        }

        return list;
    }

    public int DeleteGoods(int id) {

        String sql = "delete from goods where id=?";

        int result = jdbcTemplate.update(sql, id);
        return result;
    }
}
