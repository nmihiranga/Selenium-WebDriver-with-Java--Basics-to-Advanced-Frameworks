import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {
  
  public static void main(String[] args) throws InterruptedException {
    
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    // From
    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    driver.findElement(By.xpath("//a[@value='DEL']")).click();
    Thread.sleep(2000);

    // To
    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

    // Depart Date
    driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

    // Is Return Date Disabled
    if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
      System.out.println("its enabled");
      Assert.assertTrue(false);
    } else {
      Assert.assertTrue(true);
    }

    // Senior Citizen Checkbox
    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

    // Passengers
    driver.findElement(By.id("divpaxinfo")).click();
    Thread.sleep(2000);
    
    for(int i=0; i<4; i++){
      driver.findElement(By.id("hrefIncAdt")).click();
    }

    driver.findElement(By.id("btnclosepaxoption")).click();

    // Currency
    WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
    Select dropdown = new Select(staticDropdown);
    dropdown.selectByIndex(3);

    // Search
    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    
  }
}
