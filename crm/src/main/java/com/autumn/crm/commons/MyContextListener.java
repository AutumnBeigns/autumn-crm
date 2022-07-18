//package com.autumn.crm.commons;
//
//import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
//
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//// 解决如下错误：此Web应用程序实例已停止。无法加载[]。为了调试以及终止导致非法访问的线程，将抛出以下堆栈跟踪。
//public class MyContextListener implements ServletContextListener {
//
//    @Override
//    public void contextInitialized(ServletContextEvent arg0) {
//        System.out.println("webService start");
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent arg0) {
//        System.out.println("webService stop");
//        try {
//            while(DriverManager.getDrivers().hasMoreElements()) {
//                DriverManager.deregisterDriver(DriverManager.getDrivers().nextElement());
//            }
//            System.out.println("jdbc Driver close");
//            AbandonedConnectionCleanupThread.checkedShutdown();
//            System.out.println("clean thread success");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
