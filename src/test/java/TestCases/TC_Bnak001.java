package TestCases;

import org.testng.annotations.Test;

import PageObject.ActionClass;
import Utilities.BankProject.BaseClass;

public class TC_Bnak001 extends BaseClass{
	@Test
	public void Bank() throws InterruptedException {
		ActionClass obj1 = new ActionClass(driver);
		obj1.UserId();
		Thread.sleep(2000);
		obj1.Password();
		Thread.sleep(2000);
		obj1.Login();
		Thread.sleep(2000);
		obj1.BalenceEquiry();
		Thread.sleep(2000);
		obj1.AccountNumber1();
		Thread.sleep(2000);
		obj1.Submit1();
		Thread.sleep(4000);
		obj1.MiniStatement();
		Thread.sleep(2000);
		obj1.AccountNumber2();
		Thread.sleep(2000);
		obj1.Submit2();
		Thread.sleep(2000);
		obj1.ContactUs();
		Thread.sleep(2000);
		obj1.Name();
		Thread.sleep(2000);
		obj1.Email();
		Thread.sleep(2000);
		obj1.MobileNumber();
		Thread.sleep(2000);
		obj1.Message();
		Thread.sleep(2000);
		obj1.File();
		Thread.sleep(2000);
		obj1.Submit3();
		Thread.sleep(2000);
		obj1.Home();
		Thread.sleep(2000);
		obj1.Logout();
		Thread.sleep(2000);


	}

}
