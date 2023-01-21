package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class DashboradPage {
public DashboradPage() {
	PageFactory.initElements(Driver.getDriver(), this);
}

   @FindBy (xpath = "//span[text()='Amount Due']")
    public WebElement amountDueText;
   
   @FindBy (xpath = "//a[contains(text(), 'Customers')]")
   public WebElement Customers;
   

   @FindBy (xpath = "//a[contains(text(), 'Items')]")
	public WebElement commonPageItemsLink;





}
