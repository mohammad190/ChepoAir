package common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

   public  static WebDriver driver = null;

   private static String url ="https://www.cheapoair.com/";


   @Parameters({"browserName","url","os"})
   @BeforeMethod
   public  void setUP(){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\sujon\\IdeaProjects\\ChepoAirautomation\\Generic\\driver\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
       driver.navigate().to(url);
       driver.manage().window().maximize();
   }
   @AfterMethod
    public void tearDown(){
       driver.close();
   }

}
