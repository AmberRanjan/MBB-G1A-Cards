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

'Verify the G1A tile in the accounts list'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/02_Navigate_Inside_G1A/04_VerifyG1ATile - Global Access Account-i'), 
    'Global Access Account-i')

'Tap on G1A Tile'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/02_Navigate_Inside_G1A/05_TapOnG1A - Global Access Account-i'), 
    0)

'Verify once user navigated to G1A Account details'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/02_Navigate_Inside_G1A/06_VerifyCard- Global Access Account-i'), 
    'Global Access Account-i')

'Screenshot once user is inside G1A account'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4985531571481350161.png')
Mobile.takeScreenshot()
