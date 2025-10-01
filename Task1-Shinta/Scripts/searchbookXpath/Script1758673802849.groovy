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

WebUI.openBrowser('https://automationbookstore.dev/')

//WebUI.delay(7)
WebUI.verifyElementVisible(findTestObject('SelectBook/booklist'), FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('SelectBook/searchbook'), 'java')

//Parameterized Object
WebUI.verifyElementVisible(findTestObject('SelectBook/bookimg', [('imgSearch') : 'pid5_thumb']))

WebUI.verifyElementVisible(findTestObject('SelectBook/bookimg', [('imgSearch') : 'pid6_thumb']))

WebUI.verifyElementVisible(findTestObject('SelectBook/bookimg', [('imgSearch') : 'pid7_thumb']))

//xpath last() method
WebUI.setText(findTestObject('SelectBook/searchbook'), 'BDD')

WebUI.verifyElementVisible(findTestObject('SelectBook/booklastli'))

//xpath contains
WebUI.setText(findTestObject('SelectBook/searchbook'), 'Test Automation')

WebUI.verifyElementVisible(findTestObject('SelectBook/bookcontains'))

//buku tidak tersedia 
WebUI.setText(findTestObject('SelectBook/searchbook'), 'JDK')

//WebUI.verifyElementNotVisible(findTestObject('SelectBook/booklist'), 5)
WebUI.waitForElementNotPresent(findTestObject('SelectBook/booklist'), 3)

////xpath start with
WebUI.setText(findTestObject('SelectBook/searchbook'), 'Agile')

WebUI.verifyElementVisible(findTestObject('SelectBook/bookstart'))

//getindex
WebUI.setText(findTestObject('SelectBook/searchbook'), 'google')

WebUI.verifyElementVisible(findTestObject('SelectBook/bookgetindex'))

//
//child
WebUI.setText(findTestObject('SelectBook/searchbook'), 'selenium')

WebUI.verifyElementVisible(findTestObject('SelectBook/bookchild'))

WebUI.closeBrowser()

