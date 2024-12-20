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
import java.time.*
import java.util.concurrent.ThreadLocalRandom;

//String baseDir = System.getProperty('user.dir')
//
//def uncheckOrCheckList(int kcuPertama) {
//	WebUI.scrollToElement(findTestObject('Object Repository/CMS/event_kanwil/Page_Edit Event Kanwil KCU/span_KCU_body',['kanwil':kcuPertama.toString()]),0)
//	int noKcu = ThreadLocalRandom.current().nextInt(1, 7)
//	for(def i =0; i<noKcu; i++) {
//		int randomUncheck = ThreadLocalRandom.current().nextInt(1, 7) + kcuPertama
//				WebUI.click(findTestObject('Object Repository/CMS/event_kanwil/Page_Edit Event Kanwil KCU/span_KCU_body',['kanwil':randomUncheck.toString()]))
//	}
//}
//int[] kcuIndex = [1,12,25,38,51,62,72,83,94,107,117,125,136]
//randomNum = ThreadLocalRandom.current().nextInt(1, 7);
//			for(def j = 1;j<13;j++) {
//				uncheckOrCheckList(kcuIndex[j-1])
//			}
try {
	WebUI.click(findTestObject('Object Repository/CMS/Page_Master Event/Page_Master Event/day',['day':'day','index':7]))	
}catch(e) {
	WebUI.click(findTestObject('Object Repository/CMS/Page_Master Event/Page_Master Event/day',['day':'active day','index':7]))
}