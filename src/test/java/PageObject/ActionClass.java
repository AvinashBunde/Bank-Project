package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {
	
	WebDriver driver;
	public ActionClass(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="//input[@name='uid']")
	WebElement txtuserid;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement txtlogin;
	
	@FindBy(linkText="Balance Enquiry")
	WebElement txtbalenceequiry;
	
	@FindBy(xpath="//select[@name='accountno']")
	WebElement txtaccountnumber1;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement txtsubmit1;
	
	@FindBy(linkText="Mini Statement")
	WebElement txtministatement;
	
	@FindBy(xpath="//select[@name='accountno']")
	WebElement txtaccountnumber2;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement txtsubmit2;
	
	@FindBy(linkText="Contact Us")
	WebElement txtcontactus;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement txtname;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement txtmobilenumber;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement txtmessage;
	
	@FindBy(xpath="//input[@name='fileToUpload']")
	WebElement txtfile;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement txtsubmit3;
	
	@FindBy(linkText="Home")
	WebElement txthome;
	
	@FindBy(linkText="Log out")
	WebElement txtlogout;
	
	
	
	public void UserId() 
	{
		txtuserid.sendKeys("1303");
	}
	
	public void Password() 
	{
		txtpassword.sendKeys("Guru99");
	}
	
	public void Login() 
	{
		txtlogin.click();
	}
	
	public void BalenceEquiry() 
	{
		txtbalenceequiry.click();
	}
	
	public void AccountNumber1() 
	{
		Select a = new Select(txtaccountnumber1);
		a.selectByVisibleText("3309");
	}
	
	public void Submit1() 
	{
		txtsubmit1.click();
		driver.navigate().back();
	}
	
	public void MiniStatement() 
	{
		txtministatement.click();
	}
	
	public void AccountNumber2()
	{
       Select b = new Select(txtaccountnumber2);
       b.selectByVisibleText("3308");
	}
	
	public void Submit2() 
	{
		txtsubmit2.click();
		driver.navigate().back();
	}
	
	public void ContactUs() 
	{
		txtcontactus.click();
	}
	
	public void Name() 
	{
		txtname.sendKeys("julia");
	}
	
	public void Email() 
	{
		txtemail.sendKeys("juliaannew65@gmail.com");
	}
	
	public void MobileNumber() 
	{
		txtmobilenumber.sendKeys("5783475782");
	}

	public void Message() 
	{
		txtmessage.sendKeys("I want to veiw");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
	
	public void File() 
	{
		txtfile.sendKeys("C:\\Users\\avina\\OneDrive\\IMPORANCE FOR INTERVEIW\\Some of the important HR questions.pdf");
	}
	
	public void Submit3()
	{
		txtsubmit3.click();
	}
	
	public void Home() 
	{
		txthome.click();
	}
	
	public void Logout() 
	{
		txtlogout.click();
	}
	
}
