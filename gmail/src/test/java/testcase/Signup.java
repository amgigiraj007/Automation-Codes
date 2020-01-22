package testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gmail.base.BaseTest;
import com.gmail.pages.testpage;

public class Signup extends BaseTest {

	@Parameters("browser")

	/* test case for login into NOVICA */
	@Test(priority = 0)
	public void LoginNovica() throws Exception {

		testpage homePage = new testpage(driver);
		

		homePage.openHomePage();
	}

}
