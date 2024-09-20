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

'Lunch Application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify user is on Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/01_VerifyElementText - Card Management'), 'Card Management')

'Take screenshot of the card Management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981422395934138400.png')

Mobile.takeScreenshot()

'Verify the Card Replacement/Renewal menu'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/02_VerifyElementText_Module- Card ReplacementRenewal'), 
    'Card Replacement/Renewal')

'User Taps on Card Replacement/Renewal'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/03_UserTapsOn - Card ReplacementRenewal'), 0)

Mobile.delay(5)


'Verify the pop-up '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/04_VerifyElementText - Card ReplacementRenewal'), 
    'Card Replacement/Renewal')

'Verifuy the pop-up text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/VerifyRenewAmount- Please note that you will be charged with RM 12.00 for the card replacementrenewal fee. Click continue if you agree to proceed'), 
    'Please note that you will be charged with RM 12.00 for the card replacement/renewal fee. Click continue if you agree to proceed.')

'User taps on cross icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/37_UserTapOnCloseIcon'), 0)

'Verify user is navigated back to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/01_VerifyElementText - Card Management'), 'Card Management')

'Take screenshot of the card Management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981422395934138400.png')

Mobile.takeScreenshot()

'User Taps on Card Replacement/Renewal'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/03_UserTapsOn - Card ReplacementRenewal'), 0)

Mobile.delay(5)

'Verify the pop-up '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/04_VerifyElementText - Card ReplacementRenewal'),
	'Card Replacement/Renewal')

'User taps on cancel button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/38_UserTapOnCancel'), 0)

'Verify user is navigated back to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/01_VerifyElementText - Card Management'), 'Card Management')

'Take screenshot of the card Management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981422395934138400.png')

Mobile.takeScreenshot()

'User Taps on Card Replacement/Renewal'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/03_UserTapsOn - Card ReplacementRenewal'), 0)

Mobile.delay(5)

'Verify the pop-up '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/04_VerifyElementText - Card ReplacementRenewal'),
	'Card Replacement/Renewal')

'User taps on continue button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/39_UserTapOnContinue'), 0)


'Verify if user redirected to the address form successfully'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/12_VerifyElement - ReplaceRenew Maybank MasterCard Global Access World Debit Card'), 
    'Replace/Renew Maybank MasterCard Global Access World Debit Card')

'Hide Keyboard'
Mobile.hideKeyboard()

'Verify text requesting for the address'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/13_VerifyElementText - Where do you want us to deliver your card'), 
    'Where do you want us to deliver your card?')

'Verify Address Line 1 header'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/14_VerifyElementText - Address Line 1'), 'Address Line 1')

Mobile.delay(3)

'Tap on "i" button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/15.1_UserTapOn_i_Icon'), 0)

'Verify text present in the "i" pop up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/16_VerifyElementText - Please ensure that the mailing address entered is accurate. The use of P.O. boxes is not permitted'), 
    'Please ensure that the mailing address entered is accurate. The use of P.O. boxes is not permitted.')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3386172015849461908.png')

Mobile.takeScreenshot()

'Tap on Close button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/17_UserTapsOnCloseButton'), 0)
Mobile.delay(2)

/*'Clear text for Add Line 1'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-114/16.1_ClearAdd1Text - LINE 1'), 0)
Mobile.delay(2)*/

'Set Text for Address Line 1'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114.1/08_SetText - LINE 1'), 'Address Line 1', 0)

Mobile.delay(2)

/*'Clear text for Add Line 2'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-114/17.1_ClearAdd2Text - LINE 2'), 0)

Mobile.delay(2)

'Clear Text for City'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-114/18.1_ClearCityText'), 0)

Mobile.delay(2)*/

'Set Text for Street name'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114.1/09_SetText - LINE 2'), 'Address Line 2', 0)

Mobile.delay(2)

'Set Text for City'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/20_CityNameSet'), 'Kuala Lumpur', 0)

Mobile.delay(2)

'Hide Keyboard'
Mobile.hideKeyboard()

Mobile.delay(2)

'Tap on State dropdown'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/stateDropdown'), 0)

'Select Kuala Lumpur'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/22_SetKualaLumpur - WP KUALA LUMPUR'), 0)

'Take screenshot of dropdown'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3387560337901007479.png')

Mobile.takeScreenshot()

'Tap on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/23_TapOnDone'), 0)

Mobile.delay(2)

//'Set PostCode '
//Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/24_SetPostCode'), '00001', 0)

'swipe down'
Mobile.swipe(0, 300, 0, 0)

'Selects Terms radio button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/25_TapOnTermsRadioButton'), 0)

'Take screensbhot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1965691438582709916.png')

Mobile.takeScreenshot()

'User Taps on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/26_UserTapsOnContinueButton'), 0)

//-----------------------------------------------------------------------------------Reject-----------------------------------------------------------------------------

'Verify user is on Secure2U Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/27_VerifyText - Card ReplacementRenewal'), 'Card Replacement/Renewal')

'Take screensbhot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1965691438582709916.png')

'Verify S2U Authorization'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/28_VerifytextinS2U - Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify Address'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/29_VerifyAddress - Address'), 'Address:')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/30VerifyDate - Date  time'), 'Date & time')

'User TapsOnReject'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/31_UserTapOnReject'), 0)

'User navigates to decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/32_DesisionScreen - Card replacementrenewal unsuccessful'), 
    'Card replacement/renewal unsuccessful.')

'Verify Text stating the failure of Renewwal application'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/33_VerifyText - Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/34_Verify - Reference ID'), 'Reference ID')

'Verify DateTime'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/35_VerifyDateTime - Date  time'), 'Date & time')

'Take decision screen screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5806326266094312167.png')

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/36_UserTapOnDone'), 0)

//-----------------------------------------------------------------------------Expire-------------------------------------------------------------------------

'User Taps on Card Replacement/Renewal'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/03_UserTapsOn - Card ReplacementRenewal'), 0)

Mobile.delay(5)

'Verify the pop-up '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/04_VerifyElementText - Card ReplacementRenewal'),
	'Card Replacement/Renewal')

'Verifuy the pop-up text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/VerifyRenewAmount- Please note that you will be charged with RM 12.00 for the card replacementrenewal fee. Click continue if you agree to proceed'), 
    'Please note that you will be charged with RM 12.00 for the card replacement/renewal fee. Click continue if you agree to proceed.')

'User taps on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/39_UserTapOnContinue'), 0)


'Verify if user redirected to the address form successfully'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/12_VerifyElement - ReplaceRenew Maybank MasterCard Global Access World Debit Card'),
	'Replace/Renew Maybank MasterCard Global Access World Debit Card')

'Hide Keyboard'
Mobile.hideKeyboard()

'Verify text requesting for the address'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/13_VerifyElementText - Where do you want us to deliver your card'),
	'Where do you want us to deliver your card?')

'Clear text for Add Line 1'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-114/16.1_ClearAdd1Text - LINE 1'), 0)

'Set Text for Address Line 1'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/18_AddressLine1Set'), 'This is Address Line 1', 0)

'Clear text for Add Line 2'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-114/17.1_ClearAdd2Text - LINE 2'), 0)

'Clear Text for City'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-114/18.1_ClearCityText'), 0)

'Set Text for Street name'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/19_StreetNameSet'), 'This is Street Name', 0)

'Set Text for City'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/20_CityNameSet'), 'Kuala Lumpur', 0)

'Hide Keyboard'
Mobile.hideKeyboard()

'Tap on State dropdown'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/stateDropdown'), 0)

'Select Kuala Lumpur'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/22_SetKualaLumpur - WP KUALA LUMPUR'), 0)

'Take screenshot of dropdown'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3387560337901007479.png')

Mobile.takeScreenshot()

'Tap on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/23_TapOnDone'), 0)

'Set PostCode '
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/24_SetPostCode'), '00001', 0)

'swipe down'
Mobile.swipe(0, 300, 0, 0)

'Selects Terms radio button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/25_TapOnTermsRadioButton'), 0)

'Take screensbhot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1965691438582709916.png')

Mobile.takeScreenshot()

'User Taps on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/26_UserTapsOnContinueButton'), 0)

'Verify user is on Secure2U Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/27_VerifyText - Card ReplacementRenewal'), 'Card Replacement/Renewal')

'Take screensbhot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1965691438582709916.png')

'Verify S2U Authorization'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/28_VerifytextinS2U - Secure2u authorisation'),
	'Secure2u authorisation')

'Verify Address'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/29_VerifyAddress - Address'), 'Address:')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/30VerifyDate - Date  time'), 'Date & time')

'Delay screen for 50 seconds to let Secure 2 u Expire'
Mobile.delay(50)

'User navigates to decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/32_DesisionScreen - Card replacementrenewal unsuccessful'),
	'Card replacement/renewal unsuccessful.')

'Verify Text stating the failure of Renewwal application'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/33_VerifyText - Your Secure Verification authorisation was rejected'),
	'Your Secure Verification authorisation was rejected.')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/34_Verify - Reference ID'), 'Reference ID')

'Verify DateTime'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/35_VerifyDateTime - Date  time'), 'Date & time')

'Take decision screen screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5806326266094312167.png')

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/36_UserTapOnDone'), 0)

//----------------------------------------------------------------------------Approve---------------------------------------------------------------------------
