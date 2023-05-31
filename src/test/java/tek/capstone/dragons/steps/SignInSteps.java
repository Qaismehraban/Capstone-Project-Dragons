package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	// syntax: @annotation("value from step")
	// public void methodName(){}

	@Given("User is on retail website")

	public void userIsOnRetailWebsite() {

		String actualTitle = getTitle();

		String expectedTitle = "React App";

		Assert.assertEquals(actualTitle, expectedTitle);

		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));

		logger.info("Retail website opened and verified");

	}

	@When("User click on Sign in option")

	public void userClickOnSignInOption() {

		click(factory.homePage().signinOption);

		logger.info("user clicked on sign in option");

	}

	@Then("User enter email {string} and password {string}")

	public void userEnterEmailAndPassword(String email, String password) {

		sendText(factory.signInPage().emailInputField, email);

		sendText(factory.signInPage().passwordInputField, password);

		logger.info(email + ": was entered");

	}

	@Then("User click on login button")

	public void userClickOnLoginButton() {

		click(factory.signInPage().loginButton);

		logger.info("login button was clicked");

	}

	@Then("User should be logged into Account")

	public void userShouldBeLoggedInIntoAccount() {

		waitTillPresence(factory.homePage().accountOption);

		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));

		Assert.assertTrue(isElementDisplayed(factory.homePage().ordersOption));

		Assert.assertTrue(isElementDisplayed(factory.homePage().logOutOption));

		logger.info("user logged into account");

	}
	// Create new account

	@Then("User click on Create New Account button")

	public void userClickOnCreateNewAccountButton() {

		click(factory.signInPage().createNewAccountBtn);

		logger.info("New account button was clicked");

	}

	@Then("User fill the signUp information with below data")

	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {

		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> row : data) {

			sendText(factory.signInPage().nameFieldForRegister, row.get("name"));

			sendText(factory.signInPage().emailFieldForRegister, row.get("email"));

			sendText(factory.signInPage().passwordFieldForRegister, row.get("password"));

			sendText(factory.signInPage().confirmPasswordFieldForRegister, row.get("confirmPassword"));

			logger.info("Registration info entered");

		}

	}

	@Then("User click on SignUp button")

	public void userClickOnSignUpButton() {

		click(factory.signInPage().signupButton);

		logger.info("Sign up button was clicked");

	}

	@Then("User should be logged in into Account")

	public void userShouldBeLoggedInIntoMyAccount() {

		waitTillPresence(factory.homePage().accountOption);

		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));

		Assert.assertTrue(isElementDisplayed(factory.homePage().ordersOption));

		Assert.assertTrue(isElementDisplayed(factory.homePage().logOutOption));

		logger.info("User successfully logged in into account");

	}

}
