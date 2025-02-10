import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
  
  public static void main(String[] args) {
    
    WebDriver driver = new ChromeDriver();

    driver.get("https://rahulshettyacademy.com/locatorspractice/");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
    driver.findElement(By.name("inputPassword")).sendKeys("123");
    driver.findElement(By.className("signInBtn")).click();
    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    driver.findElement(By.linkText("Forgot your password?")).click();
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Test");
    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("testmail@temptami.com");
    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("fyviji3641@temptami.com");
  }
}