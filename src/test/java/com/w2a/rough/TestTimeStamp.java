package com.w2a.rough;

import java.util.Date;

public class TestTimeStamp {

	public static void main(String[] args) {


		Date d= new Date();
		StringBuilder screenshotName = new StringBuilder();
		screenshotName.append(d.toString().replace(":", "_").replace(" ", "_")).append(".jpg").toString();
		System.out.println(screenshotName);
		System.out.println(d);

	}

}
