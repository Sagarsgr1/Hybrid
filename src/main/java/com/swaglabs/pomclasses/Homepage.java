package com.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//Declaration
		@FindBy(xpath = "//div[.='Sauce Labs Backpack']")private WebElement p1;
		@FindBy(xpath = "//div[.='Sauce Labs Bike Light']")private WebElement p2;
		@FindBy(xpath = "//div[.='Sauce Labs Bolt T-Shirt']")private WebElement p3;
		@FindBy(xpath = "//div[.='Sauce Labs Fleece Jacket']")private WebElement p4;
		@FindBy(xpath = "//div[.='Sauce Labs Onesie']")private WebElement p5;
		@FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")private WebElement p6;
		//Initialization
		public Homepage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		public WebElement getP1() {
			return p1;
		}
		public WebElement getP2() {
			return p2;
		}
		public WebElement getP3() {
			return p3;
		}
		public WebElement getP4() {
			return p4;
		}
		public WebElement getP5() {
			return p5;
		}
		public WebElement getP6() {
			return p6;
		}
		public void HomePage(String s1,String s2,String s3,String s4,String s5,String s6) {
			     p1.sendKeys(s1);
			     p2.sendKeys(s2);
			     p3.sendKeys(s3);
			     p4.sendKeys(s4);
			     p5.sendKeys(s5);
			     p6.sendKeys(s6);
		}
}
