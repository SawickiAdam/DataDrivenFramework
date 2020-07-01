package com.w2a.rough;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Date;

public class TestLogs {

    public static Logger log = Logger.getLogger(TestLogs.class.getName());

    public static void main(String[] args) {

        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_");

        System.out.println(date);
        System.setProperty("current.date", date);
        PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");

        log.info("This is the information log");

        log.error("Here the error logs will be printed");

    }
}
