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

'Launch Application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify user is navigated to dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/01_VerifyTextDashboard - Quick Actions'), 'Quick Actions')

'Take screenshot of the dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3681443419436131440.png')

'Tao on the Accounts from the footer'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/02_TapOnAccounts'), 0)

'Verify user is on the Accounts screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/03_VerifyText- ACCOUNTS'), 'ACCOUNTS')

'Take screenshot of the Accounts'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2278992190105423702.png')

Mobile.takeScreenshot()

'Tap on the Cards tab'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/39_TapOn - CARDS'), 0)

'Verify user is navigated to Cards'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/01_UserOn - CARDS'), 'CARDS')

'Take screenshot once user is navigated to Cards'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot328892508546459756.png')

Mobile.takeScreenshot()

'Verify Card Name'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/02.1_VerifyText - Maybank Global Access Mastercard World Debit Card'), 
    'Maybank Global Access Mastercard World Debit Card')

'Verify Card status'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/03_VerifyActivateNowText - Activate Now'), 'Activate Now')

'User Tap on Maybank Debit Card'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/03.1_TapOn- Maybank Global Access Mastercard World Debit Card'), 
    0)

'User Navigated to STP card activation flow stream'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/05_VerifyText - Verify Card'), 'Verify Card')

'Verify text requesting for card last 8 digit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/06_VerifyText - Enter your cards last 8 digits'), 
    'Enter your card\'s last 8 digits')

'Verify Text persent on the STP flow'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/07_VerifyText - Make sure youve received your physical card before activating it'), 
    'Make sure you\'ve received your physical card before activating it.')

'Take screenshot'
Mobile.takeScreenshot()

