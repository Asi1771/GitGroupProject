package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePage {

   @FindBy(id = "some_id")
    public WebElement homePage;
}
