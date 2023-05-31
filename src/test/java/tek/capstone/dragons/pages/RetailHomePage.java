package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(id = "signinLink")

	public WebElement signinOption;

	@FindBy(xpath = "//a[text()='TEKSCHOOL']")

	public WebElement tekSchoolLogo;

	@FindBy(id = "accountLink")

	public WebElement accountOption;

	@FindBy(id = "orderLink")

	public WebElement ordersOption;

	@FindBy(id = "logoutBtn")

	public WebElement logOutOption;

	@FindBy(id = "search")

	public WebElement allDepartments;

	@FindBy(xpath = "//span[text()='Electronics']")

	public WebElement electronicsOption;

	@FindBy(xpath = "//span[text()='Computers']")

	public WebElement computersOption;

	@FindBy(xpath = "//span[text()='Smart Home']")

	public WebElement smartHomeOption;

	@FindBy(xpath = "//span[text()='Sports']")

	public WebElement sportsOption;

	@FindBy(xpath = "//span[text()='Automative']")

	public WebElement automativeOption;

	@FindBy(id = "hamburgerBtn")

	public WebElement sidebarAllButton;

	@FindBy(id = "searchInput")

	public WebElement searchInputField;

	@FindBy(id = "searchBtn")

	public WebElement searchButton;

	@FindBy(xpath = "//span[text()='TV & Video']")

	public WebElement tvAndVideo;

	@FindBy(xpath = "//span[text()='Video Games']")

	public WebElement videoGames;

	@FindBy(xpath = "//span[text()='Accessories']")

	public WebElement accessories;

	@FindBy(xpath = "//span[text()='Networking']")

	public WebElement networking;

	@FindBy(xpath = "//span[text()='Smart Home Lightning']")

	public WebElement smartHomeLightning;

	@FindBy(xpath = "//span[text()='Plugs and Outlets']")

	public WebElement plugsAndOutlets;

	@FindBy(xpath = "//span[text()='Athletic Clothing']")

	public WebElement athleticClothing;

	@FindBy(xpath = "//span[text()='Exercise & Fitness']")

	public WebElement exerciseAndFitness;

	@FindBy(xpath = "//span[text()='Automative Parts & Accessories']")

	public WebElement automativePartsAccessories;

	@FindBy(xpath = "//span[text()='MotorCycle & Powersports']")

	public WebElement motorCyclePowersports;

}
