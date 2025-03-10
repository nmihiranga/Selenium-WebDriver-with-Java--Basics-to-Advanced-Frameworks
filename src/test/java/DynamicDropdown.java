import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicDropdown {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    
    //  //a[@value='MAA']
    //  //a[@value='BLR']
    
    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    driver.findElement(By.xpath("//a[@value='BLR']")).click();
    Thread.sleep(2000);
    
    //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
    
    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

  }  
}