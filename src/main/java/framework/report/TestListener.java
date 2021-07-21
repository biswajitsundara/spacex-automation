package framework.report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * This is a testNG listener which will capture the pass/fail status
 * @author Biswajit Sundara
 * @date 21/07/2021
 *
 */
public class TestListener implements ITestListener{

	static String workingDir = System.getProperty("user.dir");
	static ExtentReports report = new ExtentReports(workingDir+"\\Report.html",true);
	ExtentTest test;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
		test = report.startTest(result.getMethod().getMethodName(), "Automation Test");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		 test.log(LogStatus.PASS, "Test passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.FAIL, "Test Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		test.log(LogStatus.FAIL, "Test Failed");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		report.endTest(test);
		report.flush();
	}

	
}
