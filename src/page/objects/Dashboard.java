package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	public static final String URL = "http://localhost/izlet/dashboard.php";
	private static final String HAMBURGER = "fa-ellipsis-v";
	private static final String EDIT = "fa-edit";
	private static final String DELETE = "fa-trash-alt";
	private static final String LOGOUT = "//input[@id='blue_btn']";
////input[@id='blue_btn']
	////a[contains(text(),'Logout')]
	
	// hamburger btn
	public static WebElement getHamburgerBtn(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(HAMBURGER));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickHamburgerBtn(WebDriver dr, int i) {
		getHamburgerBtn(dr, i).click();
	}

	// edit btn
	public static WebElement getEditBtn(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(EDIT));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickEditBtn(WebDriver dr, int i) {
		getEditBtn(dr, i).click();
	}

	// delete btn
	public static WebElement getDeleteBtn(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(DELETE));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickDeleteBtn(WebDriver dr, int i) {
		getDeleteBtn(dr, i).click();
	}

	// logout btn
	public static WebElement getLogoutBtn(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOGOUT));
		return wb;
	}

	public static void clickLogoutBtn(WebDriver dr) {
		getLogoutBtn(dr).click();
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
