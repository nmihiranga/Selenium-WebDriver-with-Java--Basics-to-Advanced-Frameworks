import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {
  
  public static void main(String[] args) throws InterruptedException {
    
    WebDriver driver = new ChromeDriver();
    //WebDriver driver = new EdgeDriver();
    //WebDriver driver = new FirefoxDriver();

    driver.manage().window().maximize();

    String name = "Wick";

    String password = getPassword(driver);

    driver.get("https://rahulshettyacademy.com/locatorspractice/");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.findElement(By.id("inputUsername")).sendKeys(name);
    driver.findElement(By.name("inputPassword")).sendKeys(password);
    driver.findElement(By.className("signInBtn")).click();

    Thread.sleep(2000);
    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
    Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");

    driver.findElement(By.xpath("//*[text()='Log Out']")).click();
    driver.close();
  }

  public static String getPassword(WebDriver driver) throws InterruptedException {

    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    String pwdText = driver.findElement(By.cssSelector("form p")).getText();
    // Please use temporary password 'rahulshettyacademy' to Login.

    String[] pwdArray = pwdText.split("'");
    // 0 index - Please use temporary password
    // 1 index - rahulshettyacademy' to Login.

    String password = pwdArray[1].split("'")[0];
    // 0 index - rahulshettyacademy
    // 1 index -  to Login.

    return password;
  }
}
