package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BaseTest {

    WebDriver driver;
    WebElement fieldName;
    WebElement fieldMail;
    WebElement fieldAddy;
    WebElement fieldPermAddy;
    WebElement fullText;
    WebElement button;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFieldName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getFieldMail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getFieldAddy() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getFieldPermAddy() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getButton() {
        return driver.findElement(By.id("submit"));
    }
    public WebElement getFullText() {
        return driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12")); //???
    }
    //------------

    public void inputName(String name) {
        getFieldName().clear();
        getFieldName().sendKeys(name);
    }

    public void inputMail (String mail) {
        getFieldMail().clear();
        getFieldMail().sendKeys(mail);
    }

    public void inputAdd (String add) {
        getFieldAddy().clear();
        getFieldAddy().sendKeys(add);
    }

    public void inputPermaAdd (String permAdd) {
        getFieldPermAddy().clear();
        getFieldPermAddy().sendKeys(permAdd);
    }

    public void clickButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        getButton().click();
    }

    public String scrap() {
        return getFullText().getText();
    }



}
