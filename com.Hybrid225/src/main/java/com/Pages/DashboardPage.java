package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	
	//public WebDriver driver;

		@FindBy(xpath="//b[text()='Java By Kiran']")
		WebElement header;

		@FindBy(xpath="//span[text()='Users']")
		WebElement userBtn;

		public DashboardPage(WebDriver driver) {
			//this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		public Userpage clickuser(WebDriver driver) {
			userBtn.click();  
			return new Userpage(driver);
		}

		public String getHeader() {
			System.out.println(header.getText());
			return header.getText();  

		}


}
