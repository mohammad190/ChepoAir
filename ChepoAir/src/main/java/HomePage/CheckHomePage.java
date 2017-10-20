package HomePage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckHomePage extends CommonAPI {

    @FindBy(how = How.LINK_TEXT,using = "Hotels")
    public static WebElement Go_Hotels;

    public static void HotelFeatures()throws InterruptedException{
        Go_Hotels.click();
    }
}
