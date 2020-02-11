package com.ak.Dao;

import com.ak.Pojo.Good;
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
     * @param Good 需要添加商品的信息，不能为空
     * @return
     */
    public int AddGood(Good Good) {
        if (Good == null || Good.getName() == null) {
            return 0;
        }
        String sql = "insert into Goods(id,name,price) value(?,?,?); ";
        int result = jdbcTemplate.update(sql, Good.getId(), Good.getName(), Good.getPrice());

        return result;
    }

    /**
     * 根据 Good的 id 来修改信息
     *
     * @param Good 用来修改商品的信息 ,商品的每一个字段都不能空
     * @return
     */
    public int UpdateGood(Good Good) {
        if (Good == null || Good.getName() == null) {
            return 0;
        }
        String sql = "update Goods set name=?,price=? where id=?";

        int result = jdbcTemplate.update(sql, Good.getName(), Good.getPrice(), Good.getId());
        return result;
    }

    /**
     * 批量增加
     * @param list 批量 增加商品的信息
     * @return
     */
    public int[] AddGoodAll(List<Good> list) {
        if(list==null&&list.size()<=0){
            return null;
        }
        System.out.println("AddGoodAll  -----------");
        String sql = "insert into Goods(id,name,price) value(?,?,?);";
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
    public List<Good> SelectAll() {
        /* 无条件查询*/
        String sql="select * from Goods";
        List<Good> list=new ArrayList<>();
//        RowMapper<Good>() 这个是自己实现 装配
        list=jdbcTemplate.query(sql, new RowMapper<Good>() {
            @Override
            public Good mapRow(ResultSet resultSet, int i) throws SQLException {
                Good Good=new Good();
                Good.setId(resultSet.getInt(1));
                Good.setName(resultSet.getString(2));
                Good.setPrice(resultSet.getDouble(3));
                return Good;
            }
        });
        /* 有条件查询*/
        if(list.size()>2){
            sql="select * from Goods where id =?";

            Object [] parameters={list.get(0).getId()};
            List<Good> list1=new ArrayList<>();
//            paramaters 表示参数 ，sql 语句中？ 有几个 paramaters 就得有几个

            // sql="select count(*) from Good ";
//            jdbcTemplate.queryForList(sql,parameters,Integer.class);
//            queryForList 只适用于返回一列 的数据 int ，String ,否则会报错
            list1=jdbcTemplate.query(sql, parameters, new RowMapper<Good>() {
                @Override
                public Good mapRow(ResultSet resultSet, int i) throws SQLException {
                    Good Good=new Good();
                    Good.setId(resultSet.getInt(1));
                    Good.setName(resultSet.getString(2));
                    Good.setPrice(resultSet.getDouble(3));
                    return Good;
                }
            });
            for(Good Good:list1){
                System.out.println("有条件查询的"+Good);
            }
        }

        return list;
    }

    public int DeleteGood(int id) {

        String sql = "delete from Goods where id=?";

        int result = jdbcTemplate.update(sql, id);
        return result;
    }
}
