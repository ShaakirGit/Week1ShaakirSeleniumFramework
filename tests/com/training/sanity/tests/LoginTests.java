package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		// driver.quit();
	}
	@Test(priority =1,enabled=false)
	public void validLoginTest() throws InterruptedException {
		/*1st Test case Logic Execution */
		loginPOM.clickLoginBtn();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickSignInBtn(); 
		loginPOM.hoverPosts();
		/*
		 * loginPOM.clickPostsBtn(); loginPOM.Firstpost(); loginPOM.Trash();
		 */
		/*2nd Test case Logic Execution */
		/*
		 * loginPOM.Addnew(); loginPOM.sendLabel("Shaakir's Post Label");
		 * loginPOM.sendContent("This is Shaakir's Content"); loginPOM.Publish();
		 */
		
		/*3rd Test case Logic Execution */
		/*
		 * loginPOM.Categories(); loginPOM.NameText("Shaakir's Category");
		 * loginPOM.Slug("Slug Test"); loginPOM.Description("Shaakir's 3rd Test");
		 * loginPOM.AddCategoryBtn();
		 */
		
		
		/*2nd week 1st Test case execution */
		
		loginPOM.Addnew();
		loginPOM.sendLabel("Shaakir's Post Label");
		loginPOM.sendContent("This is Shaakir's Content");
		loginPOM.CheckBoxClk();  
		Thread.sleep(5000);
		loginPOM.Publish();
		Thread.sleep(5000);
		loginPOM.DashBoardClk();
		loginPOM.hoverPosts();
		loginPOM.clickPostsBtn();
		
		/*2nd week 2nd Test case execution */
		loginPOM.PropertiesClk();
		loginPOM.FeaturesClk();
		loginPOM.FeatureName("Shantiniketan");
		loginPOM.SlugName("Prestige");
		loginPOM.PrtyDescr("New Launches of Apartments");
		loginPOM.AddNewFeatureBtn();
		loginPOM.PropertiesClk();
		Thread.sleep(5000);
		loginPOM.AddNewPrtyLnk();
		Thread.sleep(5000);
		loginPOM.PrptyTitle("prestige");
		loginPOM.PrptyCntnt("hometown");
		loginPOM.FtrchkBox();
		Thread.sleep(5000);
		loginPOM.Publish();
		
		 screenShot.captureScreenShot("TestCase");
	}
		/*2nd week 3rd Test Case execution  */
		@Test(priority =2,enabled=true)
		public void BlogFunctionality() throws InterruptedException {
		loginPOM.BlogBtn();
        loginPOM.ClkReadMore();
        loginPOM.Comment("Good Test12");
        loginPOM.Name("ShaakirTest");
        loginPOM.Email("test@xyz.com");
        loginPOM.PstSubBtn();
        
        loginPOM.SwitchWnd();
        loginPOM.clickLoginBtn();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickSignInBtn(); 
		
		loginPOM.CmntsLnk();
		loginPOM.CmntsHover();
		loginPOM.RplyLnk();
		loginPOM.RplyCnt("Reply3");
		Thread.sleep(5000);
		loginPOM.RplyBtn();
        
		
		
	    screenShot.captureScreenShot("TestCase1");
	}
	
	
}
