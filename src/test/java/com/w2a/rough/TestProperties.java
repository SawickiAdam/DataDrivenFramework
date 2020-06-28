package com.w2a.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	
	public static void main(String[] args) throws IOException {

		// Sciezka do projektu
		System.out.println(System.getProperty("user.dir"));

		// Inicjalizacja "Properties" czyli klasy która zarządza korzystaniem z Config.properties i or.properties
		Properties config = new Properties();
		Properties OR = new Properties();

		// Stworzenie pliku i podanie mu ścieżki do propertisów
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);

		// Stworzenie pliku i podanie mu ścieżki do propertisów
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		
		System.out.println(config.getProperty("browser"));
		
		//driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		System.out.println(OR.getProperty("bmlBtn"));
	}

}
