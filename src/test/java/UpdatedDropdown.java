import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropdown {
  
  public static void main(String[] args) throws InterruptedException {
    
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    driver.findElement(By.id("divpaxinfo")).click();
    Thread.sleep(2000);
    
    for(int i=0; i<4; i++){
      driver.findElement(By.id("hrefIncAdt")).click();
    }

    driver.findElement(By.id("btnclosepaxoption")).click();
    
  }
}
