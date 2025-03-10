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

    //TestNG Assertions
    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

    System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

    System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
    System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
    System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

    if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
      System.out.println("its enabled");
      Assert.assertTrue(true);
    } else {
      Assert.assertTrue(false);
    }
    
  }
}
