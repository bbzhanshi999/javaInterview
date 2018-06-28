package com.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * jndi代码
 * Created by Administrator on 2018/6/11.
 */
public class Demo {


    public static void main(String[] args) throws NamingException {
        Context ctx=new InitialContext();
        Object datasourceRef=ctx.lookup("java:MySqlDS"); //引用数据源
        DataSource ds=(DataSource)datasourceRef;
    }
}
