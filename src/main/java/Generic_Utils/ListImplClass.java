package Generic_Utils;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListImplClass implements ITestListener{

	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getMethod().getMethodName());
		System.out.println("-- execution starts from here --");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+"-- executed successfully --");
		Reporter.log(methodName+"-- executed successfully --",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
//		TakesScreenshot ts = (TakesScreenshot) ;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setDocumentTitle("VTiger");
		
		report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("OS", "windows-10");
		report.setSystemInfo("Base_browser", "Chrome");
		report.setSystemInfo("Base_URL", "http://localhost:8888");
		report.setSystemInfo("Reporter_name", "Vijayalaxmi");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	
}
