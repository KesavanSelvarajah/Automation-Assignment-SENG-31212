package com.test.qa.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.qa.pageobjects.pages.ABTestPage;
import com.test.qa.pageobjects.pages.CheckBoxPage;
import com.test.qa.pageobjects.pages.DropDownPage;
import com.test.qa.pageobjects.pages.ForgotPasswordPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.LoginSecurePage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.testdata.UserDetailsDataProvider;
import com.test.qa.utils.TestBase;

/**
 * UiAutomationTrainingBasicTest.java - class to execute Tests Created by
 * SrirankanK on 10/3/2018.
 */
public class UiAutomationTrainingBasicTest extends TestBase {



	/**
	 * Verify Login Valid Scenario
	 */
	@Test(groups = "test", priority = 6)
	public void testVerifyLogin() {
        // Verify HomePage is displayed
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        // Click Login Link
		HomePage.clickLink(Constants.LOGIN_LINK);
		// Verify Login Page Displayed
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Page is not Displayed");
        // Set Username and Password
		LoginPage.setUsernamePassword(Constants.USER_NAME, Constants.PASSWORD);
        // Click Submit
		LoginPage.clickSubmit();
        // Verify Login Secure Page Displayed
		softAssert.assertTrue(LoginSecurePage.isLoginSecurePageDisplayed(),"Login Secure Page is not Displayed");
        // Verify Login Alert Displayed
		softAssert.assertTrue(LoginSecurePage.isAlertDisplayed(),"Login Alert is not Displayed");
        // Verify Login  Alert Message
		softAssert.assertTrue(LoginSecurePage.getAlertContent().contains(Constants.LOGIN_SUCCESS_MSG),"Login Alert Message is incorrect");
        // Click Logout
		LoginSecurePage.clickLogout();
        // Verify Login Page Displayed
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Page is not Displayed");
        // Verify Logout Alert Displayed
		softAssert.assertTrue(LoginPage.isAlertDisplayed(),"Logout Alert is not Displayed");
        // Verify Logout  Alert Message
		softAssert.assertTrue(LoginPage.getAlertContent().contains(Constants.LOGOUT_SUCCESS_MSG),"Logout Message is incorrect");

		softAssert.assertAll();

	}

	/**
	 * Verify Login Invalid Scenario
	 */
	@Test(groups = { "test", "regression"}, priority = 7, dataProvider = "MultipleUserDetails", dataProviderClass = UserDetailsDataProvider.class)
	public void testInvalidLogin(String username, String password) {
		// Verify HomePage is displayed
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
		// Click Login Link
		HomePage.clickLink(Constants.LOGIN_LINK);
		// Verify Login Page Displayed
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Page is not Displayed");
		// Set Invalid Username and Password
		LoginPage.setUsernamePassword(username, password);
		// Click Submit
		LoginPage.clickSubmit();
        // Verify Login Alert Displayed
		softAssert.assertTrue(LoginPage.isAlertDisplayed(),"Login Error Alert is not Displayed");
		// Verify Login  Alert Message
		softAssert.assertTrue(LoginPage.getAlertContent().contains(Constants.LOGIN_INVALID_MSG),"Login Error Message is incorrect");

		softAssert.assertAll();
	}
}
