package Home;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AmazonHomePage {

    @BeforeMethod
    public void setUp(){
        ChromeDriver driver = new ChromeDriver("Webdriver.chrome.driver""C:\\Users\\chma6\\Links\\SeleniumMaven2021\\driver\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }
   /* @AfterMethod
    public void cleanUp(){
        driver.close();*/
    }

