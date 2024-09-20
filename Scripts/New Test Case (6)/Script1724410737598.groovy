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

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/31_TapUSDTile - USD 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/32_VerifyUSDTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/33_TapGBPTile - GBP 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/34_VerifyGBPTileMYR- MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/35_TapEURapEURTile - EUR 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/36_VerifyEURTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/37_TapAUDTile - AUD 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/38_VerifyAUDTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/39_TapJPYTile - JPY 0'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/40_VerifyJPYTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/41_TapSGD- SGD 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/42_VerifySGDTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/43_TapAEDTile - AED 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/44_TapAEDTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/45_TapBNDTile - BND 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/46_VerifyBNDTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/47_TapCADTile - CAD 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/48_VerifyCADTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/49_TapCHFTile - CHF 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/50VerifyCHFTimeMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/51_TapDKKTile - DKK 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/52_VerifyDKKTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/53_TapHKDTile - HKD 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/54_VerifyHKDTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/55_TapNOKTile- NOK 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/56_VerifyNOKTileMYR- MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/57_TapOnNZDTile - NZD 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/58_VerifyNZDTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/59_TapQARTile - QAR 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/60_VerifyQARTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/61_TapSARTile - SAR 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/62_VerifySARTileMYR- MYR 0.00'), '≈MYR 0.00')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/63_TapSEKTile - SEK 0.00'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/64_VerifyTextSEKTileMYR - MYR 0.00'), '≈MYR 0.00')

Mobile.closeApplication()

