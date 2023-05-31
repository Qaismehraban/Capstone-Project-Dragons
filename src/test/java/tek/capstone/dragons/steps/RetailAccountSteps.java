package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String NameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().accountNameField);
		sendText(factory.accountPage().accountNameField, NameValue);
		clearTextUsingSendKeys(factory.accountPage().accountPhoneField);
		sendText(factory.accountPage().accountPhoneField, phoneValue);
		logger.info("user updated the name and the phone value");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("user cliced on update button");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().messageUpdatedSuccessText);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().messageUpdatedSuccessText));
		logger.info("user profie information updated");

	}

	@When("User click on Add a payment method link")

	public void userClickOnAddAPaymentMethodLink() {

		waitTillPresence(factory.accountPage().addPaymentMethodLink);

		click(factory.accountPage().addPaymentMethodLink);

		logger.info("User successfully clicked on add payment method link");

	}

	@When("User fill Debit or credit card information")

	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {

		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> row : data) {

			sendText(factory.accountPage().cardNumberInput, row.get("cardNumber"));

			sendText(factory.accountPage().nameOnCardInput, row.get("nameOnCard"));

			selectByVisibleText(factory.accountPage().expirationDateMonth, row.get("expirationMonth"));

			selectByVisibleText(factory.accountPage().expirationDateYear, row.get("expirationYear"));

			sendText(factory.accountPage().securityCodeInput, row.get("securityCode"));

		}

		logger.info("Informations were added successfully");

	}

	@When("User click on Add your card button")

	public void userClickOnAddYourCardButton() {

		click(factory.accountPage().addYourCardButton);

		logger.info("Add Your Card button was successfully clicked");

	}

	@Then("a message should be displayed 'Payment Method added successfully'")

	public void aMessageShouldBeDisplayed() {

		waitTillPresence(factory.accountPage().paymentMethodSuccessMessage);

		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodSuccessMessage));

		logger.info("Payment method addedd successfully");

	}

	@When("User click on Edit option of card section")

	public void userClickOnEditOptionOfCardSection() {

		click(factory.accountPage().masterCard);

		waitTillPresence(factory.accountPage().editPaymentButton);

		click(factory.accountPage().editPaymentButton);

		logger.info("User successfully clicked on Edit button");

	}

	@When("user edit information with below data")

	public void userEditInformationWithBelowData(DataTable dataTable) {

		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> row : data) {

			clearTextUsingSendKeys(factory.accountPage().cardNumberInput);

			clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);

			clearTextUsingSendKeys(factory.accountPage().securityCodeInput);

			sendText(factory.accountPage().cardNumberInput, row.get("cardNumber"));

			sendText(factory.accountPage().nameOnCardInput, row.get("nameOnCard"));

			selectByVisibleText(factory.accountPage().expirationDateMonth, row.get("expirationMonth"));

			selectByVisibleText(factory.accountPage().expirationDateYear, row.get("expirationYear"));

			sendText(factory.accountPage().securityCodeInput, row.get("securityCode"));

		}

		logger.info("Informations were added successfully");

	}

	@When("user click on Update Your Card button")

	public void userClickOnUpdateYourCardButton() {

		click(factory.accountPage().updateYourCardButton);

		logger.info("User successfully clicked on Update Your Card button");

	}

	@Then("a message should be displayed 'Payment Method updated Successfully'")

	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {

		waitTillPresence(factory.accountPage().paymentMethodupdatedSuccessfullyMessage);

		Assert.assertEquals("Payment Method updated Successfully",

				factory.accountPage().paymentMethodupdatedSuccessfullyMessage.getText().trim());

		logger.info("Payment method updated successfully");

	}

	@When("User click on remove option of card section")

	public void userClickOnRemoveOptionOfCardSection() {

		click(factory.accountPage().masterCard);

		click(factory.accountPage().removePaymentButton);

		logger.info("remove button was clicked successfully");

	}

	@Then("payment details should be removed")

	public void paymentDetailsShouldBeRemoved() {

		Assert.assertTrue(isElementDisplayed(factory.accountPage().yourProfileText));

		logger.info("Payment details removed successfully");

	}

}
