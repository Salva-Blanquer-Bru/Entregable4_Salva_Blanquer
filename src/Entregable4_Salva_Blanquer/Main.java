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

	WebElement element= driver.findElement(By.xpath("//*[@id=\"pcc-search-api--input\"]/div/form/input"));

	System.out.println("Que Smartphone deseas buscar");
	Movil= Teclado.nextLine();
	element.sendKeys(Movil);
	element.submit();


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

}}
