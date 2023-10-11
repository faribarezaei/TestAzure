import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonSite {

    @Test
    public void openAmazonAndSearchUmbrella() {
       
        WebDriverManager.edgedriver().setup();

  
        WebDriver driver = new EdgeDriver();

   
        driver.get("https://www.amazon.ca");

       
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("umbrella");

       
        WebElement searchIcon = driver.findElement(By.id("nav-search-submit-button"));
        searchIcon.click();

      
        driver.quit();
        //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
    }
}
