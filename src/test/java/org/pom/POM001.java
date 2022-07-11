package org.pom;




import org.maven.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM001 extends BaseClass {
	
	public POM001() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(name="email")
	private WebElement userName;
	@FindBy(name="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement LoginButton;
	

	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	}
	


	

