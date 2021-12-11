package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

public class CadastrarUsuarioUtilsTest {
	
	private ChromeDriver driver;
	private Utils util;

	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		util = new Utils(driver);
	}

	@Test
	public void cadastrarUsuarioUtils() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);

		driver.get("http://automationpractice.com/index.php");

		util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");
		util.preencheCampoPorId("email_create", "everisbootcamp@qabeginner.com");
		util.clickPorCss("button[id='SubmitCreate'] span");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
		util.clickPorId("id_gender2");
		util.preencheCampoPorId("customer_firstname", "July");
		util.preencheCampoPorId("customer_lastname", "Sanders");
		util.preencheCampoPorId("passwd", "QA@everis213");
		util.preencheCampoPorCss("#days", "1");
		util.preencheCampoPorCss("#months", "January");
		util.preencheCampoPorCss("#years", "2000");
		util.preencheCampoPorId("address1", "Street name, 213");
		util.preencheCampoPorId("city", "Honolulu");
		util.preencheCampoPorId("id_state", "Hawaii");
		util.preencheCampoPorId("postcode", "96815");
		util.preencheCampoPorId("id_country", "United States");
		util.preencheCampoPorId("phone_mobile", "9999999999");
		util.clickPorId("submitAccount");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());

	}

	@After
	public void afterCenario() {
			driver.quit();

	}

}
