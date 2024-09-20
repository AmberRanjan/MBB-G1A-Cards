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

'Verify text present in the toastbar for TAC'
Mobile.verifyElementText(findTestObject('Object Repository/TAC/01_VerifyText - Secure2u is currently unavailable. TAC will be used instead'),
	'Secure2u is currently unavailable. TAC will be used instead.')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot221800534313236791.png')
Mobile.takeScreenshot()

//Mobile.delay(4)
//Mobile.verifyElementText(findTestObject('Object Repository/TAC/02_OTP - Your Otp no. is 098308'), 'Your Otp no. is 098308')


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


