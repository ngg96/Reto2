package com.accenture.AutomatizationPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFB {

	static WebDriver driver;
	
	public AutoFB() {
		
		System.setProperty("webDriver.chrome.driver","chromedriver.exe"); //Inicializar driver
		System.out.println("Driver initialized.");
		driver = new ChromeDriver(); //Definir variable tipo driver	
		
	}

	public void Login(String Email, String Password) {
		
		System.out.println("Executing Login...");

		driver.manage().window().maximize(); //Maximizar pantalla
		driver.get("http://www.facebook.com"); //Establece pagina de inicio
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //Tiempo de espera
		
		WebElement click1;
		WebElement click2;
		
		click1 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		click1.sendKeys(Email);
	
		click2 = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		click2.sendKeys(Password+"\n");
		
		System.out.println("Login executed.");
		
	}

	public void Search(String Name) {
		
		System.out.println("Searching "+Name+"...");
		
		WebElement click1;
//		WebElement click2;
		
		click1 = driver.findElement(By.name("q")); //xpath("//*[@id=\"u_t_2\"]/input[2]")
		click1.sendKeys(Name+"\n");
	
//		click2 = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//		click2.sendKeys("veracruz2016 \n");
		
		System.out.println(Name+" Searched ");
	}
}
