package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditPage {

	private static final String TITLE = "//input[@id='title']";
	private static final String LOCATION = "//input[@id='location']";
	private static final String DROP_BTN = "//select[@id='transport']";
	private static final String TEXT_AREA = "//textarea[@id='description']";
	private static final String PUBLISH_BTN = "//div[@class='popupEdit']//input[@value='Post']";

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

}
