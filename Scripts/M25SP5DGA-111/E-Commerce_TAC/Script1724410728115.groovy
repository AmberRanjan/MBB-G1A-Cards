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

'User is on Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot for the card manegement screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4384473632079081717.png')

Mobile.takeScreenshot()

'VerifyElementText for the G1A card'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/29_VerifyCardText - Maybank Global Access Mastercard World Debit Card'),
	'Maybank Global Access Mastercard World Debit Card')

'Verify Ecommerce Activation menu'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/01_VerifyText - E-Commerce Activation'), 'E-Commerce Activation')

'Verify the tagline present below Ecommerce Activation'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/02.1_VerifyText - Enable your online transactions'),
	'Enable your online transactions')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot221800534313236791.png')
Mobile.takeScreenshot()

'Tap on toggle switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0) 

Mobile.delay(6)

'Verify text present in the toastbar for TAC'
Mobile.verifyElementText(findTestObject('Object Repository/TAC/01_VerifyText - Secure2u is currently unavailable. TAC will be used instead'),
	'Secure2u is currently unavailable. TAC will be used instead.')

Mobile.delay(6)

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

'Verify Decision screen text stating E commerce successfully activated'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07.1_VerifyText - E-commerce successfully activated'),
	'E-commerce successfully activated')

'Verify Date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/08_Reference - Reference ID'), 'Reference ID')
Mobile.takeScreenshot()

'Tap on Done on the decision screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12.1_TapOnDone'), 0)

'Verify user is navigated to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.takeScreenshot()

'VerifyElementText for the G1A card'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/29_VerifyCardText - Maybank Global Access Mastercard World Debit Card'),
	'Maybank Global Access Mastercard World Debit Card')

'Verify Ecommerce Activation menu'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/01_VerifyText - E-Commerce Activation'), 'E-Commerce Activation')

'Verify the tagline present below Ecommerce Activation'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/02.1_VerifyText - Enable your online transactions'),
	'Enable your online transactions')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot221800534313236791.png')
Mobile.takeScreenshot()

Mobile.delay(165)

'Tap on the toggle switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify Text stating De-activate E commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify text confirming if user is sure to deactivate Ecommenrce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'),
	'Are you sure you want to deactivate e-commerce?')
Mobile.takeScreenshot()

'User taps on cross icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/18_TapOnCrossIcon'), 0)

'User lands on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')
Mobile.takeScreenshot()

'User taps on Toggle switch again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify text stating deactivate E-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify text confirming if user is sure to deactivate e-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'),
	'Are you sure you want to deactivate e-commerce?')
Mobile.takeScreenshot()
'User taps on Cancel'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/19_UserTapsOnCancel'), 0)

'User lands on Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')
Mobile.takeScreenshot()
'Tap on toggle switch again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify text stating deactivate E-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify text confirming if user is sure to deactivate e-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'),
	'Are you sure you want to deactivate e-commerce?')

'User taps on Deactivate button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/20_UserTapsOnDeactivateButton'), 0)

/*
 * 'Verify text present in the toastbar for TAC'
 * Mobile.verifyElementText(findTestObject('Object Repository/TAC/01_VerifyText
 * - Secure2u is currently unavailable. TAC will be used instead'), 'Secure2u is
 * currently unavailable. TAC will be used instead.')
 */
Mobile.delay(6)

//Storing the pin inside a variable
def otpText2 = Mobile.getText(findTestObject('Object Repository/TAC/02_OTP - Your Otp no. is 098308'), 0)

//Applying the read pin from keyboard
otpText2 = otpText2.replace('Your Otp no. is ', '')

def otpArr2 = otpText2.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr.length; i++) {
	if ((otpArr2[i]) == '1') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
	} else if ((otpArr2[i]) == '2') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
	} else if ((otpArr2[i]) == '3') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
	} else if ((otpArr2[i]) == '4') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
	} else if ((otpArr2[i]) == '5') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
	} else if ((otpArr2[i]) == '6') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
	} else if ((otpArr2[i]) == '7') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
	} else if ((otpArr2[i]) == '8') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
	} else if ((otpArr2[i]) == '9') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
	} else if ((otpArr2[i]) == '0') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
	}
}

'Screenshot for the screen when user entered pin for create pin screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/08_Entered PIN for the app')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/55_TapOnCheck'), 0)

'Verify successful text on the decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/26_DecisionScreen - E-commerce successfully deactivated'),
	'E-commerce successfully deactivated')

'Verify Reference ID text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/27_VerifyText - Reference ID'), 'Reference ID')

'Verify date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/28_VerifyText- Date  time'), 'Date & time')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8128159577518447456.png')
Mobile.takeScreenshot()
'Tap on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12.1_TapOnDone'), 0)

'User navigated to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot for the Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8128159577518447456.png')

Mobile.takeScreenshot()
















