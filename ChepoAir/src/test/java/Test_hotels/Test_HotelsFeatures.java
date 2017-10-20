package Test_hotels;

import HomePage.CheckHomePage;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_HotelsFeatures extends CommonAPI {

    @Test
    public void HotelFeatures()throws InterruptedException{
        CheckHomePage checkHomePage = PageFactory.initElements(driver,CheckHomePage.class);
        checkHomePage.HotelFeatures();
    }
}
