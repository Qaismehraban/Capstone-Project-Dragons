package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {

		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@class='image']")

	public WebElement item;

	@FindBy(xpath = "//select[@class='product__select']")

	public WebElement quantityDropdown;

	@FindBy(id = "addToCartBtn")

	public WebElement addToCartButton;

	@FindBy(id = "cartQuantity")

	public WebElement cartIconQuantity;

	@FindBy(xpath = "//p[text()='Apex Legends - 1,000 Apex Coins']")

	public WebElement apexLegendsFromSearchField;

	@FindBy(id = "cartBtn")

	public WebElement addToCartOption;

	@FindBy(id = "proceedBtn")

	public WebElement proceedToCheckoutButton;

	@FindBy(id = "placeOrderBtn")

	public WebElement placeYourOrderBtn;

	@FindBy(xpath = "//div[text()='Order Placed Successfully']")

	public WebElement orderPlacedSuccessMessage;

	@FindBy(id = "cancelBtn")

	public WebElement cancelTheOrderButton;

	@FindBy(id = "reasonInput")

	public WebElement cancelationReasonDropdown;

	@FindBy(id = "orderSubmitBtn")

	public WebElement cancelOrderBtn;

	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")

	public WebElement orderCancelationMessage;

	@FindBy(xpath = "//p[text()='Show Details']")

	public WebElement orderDetailList;

	@FindBy(id = "returnBtn")

	public WebElement returnItemsButton;

	@FindBy(id = "reasonInput")

	public WebElement returnReasonDropdown;

	@FindBy(id = "dropOffInput")

	public WebElement dropOffDropdown;

	@FindBy(id = "orderSubmitBtn")

	public WebElement returnOrderBtn;

	@FindBy(xpath = "//p[text()='Return was successfull']")

	public WebElement returnSuccessMessage;

	@FindBy(id = "reviewBtn")

	public WebElement reviewButton;

	@FindBy(id = "headlineInput")

	public WebElement headlineInputField;

	@FindBy(id = "descriptionInput")

	public WebElement reviewTextInputField;

	@FindBy(id = "reviewSubmitBtn")

	public WebElement addYourReviewBtn;

	@FindBy(xpath = "//div[text()='Your review was added successfully']")

	public WebElement reviewAddedSuccessMessage;

}
