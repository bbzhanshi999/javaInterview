package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchTest {

    static final String url = "jdbc:mysql://localhost:3306/hr";
    static final String password = "1234";
    static final String username = "root";


    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }


    public static void main(String[] args) throws SQLException {
        Connection conn = getConn();
        PreparedStatement pstmt = conn.prepareStatement("Delete from user_role where user_id = ?");
        pstmt.setLong(1,1L);
        pstmt.executeUpdate();
        pstmt.close();

        pstmt = conn.prepareStatement("insert into user_role values (?,?)");
        for(int i = 0;i<3;i++){
            pstmt.setLong(1,1L);
            pstmt.setLong(2,i+1);
            pstmt.addBatch();
        }
        pstmt.executeBatch();
        pstmt.clearBatch();
        pstmt.close();

    }

}
