package page.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import page.objects.*;
import utils.Constant;
import utils.ExcelUtils;

public class EditPageTest {

	// Edit post with excel data. Post from the position of "i", and content from
	// excel data at the line of "j"
	public static void editPost(WebDriver dr, int i, int j) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_DATA, Constant.SHEET2);

		Dashboard.clickHamburgerBtn(dr, i);
		Dashboard.clickEditBtn(dr, i);

		data = ExcelUtils.getCellData(j, 0);
		EditPage.getTitle(dr);
		EditPage.sendKeysTitle(dr, data);

		// update edited line
		EditPage.clickPublishBtn(dr);

	}

	// edit post which is found at line of "i"
	public static void editPostScan(WebDriver dr, int i) {
		Scanner sc = new Scanner(System.in);
		Dashboard.clickHamburgerBtn(dr, i);
		Dashboard.clickEditBtn(dr, i);

		// input content that we want to edit at line "title"
		System.out.println("Unesite naziv: ");
		String title = sc.nextLine();
		EditPage.getTitle(dr);
		EditPage.sendKeysTitle(dr, title);

		// update edited content
		EditPage.clickPublishBtn(dr);
		sc.close();

	}

	// delete one post, for the value of "i"
	public static void deletePost(WebDriver dr, int i) throws Exception {
		Dashboard.clickHamburgerBtn(dr, i);
		Thread.sleep(500);
		Dashboard.clickDeleteBtn(dr, i);
	}

	// delete more posts, for the value of "j"
	public static void deletePosts(WebDriver dr, int j) throws Exception {
		for (int i = 0, k = 0; k < j; k++) {
			deletePost(dr, i);
		}
	}

}
