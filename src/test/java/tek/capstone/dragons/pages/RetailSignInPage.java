package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "email")

	public WebElement emailInputField;

	@FindBy(id = "password")

	public WebElement passwordInputField;

	@FindBy(id = "loginBtn")

	public WebElement loginButton;

	@FindBy(id = "newAccountBtn")

	public WebElement createNewAccountBtn;

	@FindBy(id = "nameInput")

	public WebElement nameFieldForRegister;

	@FindBy(id = "emailInput")

	public WebElement emailFieldForRegister;

	@FindBy(id = "passwordInput")

	public WebElement passwordFieldForRegister;

	@FindBy(id = "confirmPasswordInput")

	public WebElement confirmPasswordFieldForRegister;

	@FindBy(id = "signupBtn")

	public WebElement signupButton;

	@FindBy(xpath = "//h1[text()='Your Profile']")

	public WebElement yourProfile;

}
