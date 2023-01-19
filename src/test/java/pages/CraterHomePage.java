package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterHomePage {

	public CraterHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath =("//input[@name = 'email']"))
	public WebElement firstTextBoxName;
	
	@FindBy(xpath =("//div[contains(text() ,'Email')]"))
	public WebElement firstFieldTextTitle;
	
	@FindBy(xpath =("//input[@name = 'password']"))
	public WebElement secondTextBoxName;
	
	@FindBy(xpath =("//div[contains(text() ,'Password')]"))
	public WebElement secondFieldTextTitle;
	@FindBy(css =".block")
	public WebElement Craterlogo;
	
	@FindBy (linkText = "Forgot Password?")
	public WebElement ForgotPasswordLink;
	
	@FindBy(xpath =("//button[@class='inline-flex whitespace-nowrap items-center border font-medium "
			+ "focus:outline-none focus:ring-2 focus:ring-offset-2 px-4 py-2 text-sm "
			+ "leading-5 rounded-md border-transparent shadow-sm text-white bg-primary-600 hover:bg-primary-700 focus:ring-primary-500']"))
	public WebElement loginButton;
	
	@FindBy (xpath = "//p[contains(text(), 'Copyright @')]")
	public WebElement copyRightText;
	
	@FindBy (xpath = "//h1[contains(text(), 'Simple Invoicing')]")
	public WebElement headerText;
	
	@FindBy (xpath = "//p[contains(text(), 'Crater helps you track')]")
	public WebElement underHeaderText;
	
	
	@FindBy (xpath = "//div[@name ='email']/input")
	public WebElement useremail;
	
	@FindBy (xpath = "//div[@name ='password']/input")
	public WebElement password;
	
	@FindBy (xpath = "//button[text()='Login']")
	public WebElement loginButtonlabel;
	
	@FindBy (xpath = "//p[contains(text(), 'These credentials do not match our records.')]")
	public WebElement invalidUserErrorMessage;
	
	
	
	
	
	
	
	
	
	

}
