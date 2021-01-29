package Entregable4_Salva_Blanquer;


import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		Scanner teclado = new Scanner(System.in);



	Busqueda1();
		driver.close();
	System.out.println("Pulsa enter para la siguiente busqueda");
		teclado.nextLine();
		Busqueda2();
	   driver.close();
	}


public static void Busqueda1(){

	String movil1;
	Scanner teclado = new Scanner(System.in);

	String exePath = "..\\Web_scraping_Salva_Blanquer\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",exePath);

	ChromeOptions options = new ChromeOptions();
	ChromeOptions chromeOptions = options.addArguments("--start-maximized");
	driver = new ChromeDriver(options);
	driver.get("https://www.pccomponentes.com/smartphone-moviles");


	WebElement BarraDeBusqueda1= driver.findElement(By.xpath("//*[@id=\"pcc-search-api--input\"]/div/form/input"));

	WebElement ventanaCookies= driver.findElement(By.xpath("//*[@id=\"familia-secundaria\"]/div[5]/div/div/div[2]/button"));
	ventanaCookies.click();

	System.out.println("Que Smartphone deseas buscar");
	movil1= teclado.nextLine();
	BarraDeBusqueda1.sendKeys(movil1);
	BarraDeBusqueda1.sendKeys(Keys.ENTER);

	System.out.println("Pulsa enter para ver precios");
	teclado.nextLine();
	System.out.println("---------------------------PC_COMPONENTES-----------------------");

	for (int i = 1; i < 4 ; i++) {
		try {
			String modelo1 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[3]/div/div["+i+"]/article/div/div/header/h3/a")).getText();

			String precio1 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[3]/div/div["+i+"]/article/div/div/div[2]/div/span")).getText();

			System.out.println(modelo1);
			System.out.println(precio1+ "€");
			System.out.println("----------------------------------------------------------------");

		}catch (Exception e){


}}}



	public static void Busqueda2(){
		String movil2;
		Scanner teclado = new Scanner(System.in);

		String exePath = "..\\Web_scraping_Salva_Blanquer\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);

		ChromeOptions options = new ChromeOptions();
		ChromeOptions chromeOptions = options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.es");

		WebElement BarraDeBusqueda2= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));



		System.out.println("Que Smartphone deseas buscar");
		movil2= teclado.nextLine();
		BarraDeBusqueda2.sendKeys(movil2);
		BarraDeBusqueda2.sendKeys(Keys.ENTER);



		System.out.println("Enter para selecionar la categoria de moviles");
		teclado.nextLine();
		WebElement Categoria2= driver.findElement(By.xpath("//*[@id=\"n/934197031\"]/span/a/span"));
		Categoria2.click();



		System.out.println(" Pulsa enter para ver precios");
		teclado.nextLine();
		System.out.println("---------------------------AMAZON-----------------------");

		for (int i = 1; i < 5 ; i++) {
			try {
				String modelo2 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div["+i+"]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2")).getText();

				String precio2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div["+i+"]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/a/span[1]/span[2]/span[1]")).getText();

				System.out.println(modelo2);
				System.out.println(precio2+ "€");
				System.out.println("----------------------------------------------------------------");

			}catch (Exception e){



}}}}
