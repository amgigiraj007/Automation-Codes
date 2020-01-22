package com.gmail.pages;

import org.openqa.selenium.WebDriver;
import com.gmail.base.*;
import com.gmail.pages.*;

import com.gmail.base.BasePageObject;

public class testpage extends BasePageObject {
	
	private static final String URL = "https://www.google.com/intl/en-GB/gmail/about/#";
	public testpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/* Open Home Page */
	public void openHomePage() throws Exception {
		getPage(URL);
		waitForHomePageLoad();
		closemonetate();
	}

	public void waitForHomePageLoad() throws Exception {
		waitForJavascripttoLoad();
	}

	/* Get Home page Link */
	public String getHomepageLink() {
		return URL;
	}

}
