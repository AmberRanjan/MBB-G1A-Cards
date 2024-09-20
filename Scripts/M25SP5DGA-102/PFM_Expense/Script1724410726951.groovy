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

Mobile.comment("The Username is: testasb103")
Mobile.comment("The Password is: Maybank@1")

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-102/01_VerifyText - Quick Actions'), 'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7772024700112287605.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-102/02_TapOnExpenses'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-102/03_VerifyText- Expenses'), 'Expenses')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6315387130121506168.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-102/04_TapOnAddExpense'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-102/05_VerifyText - Set Category'), 'Set Category')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-102/06_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-102/03_VerifyText- Expenses'), 'Expenses')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6315387130121506168.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-102/04_TapOnAddExpense'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-102/05_VerifyText - Set Category'), 'Set Category')



