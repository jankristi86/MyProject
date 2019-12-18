package page.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.*;
import utils.Constant;
import utils.ExcelUtils;

public class PostPageTest {

	public static void PostPage(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_DATA, Constant.SHEET2);

		// click make a post
		PostPage.clickMakePost(dr);

		// title field
		data = ExcelUtils.getCellData(i, 0);
		PostPage.clickTitle(dr);
		PostPage.sendKeysTitle(dr, data);

		// location field
		data = ExcelUtils.getCellData(i, 1);
		PostPage.clickLocation(dr);
		PostPage.sendKeysLocation(dr, data);

		// in case we want to click x button and give up from posting
		// PostPage.clickCloseBtn(dr);

		// dropdown - transport field
		data = ExcelUtils.getCellData(i, 2);
		PostPage.selectDropBtn(dr, data);

		// text area
		data = ExcelUtils.getCellData(i, 3);
		PostPage.clickTextArea(dr);
		PostPage.sendKeysTextArea(dr, data);

		// post btn
		PostPage.clickPublishBtn(dr);

	}

	// post true console
	public static void SinglePost(WebDriver dr) {
		Scanner sc = new Scanner(System.in);

		PostPage.clickMakePost(dr);

		System.out.println("Unesite naziv objave: ");
		String title = sc.nextLine();
		PostPage.clickTitle(dr);
		PostPage.sendKeysTitle(dr, title);

		System.out.println("Unesite lokaciju: ");
		String location = sc.nextLine();
		PostPage.clickLocation(dr);
		PostPage.sendKeysLocation(dr, location);

		System.out.println("Unesite transportno sredstvo: ");
		String dropdown = sc.nextLine();
		PostPage.selectDropBtn(dr, dropdown);

		System.out.println("Unesite objavu: ");
		String text = sc.nextLine();
		PostPage.clickTextArea(dr);
		PostPage.sendKeysTextArea(dr, text);

		PostPage.clickPublishBtn(dr);
		sc.close();
		
		System.out.println("Uspesno ste postavili objavu!");

	}

	// post all posts from excel data
	public static void PostAllPosts(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_DATA, Constant.SHEET2);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			PostPage(dr, i);

		}
	}

}