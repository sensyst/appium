package com.gomachanic.resources;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.gomachanic.executor.Constants;

public class ExtentReport {
	public static ExtentTest test = null;
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static Media media;
	public static MediaEntityModelProvider mediaEntityModelProvider;

	@BeforeTest
	public ExtentReports startReport() {
		String extentFilePath = Constants.sExtentFP;
		// Extent report initialize
		extent = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter(extentFilePath);
		htmlReporter.config().setCSS("css-string");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setJS("js-string");
		htmlReporter.config().setProtocol(Protocol.HTTPS);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("MMMM dd, yyyy HH:mm:ss");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Test Report");
		extent.attachReporter(htmlReporter);
		return extent;
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

}
