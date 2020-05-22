package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginExcelTest {
	private static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	private static Properties properties;
	private static ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		/*3rd Week test case RETC 076 AND RECT 078 */
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
		
		loginPOM.clickLoginBtn();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickSignInBtn();
	}

	@BeforeMethod
	public void setUp() throws Exception {
	
	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.quit();
		
		 
	}
	
		/*Test RETC 076 and RETC 078 for taking data from excel sheet*/
	
	@Test(priority=1,dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String userName, String Email, String Firstname,String Lastname, String Website,String password,String Role) throws InterruptedException 
	{
		
		loginPOM.Users();
	    loginPOM.Addnw();
	    
		loginPOM.sendUserName(userName);
		loginPOM.sendEmail(Email);
		loginPOM.sendFirstname(Firstname);
		loginPOM.sendLastname(Lastname);
		loginPOM.sendWebsite(Website);
	    Thread.sleep(5000);
		loginPOM.ShowPasswordBtn();
		loginPOM.EntPswrd(password);
		Thread.sleep(3000);
		loginPOM.ChkWkPwd();
		//loginPOM.sendPassword(password);
		loginPOM.SendRole(Role);
		Thread.sleep(5000);
		loginPOM.AddUserBtn();
		//loginPOM.AddNwUsr();
		
		
		
		screenShot.captureScreenShot(userName); 

	} 

} 