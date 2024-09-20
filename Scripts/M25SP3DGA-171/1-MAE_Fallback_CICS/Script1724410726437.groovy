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

'Verify Global Access Account-i is visible'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/05_Verify_GAA_Text - Global Access Account-i'), 
    'Global Access Account-i')

'Verify if the Account number is visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/M25SP5DGA-171/06_VerifyAccNoVisible - 9000 0001 7559'), 0)

'Verify the amount is Present on the G1A tile'
Mobile.verifyElementVisible(findTestObject('Object Repository/M25SP5DGA-171/07_VerifyAmountVisible- RM 13,057.29'), 0)

'User tap on Global Access Account-i'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/08_UserTapOn - Global Access Account-i'), 0)

'Verify screen once user navigated inside GAA'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/09_VerifyText - Accounts'), 'Accounts')

'Take screenshot once the user navigate inside Accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3013957433880442789.png')

'Verify Total Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/10_VerifyCurrentBalance - RM 13,057.29'), 0)

'Verify the balance is sdisplayed correctly in the MYR tile'
Mobile.verifyElementVisible(findTestObject('Object Repository/M25SP5DGA-171/11_VerifyMYRtileBalance - MYR 13,057.29'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'), 
    'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')

//-----------------------------------------------------------Add USD-----------------------------------------------------------------------------------------

'Tap on Add Currency'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/18_TapOn - Add currency'), 0)

'Verify user is on Add Currency Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/19_VerifyText - Add Currency'), 'Add Currency')

'Take screenshot for the Add currency screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot123146207249025735.png')

'User Taps on USD'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/20_UserTapsOn - USD - US Dollar'), 0)

'Toastbar stating USD successfully added gets displayed'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/21_ToastAlert - Youve successfully added USD'), 
    'You\'ve successfully added USD.')

'User navigated back to Your currency screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/22_UserNavigatedTo - Your Currencies'), 'Your Currencies')

'Takes screenshot for the Accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7504184009058669421.png')

'Verify USD FYC amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/23.1_VerifyUSDAmt - USD 0.00'), 0)

'Verify MYR for the FYC'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/24_VerifyMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'), 
    'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')

'Swipe the screen Horizontally'
Mobile.swipe(554, 1270, 200, 0)

//-----------------------------------------------------------------------Add GBP---------------------------------------------------------------------------

'Tap on Add Currency'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/18_TapOn - Add currency'), 0)

'Verify user is on Add Currency Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/19_VerifyText - Add Currency'), 'Add Currency')

'Take screenshot for the Add currency screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot123146207249025735.png')

'User Taps on GBP'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/25_TapOnGBP - GBP - British Pound Sterling'), 0)

'Toastbar stating USD successfully added gets displayed'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/26_VerifyTextSuccessToastbar - Youve successfully added GBP'), 
    'You\'ve successfully added GBP.')

'User navigated back to Your currency screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/22_UserNavigatedTo - Your Currencies'), 'Your Currencies')

'Takes screenshot for the Accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7504184009058669421.png')

'Verify USD FYC amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/23.1_VerifyUSDAmt - USD 0.00'), 0)

'Verify MYR for the FYC'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/24_VerifyMYRvalue-  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')

'Swipe the screen Horizontally'
Mobile.swipe(554, 1270, 200, 0)

//---------------------------------------------------------------------