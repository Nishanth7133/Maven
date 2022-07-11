package org.pom;

import org.maven.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{
public AmazonPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(name="email")
private WebElement userName;
@FindBy(id="continue")
private WebElement Continue;
@FindBy(name="password")
private WebElement password;
@FindBy(id="signInSubmit")
private WebElement signIn;

public WebElement getUserName() {
	return userName;
}

public WebElement getContinue() {
	return Continue;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSignIn() {
	return signIn;
}
}







