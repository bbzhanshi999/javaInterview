package com.sqlite;

public class SQLiteJDBC {
    public static void main(String args[]) throws InterruptedException {
        int id = 4,age=55;
        for(SqlTask.Name name:SqlTask.Name.values()){
            Thread thread = new Thread(new SqlTask(name.getName(),"insert into COMPANY (ID,NAME,AGE) VALUES ("+id+",?,"+age+")"));
            thread.start();
            thread.join();
            id++;
            age++;
        }

    }
}