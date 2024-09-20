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

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/01_VerifyElementText - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981422395934138400.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/02_VerifyElementText_Module- Card ReplacementRenewal'),
	'Card Replacement/Renewal')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/03_UserTapsOn - Card ReplacementRenewal'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/04_VerifyElementText - Card ReplacementRenewal'),
	'Card Replacement/Renewal')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/05_VerifyElementText_PopUp_Body - Please note that you will be charged with RM0.00 for the card replacementrenewal fee. Click continue if you agree to proceed'),
	'Please note that you will be charged with RM0.00 for the card replacement/renewal fee. Click continue if you agree to proceed.')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/06_UserTapsOnCloseIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/01_VerifyElementText - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981422395934138400.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/02_VerifyElementText_Module- Card ReplacementRenewal'),
	'Card Replacement/Renewal')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/03_UserTapsOn - Card ReplacementRenewal'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/04_VerifyElementText - Card ReplacementRenewal'),
	'Card Replacement/Renewal')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/05_VerifyElementText_PopUp_Body - Please note that you will be charged with RM0.00 for the card replacementrenewal fee. Click continue if you agree to proceed'),
	'Please note that you will be charged with RM0.00 for the card replacement/renewal fee. Click continue if you agree to proceed.')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/07_UserTapsOn_ContinueButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/08_VerifyElementText - Insufficient Balance'),
	'Insufficient Balance')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/09_VerifyElementText - Looks like you dont have enough balance to apply for a MAE card. RM0.00 is required for MAE card application. Please top up your MAE account to proceed'),
	'Looks like you don\'t have enough balance to apply for a MAE card. RM0.00 is required for MAE card application. Please top up your MAE account to proceed.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1261415747717172181.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/06_UserTapsOnCloseIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/01_VerifyElementText - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981422395934138400.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/02_VerifyElementText_Module- Card ReplacementRenewal'),
	'Card Replacement/Renewal')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/03_UserTapsOn - Card ReplacementRenewal'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/04_VerifyElementText - Card ReplacementRenewal'),
	'Card Replacement/Renewal')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/05_VerifyElementText_PopUp_Body - Please note that you will be charged with RM0.00 for the card replacementrenewal fee. Click continue if you agree to proceed'),
	'Please note that you will be charged with RM0.00 for the card replacement/renewal fee. Click continue if you agree to proceed.')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/07_UserTapsOn_ContinueButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/08_VerifyElementText - Insufficient Balance'),
	'Insufficient Balance')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/09_VerifyElementText - Looks like you dont have enough balance to apply for a MAE card. RM0.00 is required for MAE card application. Please top up your MAE account to proceed'),
	'Looks like you don\'t have enough balance to apply for a MAE card. RM0.00 is required for MAE card application. Please top up your MAE account to proceed.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1261415747717172181.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/10_UserTapOn_TopUp_Now'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4318155142553340018.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/11_UserReceivesErrorMessage - Invalid customer account number. Please try again'),
	'Invalid customer account number. Please try again.')

