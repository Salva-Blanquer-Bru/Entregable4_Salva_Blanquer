package Entregable4_Salva_Blanquer; /**
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Salvador
 *
 */
public class Main {
	private static WebDriver driver;
	public static void main(String[] args) {

		String exePath = "C:\\Users\\salva\\Desktop\\de salva\\Programas Camarafp\\Programas Eclipse\\Web_scraping_Salva_Blanquer\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		ChromeOptions options = new ChromeOptions();
		ChromeOptions chromeOptions = options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("http://www.google.es");
		WebElement element= driver.findElement(By.name("q"));
		element.sendKeys("pc componentes");
		element.submit();
		WebDriverWait waiting= new WebDriverWait(driver,10);



		WebElement ventanaCookies =  driver.findElement(By.xpath("/html/body/aside/div/button"));
		if (ventanaCookies !=null){System.out.println("Detectado caja de cookies");
		ventanaCookies.click();}

	}
}


