import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
  
  public static void main(String[] args) {
    
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    String text = "John";

    driver.findElement(By.id("name")).sendKeys(text);

    // Accept
    driver.findElement(By.id("alertbtn")).click();
    driver.switchTo().alert().accept();

    // Dismiss
    driver.findElement(By.id("confirmbtn")).click();
    driver.switchTo().alert().dismiss();
  }
}
