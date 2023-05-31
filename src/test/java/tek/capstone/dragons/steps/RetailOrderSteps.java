package tek.capstone.dragons.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User change the category to 'Smart Home'")

	public void userChangeTheCategoryToSmartHome() {

		selectByVisibleText(factory.homePage().allDepartments, "Smart Home");

		logger.info("User successfully changed the category to <Smart Home> ");

	}

	@When("User search for an item 'kasa outdoor smart plug'")

	public void userSearchForAnItemKasaOutdoorSmartPlug() {

		sendText(factory.homePage().searchInputField, "kasa outdoor smart plug");

	}

	@When("User click on Search icon")

	public void userClickOnSearchIcon() {

		click(factory.homePage().searchButton);

	}

	@When("User click on item")

	public void userClickOnItem() {

		click(factory.retailorderpage().item);

		logger.info("Item has clicked successfully");

	}

	@When("User select quantity '2'")

	public void userSelectQuantity2() {

		selectByVisibleText(factory.retailorderpage().quantityDropdown, "2");

		logger.info("User successfully selected the quantity to 2");

	}

	@When("User click add to Cart button")

	public void userClickAddToCartButton() {

		click(factory.retailorderpage().addToCartButton);

	}

	@Then("the cart icon quantity should change to '2'")

	public void theCartIconQuantityShouldChangeTo2() {

		Assert.assertTrue(factory.retailorderpage().cartIconQuantity.isDisplayed());

		logger.info("Quantity changed to 2");

	}

	@When("User change the category to 'Electronics'")

	public void userChangeTheCategoryToElectronics() {

		selectByVisibleText(factory.homePage().allDepartments, "Electronics");

		logger.info("User successfully changed the category to Electronics");

	}

	@When("User search for an item 'Apex Legends'")

	public void userSearchForAnItemApexLegends() {

		sendText(factory.homePage().searchInputField, "Apex Legends");

	}

	@When("User select quantity '5'")

	public void userSelectQuantity5() {

		selectByVisibleText(factory.retailorderpage().quantityDropdown, "5");

		logger.info("Quantity selected successfully to 5");

	}

	@Then("the cart icon quantity should change to '5'")

	public void theCartIconQuantityShouldChangeTo5() {

		Assert.assertTrue(isElementDisplayed(factory.retailorderpage().cartIconQuantity));

		logger.info("Quantity changed to 5");

	}

	@Then("User click on Cart option")

	public void userClickOnCartOption() {

		click(factory.retailorderpage().addToCartOption);

		logger.info("User successfully clicked on cart Option");

	}

	@Then("User click on Proceed to Checkout button")

	public void userClickOnProceedToCheckoutButton() {

		click(factory.retailorderpage().proceedToCheckoutButton);

		logger.info("User successfully clicked on Proceed to Checkout button");

	}

	@Then("User click on Place Your Order")

	public void userClickOnPlaceYourOrder() {

		waitTillPresence(factory.retailorderpage().placeYourOrderBtn);

		click(factory.retailorderpage().placeYourOrderBtn);

		logger.info("User successfully clicked on Place Your Order");

	}

	@Then("a message should be displayed 'Order Placed, Thanks'")

	public void aMessageShouldBeDisplayed() {

		waitTillPresence(factory.retailorderpage().orderPlacedSuccessMessage);

		Assert.assertEquals("Order Placed Successfully",

				factory.retailorderpage().orderPlacedSuccessMessage.getText().trim());

		logger.info("Order Placed Successfully");

	}

	@When("User click on Orders section")

	public void userClickOnOrdersSection() {

		waitTillPresence(factory.homePage().ordersOption);

		click(factory.homePage().ordersOption);

		logger.info("User successfully clicked on Orders option");

	}

	@When("User click on first order in list")

	public void userClickOnFirstOrderInList() {

		waitTillPresence(factory.retailorderpage().orderDetailList);

		click(factory.retailorderpage().orderDetailList);

	}

	@When("User click on Cancel The Order button")

	public void userClickOnCancelTheOrderButton() {

		waitTillPresence(factory.retailorderpage().cancelTheOrderButton);

		click(factory.retailorderpage().cancelTheOrderButton);

		logger.info("Cancel The Order button has clicked successfully");

	}

	@When("User select the cancelation Reason 'Bought wrong item'")

	public void userSelectTheCancelationReasonBoughtWrongItem() {

		Select select = new Select(factory.retailorderpage().cancelationReasonDropdown);

		select.selectByVisibleText("Bought wrong item");

	}

	@When("User click on Cancel Order button")

	public void userClickOnCancelOrderButton() {

		click(factory.retailorderpage().cancelOrderBtn);

		logger.info("User successfully clicked on Cancel Order button");

	}

	@Then("a cancelation message should be displayed 'Your Order Has Been Cancelled'")

	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {

		waitTillPresence(factory.retailorderpage().orderCancelationMessage);

		Assert.assertEquals("Your Order Has Been Cancelled",

				factory.retailorderpage().orderCancelationMessage.getText().trim());

		logger.info("Your Order Has Been Cancelled");

	}

	@When("User click on Return Items button")

	public void userClickOnReturnItemsButton() {

		waitTillPresence(factory.retailorderpage().returnItemsButton);

		click(factory.retailorderpage().returnItemsButton);

		logger.info("User Successfully clicked on Return Items button");

	}

	@When("User select the Return Reason 'Item damaged'")

	public void userSelectTheReturnReasonItemDamaged() {

		Select select = new Select(factory.retailorderpage().returnReasonDropdown);

		select.selectByVisibleText("Item damaged");

		logger.info("User successfully selected the Item damage option from dropdown");

	}

	@When("User select the drop off service 'FedEx'")

	public void userSelectTheDropOffServiceFedEx() {

		Select select = new Select(factory.retailorderpage().dropOffDropdown);

		select.selectByVisibleText("FedEx");

		logger.info("User successfully selected the FedEx option from dropdown");

	}

	@When("User click on Return Order button")

	public void userClickOnReturnOrderButton() {

		click(factory.retailorderpage().returnOrderBtn);

		logger.info("User successfully clicked on Return Order button");

	}

	@Then("a cancelation message should be displayed 'Return was successfull’")

	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {

		waitTillPresence(factory.retailorderpage().returnSuccessMessage);

		Assert.assertEquals("Return was successfull", factory.retailorderpage().returnSuccessMessage.getText().trim());

		logger.info("Return was successful");

	}

	@When("User click on Review button")

	public void userClickOnReviewButton() {

		waitTillPresence(factory.retailorderpage().reviewButton);

		click(factory.retailorderpage().reviewButton);

		logger.info("Review button has been clicked succesffuly");

	}

	@When("User write Review headline {string} and {string}")

	public void userWriteReviewHeadlineAnd(String headline, String reviewText) {

		waitTillPresence(factory.retailorderpage().headlineInputField);

		waitTillPresence(factory.retailorderpage().reviewTextInputField);

		sendText(factory.retailorderpage().headlineInputField, headline);

		sendText(factory.retailorderpage().reviewTextInputField, reviewText);

		logger.info("Headline and Review text has been entered successfully");

	}

	@When("User click Add your Review button")

	public void userClickAddYourReviewButton() {

		click(factory.retailorderpage().addYourReviewBtn);

		logger.info("Add Your Review button has been clicked successfully");

	}

	@Then("a review message should be displayed 'Your review was added successfully'")

	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {

		waitTillPresence(factory.retailorderpage().reviewAddedSuccessMessage);

		Assert.assertEquals("Your review was added successfully",

				factory.retailorderpage().reviewAddedSuccessMessage.getText().trim());

		logger.info("Your review was added successfully");

	}

}
