package main;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.Dashboard;
import page.objects.EditPage;
import page.objects.LoginPage;
import page.objects.PostPage;
import page.objects.RegPage;
import page.test.EditPageTest;
import page.test.LoginPageTest;
import page.test.PostPageTest;
import page.test.RegPageTest;

public class Main {

	public static void main(String[] args) throws Exception {

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		

		// register and login all users
		RegPage.openUrl(dr);
		//RegPageTest.RegisterOne(dr);
		RegPageTest.RegisterAll(dr);

		// login one user
		LoginPage.openUrl(dr);
		LoginPageTest.LogIn(dr, 1);

		// post all posts
		PostPageTest.PostAllPosts(dr);

		// edit one post at the line of "title", and delete two posts
		EditPageTest.deletePosts(dr, 2);
		EditPageTest.editPost(dr, 0, 4);

		PostPageTest.SinglePost(dr); //	<-- for posting manually true console
		RegPageTest.RegisterOne(dr); // <-- register one user true console
		LoginPageTest.LogInOne(dr); // <-- login one user true console*/

	}

}
