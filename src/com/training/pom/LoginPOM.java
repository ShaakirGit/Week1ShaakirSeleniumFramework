package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.generics.ScreenShot;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginPOM<Webelement> {
	private WebDriver driver;

	public LoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='sign-in']")
	private WebElement loginBtn;

	@FindBy(id = "user_login")
	private WebElement userName;

	@FindBy(id = "user_pass")
	private WebElement password;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement SignInBtn;

	@FindBy(xpath = "//div[contains(text(),'Posts')]")
	private WebElement Poststohover;

	@FindBy(xpath = "//a[contains(text(),'All Posts')]")
	private WebElement AllPostsBtn;
	
	
	@FindBy(xpath = "//tr[@id='post-5073']//td[1]")
	private WebElement FirstPost;

	@FindBy(xpath = "//a[@class='submitdelete']")
	private WebElement Trash;

	@FindBy(xpath = "//a[contains(text(),'Add New')]")
	private WebElement AddNew;

	@FindBy(xpath = "//input[@id='title']")
	private WebElement Label;

	@FindBy(xpath = "//textarea[@id='content']")
	private WebElement TextContent;

	@FindBy(xpath = "//input[@id='publish']")
	private WebElement Publish;

	@FindBy(xpath = "//a[contains(@class,'current')][contains(text(),'Categories')]")
	private WebElement Categories;

	@FindBy(xpath = "//input[@id='tag-name']")
	private WebElement NameText;

	@FindBy(xpath = "//input[@id='tag-slug']")
	private WebElement Slug;

	@FindBy(xpath = "//textarea[@id='tag-description']")
	private WebElement Description;

	@FindBy(xpath = "//input[@id='submit']")
	private WebElement AddCategoryBtn;
	
	@FindBy(xpath ="//div[contains(text(),'Dashboard')]")
	private WebElement DashboardBtn;
	
	@FindBy(xpath= "//input[@id='in-category-739']")
	private WebElement CheckBox;
	
	
	@FindBy(xpath="//div[contains(text(),'Properties')]")
	private WebElement PropertiesBtn;
	
	@FindBy(xpath="//a[contains(text(),'Features')]")
	private WebElement FeaturesLnk;
	
	@FindBy(xpath="//input[@id='tag-name']")
	private WebElement FeatureName;
	
	@FindBy(css = "input[id=tag-slug]")		
	private WebElement SlugName;
		
	@FindBy(xpath="//textarea[@id='tag-description']")
	private WebElement PrtyDescr;
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement AddnewFtrBtn;
	
    @FindBy(xpath="//a[@class='page-title-action']")
    private WebElement AddNwPrtyLnk;
    
    @FindBy(css = "input[id= title]")
    private WebElement PrptyTitle;
    
    
    @FindBy(xpath="//textarea[@id='content']")
    private WebElement PrptyCntnt;
    
   
    @FindBy(css = "input[id=in-property_feature-431]")
     private WebElement ftrchkbox;
    
    
    @FindBy(xpath="//li[@id='menu-item-617']//a[contains(text(),'Blog')]")
    private WebElement BlogBtn;
    
  
    @FindBy(xpath="//div[@id='post-5237']//a[@class='read-more'][contains(text(),'Read More')]")
    private WebElement ClkReadMore;
    
    @FindBy(xpath="//textarea[@id='comment']")
    private WebElement Comment;
    
    @FindBy(xpath="//input[@id='author']")
    private WebElement Name;
    
    @FindBy(xpath ="//input[@id='email']")
    private WebElement Email;
    
    @FindBy(xpath = "//input[@id='submit']")
    private WebElement PstSubBtn;
    
    @FindBy(css = "body")
    private WebElement SwitchWndw;
    
    @FindBy(xpath="//div[contains(text(),'Comments')]")
    private WebElement CmntsLnk;
    
    @FindBy(xpath ="//p[contains(text(),'Good Test6')]")
    private WebElement Cmntshover;
    
    @FindBy(xpath ="//tr[@id='comment-1912']//a[@class='vim-r comment-inline'][contains(text(),'Reply')]")
    private WebElement ReplyLnk;
    
    @FindBy(css = "textarea[id=replycontent]")
    private WebElement RplyCnt;
    
    @FindBy(xpath="//span[@id='replybtn']")
    private WebElement ReplyBtn;
    
    @FindBy(xpath ="//div[contains(text(),'Users')]")
    private WebElement UserLnkHover;
    
    @FindBy(linkText = "Add New")
    private WebElement Addnw;
    
    @FindBy(id="first_name")
    private WebElement Firstname;
    
    @FindBy(id="last_name")
    private WebElement Lastname;
    
    @FindBy(id="url")
    private WebElement Website;
    
    @FindBy(xpath="//button[@class='button wp-generate-pw hide-if-no-js']")
    private WebElement ShowPasswordBtn;
    
    @FindBy(id="pass1-text")
    private WebElement EntPassword; 
    
    @FindBy(id="createusersub")
    private WebElement AddUserBtn;
    
    @FindBy(xpath="//a[@class='page-title-action']")
    private WebElement AddNw;
    
    @FindBy(id="role")
    private WebElement Role;
    
    @FindBy(className ="pw-checkbox")
    private WebElement ConfrmWkPwd;
    
	/**
	 * Test Case1 starts here Click on Login button on the home screen of
	 * http://realty-real-estate.upskills.in/
	 */
	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	/**
	 * Passing Username on the screen logic
	 */
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	/**
	 * Passing Password Logic
	 */
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	/**
	 * Clicking on Sign In Button
	 */
	public void clickSignInBtn() {
		this.SignInBtn.click();
	}

	/**
	 * Hovering on the Posts Link
	 */
	public void hoverPosts() {
		Actions act = new Actions(driver);
		act.moveToElement(Poststohover).perform();
	}

	/**
	 * Click on AllPosts link Logic
	 */
	
	 public void clickPostsBtn() { 
		 this.AllPostsBtn.click();
	 
	 }
	 
	 /**
		 * Clicking on the First Posts logic
		 */
	/*
	 * public void Firstpost() { 
	 * Actions post = new Actions(driver);
	 * post.moveToElement(FirstPost).perform();
	 * 
	 * }
	 * 
	 *//**
		 * Clicking on the Trash Button logic
		 *//*
			 * public void Trash() { 
			 * this.Trash.click();
			 * 
			 * }
			 */

	/** 1st week  1st Test Case Ends here **/
	/**
	 * 1st week  2nd Test case starts here --Clicking on the AddNew button for creating new
	 * post
	 */
	public void Addnew() {
		this.AddNew.click();
	}

	/**
	 * Passing input to the Title Field
	 */
	public void sendLabel(String Label) {
		this.Label.clear();
		this.Label.sendKeys(Label);
	}

	/**
	 * Passing input to the Description Field
	 */
	public void sendContent(String TextContent) {
		this.TextContent.clear();
		this.TextContent.sendKeys(TextContent);
	}

	/**
	 * Clicking on Publish Button
	 * @throws InterruptedException 
	 */
	public void Publish() throws InterruptedException {
		
		   WebDriverWait wait = new WebDriverWait(driver, 30);              //Explicit wait
	        wait.until(ExpectedConditions.elementToBeClickable(Publish));
	        this.Publish.click();
		
		
	}

	/** 1st week  2nd Test Case Ends here **/

	/**
	 * 1st week 3rd Test Case Starts here -- * Clicking on Categories Link
	 */
	/*
	 * public void Categories() { 
	 * this.Categories.click(); 
	 * }
	 * 
	 *//**
		 * Passing value for the Name of the Category Field
		 */
	/*
	 * public void NameText(String NameText) { 
	 * this.NameText.clear();
	 * this.NameText.sendKeys(NameText);
	 * 
	 * }
	 * 
	 *//**
		 * Passing value for the Slug Field
		 */
	/*
	 * public void Slug(String Slug) { 
	 * this.Slug.clear(); 
	 * this.Slug.sendKeys(Slug);
	 * 
	 * }
	 * 
	 *//**
		 * Passing value for the Description Field
		 */
	/*
	 * public void Description(String Description) { 
	 * this.Description.clear();
	 * this.Description.sendKeys(Description);
	 * 
	 * }
	 * 
	 *//**
		 * Click on Add category Button Field
		 */
	/*
	 * public void AddCategoryBtn() { 
	 * this.AddCategoryBtn.click();
	 *  }
	 *//** 1st week 3rd Test Case Ends here **/
	
	/*2nd week-1st test case starts here */
	
	/*To click on Dashboard link */
	
	public void DashBoardClk() {
		this.DashboardBtn.click();
	}
	
	/*Checkbox to be clicked */
	public void CheckBoxClk() {
		this.CheckBox.click();
	}
	
	/*2nd week-Start 2nd test case */
	
	/*Clicking on Properties link button */
	public void PropertiesClk() {
		this.PropertiesBtn.click();
	}
	
	/*Clicking on Features link button */
	public void FeaturesClk() {
		this.FeaturesLnk.click();
	}
	
	/*Entering the Features value */
	public void FeatureName(String FeatureName) { 
		this.FeatureName.clear();
	
	  this.FeatureName.sendKeys(FeatureName);
	}
	
	/*Entering the Slug Name */
	public void SlugName(String SlugName) {
		this.SlugName.clear();
		
		this.SlugName.sendKeys(SlugName);
	}
	
	
	
	/*Entering the description  */
	public void PrtyDescr(String PrtyDescr) { 
		this.PrtyDescr.clear();	
	  this.PrtyDescr.sendKeys(PrtyDescr);
	}
	
	/*Clicking on add new feature btn */
	public void AddNewFeatureBtn() {
	this.AddnewFtrBtn.click();
	}
	
	/*Click on add new link of properties section */
	public void AddNewPrtyLnk() {
		this.AddNwPrtyLnk.click();
	}
	
	/*Enter the details in title section */
	public void PrptyTitle(String PrptyTitle) { 
	 this.PrptyTitle.clear();	
	  this.PrptyTitle.sendKeys(PrptyTitle);
	}
	
	/*Enter details of property content in textbox*/
	public void PrptyCntnt(String PrptyCntnt) { 
		this.PrptyCntnt.clear();	
	  this.PrptyCntnt.sendKeys(PrptyCntnt);
	}
	
	/*Click on the features checkbox */
	public void FtrchkBox() {
		this.ftrchkbox.click();
	}
	
	
	/*2nd Week 3rd test cases starts */
	
	/*Click on the Blog Button */
	public void BlogBtn() {
		this.BlogBtn.click();
	}
	
	
	
	/*Click on the Read more link */	
	public void ClkReadMore() {
		this.ClkReadMore.click();
	}
	
	/*Enter details on the Comment textbox */
	public void Comment(String Comment) {
		this.Comment.sendKeys(Comment);
	}
	
	/*Put a dummy Name which is required for posting blog*/
	public void Name(String Name) {
		this.Name.sendKeys(Name);
	}
	
	/*Put a dummy Email which is required for posting blog*/
	public void Email(String Email) {
		this.Email.sendKeys(Email);
	}
	
	
	/*Click on Post submit Button */
	public void PstSubBtn() {
		this.PstSubBtn.click();
	}
	
	/*Opening a new window */
	public void SwitchWnd() {
		driver.navigate().to("http://realty-real-estate.upskills.in");
	}
		/*
		this.SwitchWndw.sendKeys(Keys.CONTROL + "n");
		try {
		Thread.sleep(5000);
		for (String winHandle:driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
						
		}
		
		//driver.get("baseURL");
		driver.get("http://realty-real-estate.upskills.in");
	}catch(Exception e)
		{
		System.out.println(e);
		}
	
	
     } */
	
	/*Clicking on the comments link */
	public void CmntsLnk() {
		this.CmntsLnk.click();
	}
	
	/*Mouse over the comments */
	public void CmntsHover() {
		Actions act = new Actions(driver);
		act.moveToElement(Cmntshover).perform();
	}
	
	/*Click on the Reply icon */
	public void RplyLnk() {
		this.ReplyLnk.click();
	}
	
	/*Enter the Reply comments */
	public void RplyCnt(String RplyCnt) {
		this.RplyCnt.sendKeys(RplyCnt);
	}
	
	/*Click on the Reply Button */
	public void RplyBtn() {
		this.ReplyBtn.click();
	}
	
	
	
	//*3rd week start complex test case for adding users with the different values *//
	
	public void Users() { 
		 Actions Users = new Actions(driver);
		Users.moveToElement(UserLnkHover).perform();
	
	}
	
	public void Addnw() {
		this.Addnw.click();
	}
	
	
	public void sendEmail(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}
	
	public void sendFirstname(String Firstname) {
		this.Firstname.clear();
		this.Firstname.sendKeys(Firstname);
	}
	
	public void sendLastname(String Lastname) {
		this.Lastname.clear();
		this.Lastname.sendKeys(Lastname);
	}
	
	public void sendWebsite(String Website) {
		this.Website.clear();
		this.Website.sendKeys(Website);
	}
	
	public void ShowPasswordBtn() {
		this.ShowPasswordBtn.click();
	}
	
	public void EntPswrd(String password) {
		this.EntPassword.clear();
		this.EntPassword.sendKeys(password);
	}
	
	public void AddUserBtn() {
		this.AddUserBtn.click();
	}
	
	 /* public void AddNwUsr() {
		this.Addnw.click();
	} */
	
	public void SendRole(String Role) {
    this.Role.sendKeys(Role);
	}
	
	public void ChkWkPwd() {
		this.ConfrmWkPwd.click();
	}
	
	//*3rd week end complex test case for adding users with the different values *//
	
}
