package com.singletone;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private static volatile DBConnection dbCon = null;
    private static Lock lock = null;
    private DBConnection() {}

    //If application is single threaded
    public static DBConnection getDBConnection() {
        if(dbCon == null) {
            dbCon = new DBConnection();
        }
        return dbCon;
    }

    //If application is multithreaded
    //synchronized will make all threads to wait it will become slow operation
    public static DBConnection getDBConnectionMultithreaded() {
        synchronized(DBConnection.class) {
            if(dbCon == null) {
                dbCon = new DBConnection();
            }
        }
        return dbCon;
    }

    //Solution for above is doubleChecked locks
    public static DBConnection getDBConnectionMultithreaded_doubleLocks() {
            lock = new ReentrantLock();
            if(dbCon == null) {
                lock.lock();
                if(dbCon == null) {
                    dbCon = new DBConnection();
                    lock.unlock();
                }
            }
        return dbCon;
    }
}
