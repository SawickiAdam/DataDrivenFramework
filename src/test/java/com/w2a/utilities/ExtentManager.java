package com.w2a.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import sun.awt.DisplayChangedListener;

import java.awt.*;

public class ExtentManager {
	
	private static ExtentReports extent;
	private static String css = ".r-img {width: 30%;}";
	
	

	// metoda przyjmująca sciezke do pliku wraz z nazwa pliku i zwracająca Stringi wpisane
    public static ExtentReports createInstance(String fileName) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
       
        
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);

        htmlReporter.config().setCSS(css);
        
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation Tester", "Adam Sawicki");
        extent.setSystemInfo("Organization", "AS");
        extent.setSystemInfo("Build no", "AS-1234");

        return extent;
    }

}
