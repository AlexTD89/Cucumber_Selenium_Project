package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage {

    @FindBy(className = "input-widget")
    public WebElement pageCount;


    public ContactsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //only finds one email, it does not help in finding others. we cannot use this. (When We have a table with multiple emails)
//    @FindBy (xpath = "//*[contains(text(), 'mbrackstone9@example.com’) and @data-column-label=‘Email’]")
//    public WebElement email;

    public WebElement getContactEmail(String email){
        String xpath = "//*[contains(text(), '"+email+"') and @data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }



}
