package com.mycompany.browser;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class ValidationTest3 {
	
	




@BeforeMethod

public void UseridGeneration()

{

System.out.println("This block executes before Val3 each Test");

}

@BeforeTest

public void Cookies()

{

System.out.println("This block executes Before all Val3 Testcases");

//delete cookies

}

@AfterTest

public void Cookiesclose()

{

System.out.println("This block executes after all Val3 Testcases");

//close the browesers

}

@AfterMethod

public void Reportadding()

{

System.out.println("This block executes after each Val3 Test");

}

@Test

public void OpeningBrowser()

{

//This opens the Browser

System.out.println("Executing new Test Val3 2");

}

@Test

public void FlightBookings()

{

System.out.println("Executing new Test Val3 1");

}

@Test

public void FlightCancel()

{

System.out.println("Executing new Test Priority Val3 2");

}



}
