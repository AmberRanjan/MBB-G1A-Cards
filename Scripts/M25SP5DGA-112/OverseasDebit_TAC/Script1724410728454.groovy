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

WebUI.callTestCase(findTestCase('AppVersion/AppVersion'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Verify user is on Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/01_UserOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8888572485234762783.png')

Mobile.takeScreenshot()

'Verify the Overseas debit module'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/02_VerifyList- Overseas Debit'), 'Overseas Debit')

'Verify the text present below Overseas debit menu'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/03_VerifyText - Enable your foreign currency spend and overseas ATM withdrawals'),
	'Enable your foreign currency spend and overseas ATM withdrawals')

'Tap on Overseas debit menu'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/04_TapOn- Overseas Debit'), 0)

'Verify the screen once user redirected to overseas debit screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

'Take screenshot for the overseas debit screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.takeScreenshot()

'Verify the start date'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/06_VerifyText - Start Date'), 'Start Date')

'User tap on Enter start date'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/07TapOn- Enter start date'), 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7175177134931168031.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/14_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/07TapOn- Enter start date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7175177134931168031.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/08_TapOnMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1313454608465721249.png')

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/13_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/15_Verify Text - End Date'), 'End Date')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot898145141276045888.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/16UserTapsOnEndDate - Enter end date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5774500733089938403.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/14_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/13_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/18_UserTapsOnContinue'), 0)

'System reads the pin'
Mobile.getText(findTestObject('Object Repository/TAC/02_OTP - Your Otp no. is 098308'), 0)

//Storing the pin inside a variable
def otpText = Mobile.getText(findTestObject('Object Repository/TAC/02_OTP - Your Otp no. is 098308'), 0)

//Applying the read pin from keyboard
otpText = otpText.replace('Your Otp no. is ', '')

def otpArr = otpText.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr.length; i++) {
	if ((otpArr[i]) == '1') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
	} else if ((otpArr[i]) == '2') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
	} else if ((otpArr[i]) == '3') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
	} else if ((otpArr[i]) == '4') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
	} else if ((otpArr[i]) == '5') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
	} else if ((otpArr[i]) == '6') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
	} else if ((otpArr[i]) == '7') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
	} else if ((otpArr[i]) == '8') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
	} else if ((otpArr[i]) == '9') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
	} else if ((otpArr[i]) == '0') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
	}
}

'Screenshot for the screen when user entered pin for create pin screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/08_Entered PIN for the app')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/55_TapOnCheck'), 0)

'Verify the decision screen stating the successful Activation'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/26_DecisionScreenActivated - Overseas debit successfully activated'),
	'Overseas debit successfully activated.')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/27_VerifyText - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/28_VerifyText - Date  time'), 'Date & time')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1536436965365505856.png')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/29_TapOnDone'), 0)

'User lands on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/01_VerifyText - Card Management'), 'Card Management')

'Take screenshot for the card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3636999969979690980.png')

Mobile.takeScreenshot()


