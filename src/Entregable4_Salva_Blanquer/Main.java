package Entregable4_Salva_Blanquer; /**
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Scanner;
/**
 * @author Salvador
 *
 */
public class Main {
	private static WebDriver driver;
	public static void main(String[] args) {




		Busqueda1();
		Busqueda2();

	}


public static void Busqueda1(){

	String Movil;
	Scanner Teclado = new Scanner(System.in);

	String exePath = "..\\Web_scraping_Salva_Blanquer\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",exePath);

	ChromeOptions options = new ChromeOptions();
	ChromeOptions chromeOptions = options.addArguments("--start-maximized");
	driver = new ChromeDriver(options);
	driver.get("https://www.pccomponentes.com/");

	/**
	System.out.println("Pulsa Enter para ir a la seccion de moviles");
	Teclado.nextLine();
	WebElement Menu= driver.findElement(By.xpath("\t//*[@id=\"open-main-menu\"]"));
	Menu.click();
	WebElement MenuMoviles= driver.findElement(By.xpath("//*[@id=\"GTM-superitem-237\"]/span"));
	Menu.click();
	 */
	WebElement BarraDeBusqueda= driver.findElement(By.xpath("//*[@id=\"pcc-search-api--input\"]/div/form/input"));


	System.out.println("Que Smartphone deseas buscar");
	Movil= Teclado.nextLine();
	BarraDeBusqueda.sendKeys(Movil);
	BarraDeBusqueda.submit();

	System.out.println("Pulsa enter para ver precios");
	Teclado.nextLine();
	String resultados1 = driver.findElement(By.xpath("//*[@id=\"pcc-search-api--hits\"]/div[2]/ol")).getText();
	System.out.println(resultados1);

}

	public static void Busqueda2(){
		String Movil;
		Scanner Teclado = new Scanner(System.in);

		String exePath = "..\\Web_scraping_Salva_Blanquer\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);

		ChromeOptions options = new ChromeOptions();
		ChromeOptions chromeOptions = options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.es");

		WebElement element= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

		System.out.println("Que Smartphone deseas buscar");
		Movil= Teclado.nextLine();
		element.sendKeys(Movil);
		element.submit();

		System.out.println(" Pulsa enter para ver precios");
		Teclado.nextLine();

		for (int p = 3; p < autoincremtal; p++) {

		String resultados2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div")).getText();
		System.out.println(resultados2);


}}
