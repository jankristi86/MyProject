package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Constant;

public class RegPage {
	public static final String URL = "http://localhost/izlet/index.php";
	private static final String FIRST_NAME = "//input[@name='firstname']";
	private static final String LAST_NAME = "//input[@name='lastname']";
	private static final String USER_NAME = "//form[@action='processregister.php']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	private static final String REGISTER = "//input[@id='blue_btn']";

	// first name
	public static WebElement getFirstName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(FIRST_NAME));
		return wb;
	}

	public static void clickFirstName(WebDriver dr) {
		getFirstName(dr).click();
	}

	public static void sendKeysFirstName(WebDriver dr, String str) {
		getFirstName(dr).clear();
		getFirstName(dr).sendKeys(str);
	}

	// last name
	public static WebElement getLastName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LAST_NAME));
		return wb;
	}

	public static void clickLastName(WebDriver dr) {
		getLastName(dr).click();
	}

	public static void sendKeysLastName(WebDriver dr, String str) {
		getLastName(dr).clear();
		getLastName(dr).sendKeys(str);
	}

	// user name
	public static WebElement getUserName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(USER_NAME));
		return wb;
	}

	public static void clickUserName(WebDriver dr) {
		getUserName(dr).click();
	}

	public static void sendKeysUserName(WebDriver dr, String str) {
		getUserName(dr).clear();
		getUserName(dr).sendKeys(str);
	}

	// email
	public static WebElement getEmail(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(EMAIL));
		return wb;
	}

	public static void clickEmail(WebDriver dr) {
		getEmail(dr).click();
	}

	public static void sendKeysEmail(WebDriver dr, String str) {
		getEmail(dr).clear();
		getEmail(dr).sendKeys(str);
	}

	// password
	public static WebElement getPassword(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(PASSWORD));
		return wb;
	}

	public static void clickPassword(WebDriver dr) {
		getPassword(dr).click();
	}

	public static void sendKeysPassword(WebDriver dr, String str) {
		getPassword(dr).clear();
		getPassword(dr).sendKeys(str);
	}

	// register button
	public static WebElement getRegister(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(REGISTER));
		return wb;
	}

	public static void clickRegister(WebDriver dr) {
		getRegister(dr).click();
	}

	// open url
	public static void openUrl(WebDriver dr) {
		dr.get(URL);
	}

	// navigate to
	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(URL);
	}

}
