package page.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Dashboard;
import page.objects.LoginPage;
import page.objects.PostPage;
import utils.Constant;
import utils.ExcelUtils;

public class LoginPageTest {

	public static void LogIn(WebDriver dr, int i) throws Exception {

		// temporary data
		String data;

		// fetching excel data
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_DATA, Constant.SHEET1);

		// username
		data = ExcelUtils.getCellData(i, 2);
		LoginPage.clickUserName(dr);
		LoginPage.sendKeysUserName(dr, data);

		// password
		data = ExcelUtils.getCellData(i, 4);
		LoginPage.clickPassword(dr);
		LoginPage.sendKeysPassword(dr, data);

		// login
		LoginPage.clickLogIn(dr);
	}

	// login true console
	public static void LogInOne(WebDriver dr) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Unesite Vas username: ");
		String userName = sc.nextLine();
		LoginPage.clickUserName(dr);
		LoginPage.sendKeysUserName(dr, userName);

		System.out.println("Unesite Vasu sifru: ");
		String password = sc.nextLine();
		LoginPage.clickPassword(dr);
		LoginPage.sendKeysPassword(dr, password);

		LoginPage.clickLogIn(dr);
		sc.close();
	}

	// login all users from excel data
	public static void LogInAll(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_DATA, Constant.SHEET1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			LogIn(dr, i);
			if (dr.getCurrentUrl().contentEquals(PostPage.URL)) {
				Dashboard.clickLogoutBtn(dr);
			} else {
				PostPage.navigateTo(dr);
			}

		}
	}
}
