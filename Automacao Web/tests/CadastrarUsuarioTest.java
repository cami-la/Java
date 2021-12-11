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

public class CadastrarUsuarioTest {

	private ChromeDriver driver;

	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void cadastrarUsuario() {
		
		WebDriverWait wait = new
		WebDriverWait(driver, 5);

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		driver.findElement(By.id("email_create")).sendKeys("everisbootcamp@qabeginner.com");
		driver.findElement(By.cssSelector("button[id='SubmitCreate'] span")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("July");
		driver.findElement(By.id("customer_lastname")).sendKeys("Sanders");
		driver.findElement(By.id("passwd")).sendKeys("QA@everis213");
		driver.findElement(By.cssSelector("#days")).sendKeys("1");
		driver.findElement(By.cssSelector("#months")).sendKeys("January");
		driver.findElement(By.cssSelector("#years")).sendKeys("2000");
		driver.findElement(By.id("address1")).sendKeys("Street name, 213");
		driver.findElement(By.id("city")).sendKeys("Honolulu");
		driver.findElement(By.id("id_state")).sendKeys("Hawaii");
		driver.findElement(By.id("postcode")).sendKeys("96815");
		driver.findElement(By.id("id_country")).sendKeys("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("9999999999");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("Address 1");
		driver.findElement(By.id("submitAccount")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
		
	}

	@After
	public void afterCenario() {
			driver.quit();		
	}

}
