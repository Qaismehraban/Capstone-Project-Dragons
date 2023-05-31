package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {

		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(id = "nameInput")

	public WebElement accountNameField;

	@FindBy(id = "personalPhoneInput")

	public WebElement accountPhoneField;

	@FindBy(xpath = "//button[@id='personalUpdateBtn']")

	public WebElement updateButton;

	@FindBy(id = "profileImage")

	public WebElement profileImage;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")

	public WebElement messageUpdatedSuccessText;

	@FindBy(xpath = "//p[text()='Add a payment method']")

	public WebElement addPaymentMethodLink;

	@FindBy(id = "cardNumberInput")

	public WebElement cardNumberInput;

	@FindBy(id = "nameOnCardInput")

	public WebElement nameOnCardInput;

	@FindBy(xpath = "//select[@id='expirationMonthInput']")

	public WebElement expirationDateMonth;

	@FindBy(id = "expirationYearInput")

	public WebElement expirationDateYear;

	@FindBy(id = "securityCodeInput")

	public WebElement securityCodeInput;

	@FindBy(id = "paymentSubmitBtn")

	public WebElement addYourCardButton;

	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")

	public WebElement paymentMethodSuccessMessage;

	@FindBy(xpath = "//div[@class='account__payment-sub']//p[text()='Master Card']")

	public WebElement masterCard;

	@FindBy(xpath = "//button[text()='Edit']")

	public WebElement editPaymentButton;

	@FindBy(id = "paymentSubmitBtn")

	public WebElement updateYourCardButton;

	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")

	public WebElement paymentMethodupdatedSuccessfullyMessage;

	@FindBy(xpath = "//button[text()='remove']")

	public WebElement removePaymentButton;

	@FindBy(xpath = "//p[text()='Add Address']")

	public WebElement AddAddressOption;

	@FindBy(id = "countryDropdown")

	public WebElement countryDropdown;

	@FindBy(id = "fullNameInput")

	public WebElement fullNameInput;

	@FindBy(id = "phoneNumberInput")

	public WebElement phoneNumInput;

	@FindBy(id = "streetInput")

	public WebElement streetInput;

	@FindBy(id = "apartmentInput")

	public WebElement apartmentInput;

	@FindBy(id = "cityInput")

	public WebElement cityInput;

	@FindBy(xpath = "//select[@name='state']")

	public WebElement stateDropdown;

	@FindBy(id = "zipCodeInput")

	public WebElement zipCodeInput;

	@FindBy(id = "addressBtn")

	public WebElement addYourAddressButton;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")

	public WebElement addressAddedSuccessfulltText;

	@FindBy(xpath = "//button[text()='Edit']")

	public WebElement editBtnFromAddress;

	@FindBy(id = "addressBtn")

	public WebElement updateYourAddressBtn;

	@FindBy(xpath = "//button[text()='Remove']")

	public WebElement removeAddressButton;

	@FindBy(xpath = "//h1[text()='Your Profile']")

	public WebElement yourProfileText;

	@FindBy(xpath = "//div[text()='Address Updated Successfully']")

	public WebElement addressUpdatedSuccessfullyMessage;

}
