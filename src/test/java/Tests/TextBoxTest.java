package Tests;

import Base.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void test() {
        String target = "Name:Tikvica\n" +
                "Email:asd@asd.com\n" +
                "Current Address :basta\n" +
                "Permananet Address :basta";
        textBoxPage.inputName("Tikvica");
        textBoxPage.inputMail("asd@asd.com");
        textBoxPage.inputAdd("basta");
        textBoxPage.inputPermaAdd("basta");
        textBoxPage.clickButton();
        Assert.assertEquals(textBoxPage.scrap(), target);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

