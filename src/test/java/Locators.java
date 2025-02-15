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
    //Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Test");
    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("testmail@temptami.com");
    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("fyviji3641@temptami.com");
    driver.findElement(By.xpath("//form/input[3]")).sendKeys("+11754827283");
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    System.out.println(driver.findElement(By.cssSelector("form p")).getText());

    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
    //driver.findElement(By.id("chkboxOne")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
}