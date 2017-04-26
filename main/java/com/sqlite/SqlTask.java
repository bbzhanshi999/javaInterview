package com.sqlite;

import java.sql.*;

/**
 * 多线程执行
 * Created by Administrator on 2017/4/11 0011.
 */
public class SqlTask implements Runnable {

    private String name;
    private String sql;
    public SqlTask(String name,String sql) {
        this.name = name;this.sql = sql;
    }

    public enum Name {
        ZQL("zql"), XJ("xj"), ZQ("zq"), ZS("zhangsan"), HL("hl"), LWH("lwh"), LX("liuxiang"), TSL("tsl");
        private String name;

        Name(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }
    }


    @Override
    public void run() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:test.db");
            //Thread.sleep(5000);
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
