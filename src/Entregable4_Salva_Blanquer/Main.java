package Entregable4_Salva_Blanquer;


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
		Scanner teclado = new Scanner(System.in);



	//	Busqueda1();
		System.out.println("Pulsa enter para la siguiente busqueda");
		teclado.nextLine();
		Busqueda2();

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


	WebElement BarraDeBusqueda= driver.findElement(By.xpath("//*[@id=\"pcc-search-api--input\"]/div/form/input"));


	System.out.println("Que Smartphone deseas buscar");
	movil1= teclado.nextLine();
	BarraDeBusqueda.sendKeys(movil1);
	BarraDeBusqueda.submit();


	System.out.println("Enter para selecionar la categoria de moviles");
	teclado.nextLine();
	WebElement Categoria= driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/aside/div[3]/div[2]/div/ul/li[1]/div/div"));
	Categoria.click();

	System.out.println("Pulsa enter para ver precios");
	teclado.nextLine();
	System.out.println("---------------------------PC_COMPONENTES-----------------------");



	for (int i = 1; i < 4 ; i++) {


			String modelo = driver.findElement(By.xpath("//*[@id=\"pcc-search-api--hits\"]/div[2]/ol/li["+i+"]")).getText();


	System.out.println(modelo);
		System.out.println("----------------------------------------------------------------");
}}

;

	public static void Busqueda2(){
		String movil2;
		Scanner Teclado = new Scanner(System.in);

		String exePath = "..\\Web_scraping_Salva_Blanquer\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);

		ChromeOptions options = new ChromeOptions();
		ChromeOptions chromeOptions = options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.es");

		WebElement element= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

		System.out.println("Que Smartphone deseas buscar");
		movil2= Teclado.nextLine();
		element.sendKeys(movil2);
		element.submit();

		System.out.println(" Pulsa enter para ver precios");
		Teclado.nextLine();
		System.out.println("---------------------------AMAZON-----------------------");

		for (int i = 1; i < 4 ; i++) {


		String resultados2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div["+i+"]/div")).getText();

		System.out.println(resultados2);
		System.out.println("----------------------------------------------------------------");

}}}
