package com.mycompany.app;


import java.io.IOException;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class ValidationTest {
	
	




@BeforeSuite

public void UseridGeneration() throws IOException, InterruptedException

{
Runtime.getRuntime().exec("cmd /c start C:\\appium.bat");
System.out.println("This block executes before aa each Test");
Thread.sleep(120000L);

}
}