package page.test;

import org.openqa.selenium.WebDriver;

import utils.Constant;
import utils.ExcelUtils;
import java.util.Scanner;
import page.objects.*;

public class RegPageTest {

	public static void Register(WebDriver dr, int i) throws Exception {

		// temporary data
		String data;

		// fetching excel data
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_DATA, Constant.SHEET1);

		// firstname field
		data = ExcelUtils.getCellData(i, 0);
		RegPage.clickFirstName(dr);
		RegPage.sendKeysFirstName(dr, data);

		// lastname field
		data = ExcelUtils.getCellData(i, 1);
		RegPage.clickLastName(dr);
		RegPage.sendKeysLastName(dr, data);

		// username field
		data = ExcelUtils.getCellData(i, 2);
		RegPage.clickUserName(dr);
		RegPage.sendKeysUserName(dr, data);

		// email field
		data = ExcelUtils.getCellData(i, 3);
		RegPage.clickEmail(dr);
		RegPage.sendKeysEmail(dr, data);

		// pass field
		data = ExcelUtils.getCellData(i, 4);
		RegPage.clickPassword(dr);
		RegPage.sendKeysPassword(dr, data);

		// register button
		RegPage.clickRegister(dr);

	}

	// register user true console
	public static void RegisterOne(WebDriver dr) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite Vase ime: ");
		String firstName = sc.nextLine();
		RegPage.clickFirstName(dr);
		RegPage.sendKeysFirstName(dr, firstName);

		System.out.println("Unesite Vase prezime: ");
		String lastName = sc.nextLine();
		RegPage.clickLastName(dr);
		RegPage.sendKeysLastName(dr, lastName);

		System.out.println("Unesite Vas user name: ");
		String userName = sc.nextLine();
		RegPage.clickUserName(dr);
		RegPage.sendKeysUserName(dr, userName);

		System.out.println("Unesite Vas e-mail: ");
		String email = sc.nextLine();
		RegPage.clickEmail(dr);
		RegPage.sendKeysEmail(dr, email);

		System.out.println("Unesite Vasu sifru: ");
		String password = sc.nextLine();
		RegPage.clickPassword(dr);
		RegPage.sendKeysPassword(dr, password);

		RegPage.clickRegister(dr);
		sc.close();

	}

	// register all users from excel data
	public static void RegisterAll(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_DATA, Constant.SHEET1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			Register(dr, i);
			LoginPageTest.LogIn(dr, i);
			Dashboard.clickLogoutBtn(dr);

		}
	}

}
