package com.gomachanic.executor;

import java.io.File;

public class Constants {
	public static String globalFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator
			+ "main" + File.separator + "java" + File.separator + "com" + File.separator + "gomachanic" + File.separator
			+ "resources" + File.separator + "global.properties";

	public static String sExtentFP = System.getProperty("user.dir") + File.separator + "Report" + File.separator
			+ "ExtReport" + File.separator + "TestExecutionReport.html";
	
}
