package com.myApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext ca = new ClassPathXmlApplicationContext("config_1.xml");

        Information in = (Information) ca.getBean("inf");
        System.out.println(in);
        
        Process pc = (Process) ca.getBean("infor");
        System.out.println(pc);
    }
}
