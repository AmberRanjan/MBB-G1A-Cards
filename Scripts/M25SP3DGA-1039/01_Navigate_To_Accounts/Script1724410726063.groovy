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

'Verify User is On Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/01_NavigateToAccounts/01_UserOnDashboard - Quick Actions'), 
    'Quick Actions')

'Take Screenshot once user is on Dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4785035054050553831.png')
Mobile.takeScreenshot()

'User tap on Accounts from the footer'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/01_NavigateToAccounts/02_UserTapOnAccounts'), 0)

'Verify once the user navigated to Accounts screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/01_NavigateToAccounts/03_UserNavigatedToAcc - ACCOUNTS'), 
    'ACCOUNTS')

'Take Screenshot once user is on Accounts Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4785035054050553831.png')
Mobile.takeScreenshot()

