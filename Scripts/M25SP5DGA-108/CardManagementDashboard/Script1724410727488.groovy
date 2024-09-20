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

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3194863455953028532.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-108/01_UserTapOnBackArrow'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/02_VerifyElementText - CARDS'), 'CARDS')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2834942189952612186.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-108/03_TapOnG1ACard - Maybank MasterCard Global Access World Debit Card'),
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2834942189952612186.png')
Mobile.takeScreenshot()

def cardNo = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-108/GetTextForCard -    1215'), 0)

String str = "*"

if(cardNo.contains(str)) {
	print ("Card number is redacted")
}

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/07- Block Card'), 'Block Card')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/08 - Overseas Debit'), 'Overseas Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/09 - E-Commerce Activation'), 'E-Commerce Activation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/10 - Change Card PIN'), 'Change Card PIN')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/11 - Card ReplacementRenewal'), 'Card Replacement/Renewal')

Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-108/14_BlockCardToggle'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-108/15_OverseasDebitToggle'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-108/16_EcommerceToggle'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-108/17_ChangeCardPinArrow'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-108/18_CardReplacementArrow'), 0)

Mobile.swipe(0, 300, 0, 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/12- Purchase Limit'), 'Purchase Limit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-108/13- Contactless Limit'), 'Contactless Limit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2448607666262318882.png')

Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-108/19_PurchaseLimitArrow'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-108/20_ContactlessLimitArrow'), 0)

Mobile.scrollToText('Maybank')

Mobile.takeScreenshot()
