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
	
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
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
	
	
	
			
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	private Object xpathpartialLinkText(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickSignInBtn() {
		this.SignInBtn.click();
	}
	
	public void hoverPosts() {
		Actions act = new Actions(driver);
		act.moveToElement(Poststohover).perform();
	}
	
	public void clickPostsBtn() {
		this.AllPostsBtn.click(); 
	
	}
	
	/* public void Firstpost() {
		// Actions post = new Actions(driver);
		// post.moveToElement(FirstPost).perform();
		 
	 }
	 
	 public void Trash() {
		// this.Trash.click();
		 
	 } */
	 
	 public void Addnew() {
		 this.AddNew.click();
	 }
	 
	 public void sendLabel(String Label) {
		    this.Label.clear();
			this.Label.sendKeys(Label);
	 }
	 
	 public void sendContent(String TextContent) {
		    this.TextContent.clear();		    
			this.TextContent.sendKeys(TextContent);
	 }

	 public void Publish() {
		 this.Publish.click();
	 }
	 
	 
	 public void Categories() {
		 this.Categories.click();
	 }
	 
	 
	 public void NameText(String NameText) {
		    this.NameText.clear();
			this.NameText.sendKeys(NameText);
	 
	 }
	 
	 
	 public void Slug(String Slug) {
		    this.Slug.clear();
			this.Slug.sendKeys(Slug);
	 
	 }


	 
	 public void Description(String Description) {
		    this.Description.clear();
			this.Description.sendKeys(Description);
	 
	 }
	 
	 
	 public void AddCategoryBtn() {
		 this.AddCategoryBtn.click();
	 }
	 
}
