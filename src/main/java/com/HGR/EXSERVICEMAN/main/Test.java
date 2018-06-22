package com.HGR.EXSERVICEMAN.main;

import com.alibaba.druid.pool.DruidDataSource;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Description:
 *
 * @author YKL on 2018/6/15.
 * @version 1.0
 *          spark:梦想开始的地方
 */
public class Test {

    @Resource
    DruidDataSource druidDataSource;

    public void test() throws SQLException {
        Connection connection = druidDataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT videoName FROM video");

        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("****");
        while (resultSet.next()) {
            System.out.println("****");
            System.out.println(resultSet.getObject(0).toString());
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

}
