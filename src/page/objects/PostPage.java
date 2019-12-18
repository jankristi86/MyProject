package page.objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;


public class PostPage {

	public static final String URL = "http://localhost/izlet/dashboard.php";
	private static final String MAKE_POST = "//a[contains(text(),'Make a post')]";
	private static final String TITLE = "//input[@placeholder='Naziv']";
	private static final String LOCATION = "//input[@placeholder='Lokacija']";
	private static final String DROP_BTN = "//div[@class='popupPost']//select[@name='transport']";
	private static final String TEXT_AREA = "//textarea[@placeholder='Opis']";
	private static final String PUBLISH_BTN = "//div[@class='popupPost']//input[@value='Post']";
	private static final String CLOSE = "//div[@id='close2']//i[@class='fas fa-times']";

	// make a post btn
	public static WebElement getMakePost(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(MAKE_POST));
		return wb;
	}

	public static void clickMakePost(WebDriver dr) {
		getMakePost(dr).click();
	}

	// title area
	public static WebElement getTitle(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(TITLE));
		return wb;
	}

	public static void clickTitle(WebDriver dr) {
		getTitle(dr).click();
	}

	public static void sendKeysTitle(WebDriver dr, String str) {
		getTitle(dr).clear();
		getTitle(dr).sendKeys(str);
	}

	// location field area
	public static WebElement getLocation(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOCATION));
		return wb;
	}

	public static void clickLocation(WebDriver dr) {
		getLocation(dr).click();
	}

	public static void sendKeysLocation(WebDriver dr, String str) {
		getLocation(dr).clear();
		getLocation(dr).sendKeys(str);
	}

	// drop down field
	public static void selectDropBtn(WebDriver dr, String str) {
		Select transport = new Select(dr.findElement(By.xpath(DROP_BTN)));
		transport.selectByVisibleText(str);
	}

	// text area field
	public static WebElement getTextArea(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(TEXT_AREA));
		return wb;
	}

	public static void clickTextArea(WebDriver dr) {
		getTextArea(dr).click();
	}

	public static void sendKeysTextArea(WebDriver dr, String str) {
		getTextArea(dr).clear();
		getTextArea(dr).sendKeys(str);
	}

	// post button
	public static WebElement getPublishBtn(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(PUBLISH_BTN));
		return wb;
	}

	public static void clickPublishBtn(WebDriver dr) {
		getPublishBtn(dr).click();
	}

	// close btn - in case we want to quit posting in the middle of posting
	public static WebElement getCloseBtn(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(CLOSE));
		return wb;
	}

	public static void clickCloseBtn(WebDriver dr) {
		getCloseBtn(dr).click();
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
