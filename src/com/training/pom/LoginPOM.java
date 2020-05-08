package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPOM<Webelement> {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement loginBtn;
	
		
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement SignInBtn;  
	
	@FindBy(xpath="//div[contains(text(),'Posts')]")
	private WebElement Poststohover;
	
	@FindBy(xpath="//a[contains(text(),'All Posts')]")
	private WebElement AllPostsBtn; 
	
	@FindBy(xpath="//tr[@id='post-5073']//td[1]")
	private WebElement FirstPost;
	
		
	@FindBy(xpath="//a[@class='submitdelete']")
	private WebElement Trash;
	
	@FindBy(xpath="//a[contains(text(),'Add New')]")
	private WebElement AddNew;
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement Label;
	
	@FindBy(xpath="//textarea[@id='content']")
	private WebElement TextContent;
	
	@FindBy(xpath="//input[@id='publish']")
	private WebElement Publish;
	
	@FindBy(xpath="//a[contains(@class,'current')][contains(text(),'Categories')]")
	private WebElement Categories;
	
	@FindBy(xpath="//input[@id='tag-name']")
	private WebElement NameText;
	
	@FindBy(xpath="//input[@id='tag-slug']")
	private WebElement Slug;
	
	
	@FindBy(xpath="//textarea[@id='tag-description']")
	private WebElement Description;
	
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement AddCategoryBtn;
	
	
	/** Test Case1 starts here
	 * Click on Login button on the home screen of http://realty-real-estate.upskills.in/
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
	 public void Firstpost() {
		 Actions post = new Actions(driver);
		 post.moveToElement(FirstPost).perform();
		 
	 } 
	  
	     /**
		 * Clicking on the Trash Button logic
		 */
	   public void Trash() {
		this.Trash.click();
		 
	 } 
	 
	 /** 1st  Test Case Ends here  **/
	/**
	 * 2nd Test case starts here --Clicking on the AddNew button for creating new post
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
	 */
	public void Publish() {
		 this.Publish.click();
	 }
	 
	
	
	 /** 2nd  Test Case Ends here  **/
	 
	 
	 /**
	 * 3rd Test Case Starts here --	 * Clicking on Categories Link
	 */
	public void Categories() {
		 this.Categories.click();
	 }
	 
	 
	 /**
	 * Passing value for the Name of the Category Field
	 */
	public void NameText(String NameText) {
		    this.NameText.clear();
			this.NameText.sendKeys(NameText);
	 
	 }
	 
	 
	 /**
	 * Passing value for the Slug Field
	 */
	public void Slug(String Slug) {
		    this.Slug.clear();
			this.Slug.sendKeys(Slug);
	 
	 }


	/**
	 * Passing value for the Description Field
	 */
	 public void Description(String Description) {
		    this.Description.clear();
			this.Description.sendKeys(Description);
	 
	 }
	 
	 /**
		 * Click on Add category Button Field
		 */
	 public void AddCategoryBtn() {
		 this.AddCategoryBtn.click();
	 }
	 /** 3rd  Test Case Ends here  **/
}
