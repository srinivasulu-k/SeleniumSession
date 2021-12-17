import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumOne {
    public static WebDriver driver = null;

    public static void main(String []args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://qualitestgroup.com/");
        driver.manage().window().maximize();

        String pageTitle= driver.getTitle();

        System.out.println("Page title is: " + pageTitle);

            Thread.sleep(3000);
        WebElement searchIcon = driver.findElement(By.id("search_toggle"));
        searchIcon.click();

            Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.id("search_input"));
        searchBox.sendKeys("About");

            Thread.sleep(3000);
        WebElement searchButton = driver.findElement(By.id("search_button"));
        searchButton.click();

            Thread.sleep(3000);
        WebElement searchResult = driver.findElement(By.xpath("//*[@id=\"et_builder_outer_content\"]/div[1]/div/div[1]/p[1]/a"));
        searchResult.click();

    }
}
