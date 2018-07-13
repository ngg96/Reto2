package com.accenture.AutomatizationPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoEmail {
	
	static WebDriver driver;
	
	public AutoEmail() {
	 
		System.setProperty("webDriver.chrome.driver","chromedriver.exe"); //Inicializar driver
		System.out.println("Driver initialized.");
		driver = new ChromeDriver(); //Definir variable tipo driver	

	}
	
	public void Login(String Email,String Password) {
		System.out.println("Executing Login...");
		
		driver.manage().window().maximize(); //Maximizar pantalla
		driver.get("http://www.google.com.co"); //Establece pagina de inicio
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //Tiempo de espera
	
		WebElement click1;
		WebElement click2;
		WebElement click3;
		
		click1 = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"));
		click1.click();
		
		click2 = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		click2.sendKeys(Email+"\n");
		
		click3 = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		click3.sendKeys(Password+"\n");
		
		System.out.println("Login executed.");
	}

	public void SendEmail(String Destination, String Asunto, String Informacion) throws InterruptedException {
		
		System.out.println("Executing SendEmail...");
		
		WebElement click1;
		WebElement click2;
		WebElement click3;
		WebElement click4;
		WebElement click5;
		
		click1 = driver.findElement(By.xpath("//*[@id=\":hd\"]/div/div"));
		click1.click();
	
		click2 = driver.findElement(By.name("to"));
//		click2 = driver.findElement(By.xpath("//*[@id=\":mq\"]"));
		click2.sendKeys(Destination);
	
		click3 = driver.findElement(By.name("subjectbox"));// xpath("//*[@id=\":ma\"]")
		click3.sendKeys(Asunto);
		
		click4 = driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")); 
		click4.sendKeys(Informacion);
		
		click5 = driver.findElement(By.xpath("//*[text()='Enviar']"));
		click5.click();
		
		System.out.println("SendEmail Executed.");
	}

	
}
