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

'Verify user is on Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/01_VerifyText- Card Management'), 'Card Management')

'Take screenshot for the card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1827338944528091541.png')

Mobile.takeScreenshot()

'Verify the Card Replacement/Renewal menu'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/02_VerifyText - Card ReplacementRenewal'), 'Card Replacement/Renewal')

'User taps on Card Replacement/Renewal menu'
Mobile.tap(findTestObject('Object Repository/CardReplacement/03_TapOn - Card ReplacementRenewal'), 0)

Mobile.delay(6)

'Verify screen once user navigated to Card Replacement/Renewal'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/04_VerifyElementText - ReplaceRenew Maybank MasterCard Global Access World Debit Card'), 
    'Replace/Renew Maybank MasterCard Global Access World Debit Card')

'Take screenshot for the card replacement renewal screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7340220913795444071.png')

Mobile.takeScreenshot()

'User taps on back button'
Mobile.tap(findTestObject('Object Repository/CardReplacement/05_TapOnBackButton'), 0)

'Verify screen once navigated back to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/01_VerifyText- Card Management'), 'Card Management')

'Take screenshot once user navigates back to Card Management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1827338944528091541.png')

Mobile.takeScreenshot()

'User tap on card Replacement/Renewal menu again'
Mobile.tap(findTestObject('Object Repository/CardReplacement/03_TapOn - Card ReplacementRenewal'), 0)

Mobile.delay(6)

'Verify screen once user navigated to Card Replacement/Renewal'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/04_VerifyElementText - ReplaceRenew Maybank MasterCard Global Access World Debit Card'), 
    'Replace/Renew Maybank MasterCard Global Access World Debit Card')

'Take screenshot for the card replacement renewal screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7340220913795444071.png')

Mobile.takeScreenshot()

'Hide Keyboard'
Mobile.hideKeyboard()

Mobile.delay(3)

'Tap on i icon'
Mobile.tap(findTestObject('Object Repository/CardReplacement/06_TapOn_i_Icon'), 0)
Mobile.tap(findTestObject('Object Repository/CardReplacement/06_TapOn_i_Icon'), 0)

'Verify header for the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/07_VerifyText - Address Line 1'), 'Address Line 1')

'Verify text present in the pop up body'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/08_VerifyPopUpBodyText - Please ensure that the mailing address entered is accurate. The use of P.O. boxes is not permitted'), 
    'Please ensure that the mailing address entered is accurate. The use of P.O. boxes is not permitted.')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3171241322286019733.png')
Mobile.takeScreenshot()
'Tap on close icon'
Mobile.tap(findTestObject('Object Repository/CardReplacement/09_UserTapOnCloseIcon'), 0)

Mobile.delay(2)

'Verify once pop-up is closed'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/10_VerifyText - Address Line 1'), 'Address Line 1')

'Set Address Line 1'
Mobile.setText(findTestObject('Object Repository/CardReplacement/11_SetAdd1 - LINE 1'), 'AddLine1', 0)

Mobile.delay(2)

'Set Address Line 2'
Mobile.setText(findTestObject('Object Repository/CardReplacement/12_SetAdd- LINE 2'), 'AddLine2', 0)

Mobile.delay(2)

'Hide Keyboard'
Mobile.hideKeyboard()

'Take screenshot of the filled details'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3171241322286019733.png')
Mobile.takeScreenshot()

'User tap on state dropdown'
Mobile.tap(findTestObject('Object Repository/CardReplacement/13_TapOnStateDropdown'), 0)
Mobile.tap(findTestObject('Object Repository/CardReplacement/13_TapOnStateDropdown'), 0)

'Verify the dropdown is launched'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/14_VerifyText - WP KUALA LUMPUR'), 'WP KUALA LUMPUR')

'Take screenshot of the dropdown'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3171241322286019733.png')
Mobile.takeScreenshot()

'User taps on cancel'
Mobile.tap(findTestObject('Object Repository/CardReplacement/15_TapOnCancel - Cancel'), 0)

'User tap on state dropdown'
Mobile.tap(findTestObject('Object Repository/CardReplacement/13_TapOnStateDropdown'), 0)

'Verify the dropdown is launched'
Mobile.verifyElementText(findTestObject('Object Repository/CardReplacement/14_VerifyText - WP KUALA LUMPUR'), 'WP KUALA LUMPUR')

'Take screenshot of the dropdown'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3171241322286019733.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/CardReplacement/16_TapOnDone'), 0)

'Take screenshot of the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3171241322286019733.png')
Mobile.takeScreenshot()

Mobile.delay(2)

'Swipe the screen below'
Mobile.swipe(0, 300, 0, 0)

'User taps on Radio button for terms and conditions'
Mobile.tap(findTestObject('Object Repository/CardReplacement/17_UserTapsOnRadioButton'), 0)

'Take screenshot after selecting radio button'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot439177891935236367.png')

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/CardReplacement/18_UserTapsOnContinue'), 0)











