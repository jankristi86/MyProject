package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Constant;

public class LoginPage {

	public static final String URL = "http://localhost/izlet/index.php";
	private static final String USER_NAME = "//input[@placeholder='username']";
	private static final String PASSWORD = "//input[@placeholder='password']";
	private static final String LOGIN = "//input[@value='Log in']";

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

	// login button
	public static WebElement getLogIn(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOGIN));
		return wb;
	}

	public static void clickLogIn(WebDriver dr) {
		getLogIn(dr).click();
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
