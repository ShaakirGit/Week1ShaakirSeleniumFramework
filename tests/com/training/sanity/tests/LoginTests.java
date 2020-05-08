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
	@Test(priority =1,enabled=true)
	public void validLoginTest() {
		/*1st Test case Logic Execution */
		loginPOM.clickLoginBtn();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickSignInBtn(); 
		loginPOM.hoverPosts();
		loginPOM.clickPostsBtn();
		loginPOM.Firstpost();
		loginPOM.Trash();		
		
		/*2nd Test case Logic Execution */
		loginPOM.Addnew();
		loginPOM.sendLabel("Shaakir's Post Label");
		loginPOM.sendContent("This is Shaakir's Content");
		loginPOM.Publish();
		
		/*3rd Test case Logic Execution */
		loginPOM.Categories();
		loginPOM.NameText("Shaakir's Category");
		loginPOM.Slug("Slug Test");
		loginPOM.Description("Shaakir's 3rd Test");
		loginPOM.AddCategoryBtn();
		
		
	    screenShot.captureScreenShot("TestCase");
	}
	
	
}
