import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.maybank2u.life.uat')

String creditCardNumber = "*** **** **** 1215"

// Validate if the credit card number contains asterisks and only the last four digits are visible
boolean isValid = creditCardNumber.matches("Object Repository/M25SP5DGA-108/04_VerifyCardName - Maybank MasterCard Global Access World Debit Card")

//def debitNum = Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/04_VerifyCardName - Maybank MasterCard Global Access World Debit Card'),   'Maybank MasterCard Global Access World Debit Card')

if (isValid) {
	println("Credit card number is in the expected format.")
} else {
	println("Credit card number does not match the expected format.")
}

//def expDate = Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/06_ExpiryDate - Valid Thru 1030'), 'Valid Thru 10/30')


