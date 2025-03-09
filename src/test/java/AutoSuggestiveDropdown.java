import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;

public class AutoSuggestiveDropdown {
  
  public static void main(String[] args) throws InterruptedException {
    
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    driver.findElement(By.id("autosuggest")).sendKeys("Aus");
    Thread.sleep(3000);
    List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

    for(WebElement option :options) {
      if(option.getText().equalsIgnoreCase("Austria")) {
        option.click();
        break;
      }
    }
  }
}
