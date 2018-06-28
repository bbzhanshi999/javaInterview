package com.repaircycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 计算修程提醒
 * Created by Administrator on 2017/4/26 0026.
 */
public class RepairArgi {


    private static Map<Integer,Repair> repairs= new HashMap();
    static{
       repairs.put(1,new Repair(3,60000,1));
       repairs.put(2,new Repair(6,120000,2));
       repairs.put(1,new Repair(12,230000,3));
       repairs.put(1,new Repair(36,550000,4));
       repairs.put(1,new Repair(72,1100000,5));
    }


    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:test.db");
            stmt = conn.prepareStatement("");
            stmt.setString(1, "");
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }


}
