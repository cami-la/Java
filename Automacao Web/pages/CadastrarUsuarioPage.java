package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

public class CadastrarUsuarioPage {

	private WebDriver driver;
	private Utils util;

	public CadastrarUsuarioPage(WebDriver driver) {
		util = new Utils(driver);
		this.driver = driver;
	}

	public void cadastrarusuario() {

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

	}

}
