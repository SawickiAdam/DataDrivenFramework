package com.w2a.rough;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogs2 {

    public static Logger log = LogManager.getLogger(TestLogs.class.getName());

    public static void main(String[] args) {

        System.setProperty("log4j.configurationFile", "./resources/properties/log4j2.properties");
        log.error("Test Error");

    }
}
