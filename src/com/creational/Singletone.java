package com.creational;

import java.util.concurrent.*;

public class Singletone {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        DBConnection db = DBConnection.getDBConnection();
        DBConnection db1 = DBConnection.getDBConnection();

        if (db == db1) {
            System.out.println("The singleton is the same");
        }

        ExecutorService es = Executors.newCachedThreadPool();
        Future<DBConnection>[] futureArr = new Future[1001];

        for (int i = 0; i < 999; i++) {
            //es.submit(new DBConnectionTask());//Instread of creating new task class we can use lambda
            futureArr[i] = es.submit(() -> DBConnection.getDBConnectionMultithreaded_doubleLocks());
        }
        Boolean allEqual = false;
        DBConnection db2 = futureArr[0].get();
        for (int i = 0; i < 999; i++) {
            if(db2 == futureArr[i].get()){
                allEqual = true;
            }
            if(allEqual){
                System.out.println("The singleton is the same");
            }
        }

    }
}

class DBConnectionTask implements Callable<DBConnection> {
    @Override
    public DBConnection call() throws Exception {
        return DBConnection.getDBConnection();
    }
}
