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

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114.1/01_VerifyText - ReplaceRenew Maybank MasterCard Global Access World Debit Card'), 
    'Replace/Renew Maybank MasterCard Global Access World Debit Card')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114.1/02_VerifyTextHeader - Where do you want us to deliver your card'), 
    'Where do you want us to deliver your card?')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6837053634159082137.png')

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114.1/03_VerifyText - Address Line 1'), 'Address Line 1')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114.1/04_VerifyText - Address Line 2'), 'Address Line 2')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114.1/05_verifyText- City'), 'City')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114.1/06_VerifyText - State'), 'State')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114.1/07_VerifyText - Postcode'), 'Postcode')

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114.1/08_SetText - LINE 1'), 'Address Line 1', 0)

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114.1/09_SetText - LINE 2'), 'Address Line 2', 0)



