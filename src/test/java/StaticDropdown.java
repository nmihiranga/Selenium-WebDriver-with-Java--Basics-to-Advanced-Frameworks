import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {
  
  public static void main(String[] args) {
    
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

    // If the tagname is Select then it is a Static dropdown
    Select dropdown = new Select(staticDropdown);

    // select by ID
    dropdown.selectByIndex(3);
    Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "USD");

    // select by Visible text
    dropdown.selectByVisibleText("AED");
    Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "AED");

    // select by Value attribute
    dropdown.selectByValue("INR");
    Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "INR");
  }
}
