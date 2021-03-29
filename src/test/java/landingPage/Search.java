package landingPage;

import Home.AmazonHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Search extends AmazonHomePage {
    @Test
    public void search() throws InterruptedException {
        RemoteWebDriver driver = null;
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
        Thread.sleep(2000);
    }
}
