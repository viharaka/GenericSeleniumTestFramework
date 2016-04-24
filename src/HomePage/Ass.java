import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

class Demo
{
	final static Logger logger = Logger.getLogger(A.class);
	public static void main(String[] args) {
		System.out.println(logger);
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " );
		}
		logger.warn("This is warn : ");
		logger.error("This is error : ");
		logger.fatal("This is fatal : ");
		WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");
        driver.quit();

		System.out.println("ssfsefs");	
	}
}
