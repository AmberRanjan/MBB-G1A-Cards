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

'Launch Application and validate the version'
WebUI.callTestCase(findTestCase('AppVersion/AppVersion'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Validate user is on slide 1'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/01_Slide1- Your enhanced experienceis here'), 
    'Your enhanced experience\nis here')

'Take screenshot for Slide 1'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7182245211511939628.png')
Mobile.takeScreenshot()

'Tap on Next'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/02_TapNext'), 0)

'Validate user is on slide 2'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/03_Slide2 - Your Maybank accounts at a glance'), 
    'Your Maybank accounts at a glance')

'Take screenshot for Slide 2'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1715686475623257584.png')
Mobile.takeScreenshot()

'Tap on Next'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/02_TapNext'), 0)

'Validate user is on slide 3'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/04_Slide3 - Pay  transfer on the go'), 
    'Pay & transfer on the go')

'Take screenshot for slide 3'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3093977246328873104.png')
Mobile.takeScreenshot()

'Tap on Next'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/02_TapNext'), 0)

'Validate user is on slide 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/05_Slide5 - Customise your Quick Actions'), 
    'Customise your Quick Actions')

'Take screenshot for slide 3'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6293648693998549515.png')
Mobile.takeScreenshot()

'Tap on Got it'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/06_TapOnGotIt'), 0)

'Terms and Condition pop-up is displayed'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/07_VerifyText - Terms  Conditions'), 
    'Terms & Conditions')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot837550167147142184.png')
Mobile.takeScreenshot()

'Tap on Agree'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/08_TapOnAgree'), 0)

'Verify user navigated to the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/001_PreDashboard/09_VerifyText - Quick Actions'), 
    'Quick Actions')

'Take screenshot of the dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5990609123811098225.png')
Mobile.takeScreenshot()
