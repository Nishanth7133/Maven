package org.pom2;

import org.maven.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM003 extends BaseClass {

	public POM003() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="src")
	private WebElement from;
	@FindBy(id="dest")
	private WebElement destination;

}
