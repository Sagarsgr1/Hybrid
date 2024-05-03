package Generic_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.swaglabs.pomclasses.Loginpage;

public class Baseclass {
	public PropertyFileUtility pu=new PropertyFileUtility();
	public ExcelFileUtility eu=new ExcelFileUtility();
	public JavaUtility ju=new JavaUtility();
	public WebDriverUtility wu=new WebDriverUtility();
	public WebDriver driver=null;//for runtime polymorphism
	@BeforeSuite
	public void bsconfig() {
		System.out.println("====DB CONNECTION=====");
	}
	@AfterSuite
	public void  asconfig() {
		System.out.println("====DB DISCONNECTION==== ");
	}
	@BeforeClass
	public void bcconfig() throws Throwable {
		String BROWSER = pu.readDataFromPropertyFile("browser");
		String URL = pu.readDataFromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("Edge driver is Launched");
		}
		else if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("chrome driver is Launched");
		}
		else 
		{
			System.out.println("Invalid browser name");
		}
		driver.get(URL);
		wu.getScreenshot(driver, "Loginpage");
		wu.MaximBrowserwindow(driver);
		wu.waitforpageLoad(driver);
	}
	@AfterClass
	public void terDown() {
		driver.quit();
	}
	@BeforeMethod
	public void bmconfig() throws Throwable {
		String UN = pu.readDataFromPropertyFile("un");
		String PWD = pu.readDataFromPropertyFile("pwd");
		
	Loginpage lp=new Loginpage(driver);
	lp.loginToApp(UN, PWD);
	wu.getScreenshot(driver,"Homepage");

	}

	@AfterMethod
	public void amconfig() {
		System.out.println("Logout from app");
	}
}
