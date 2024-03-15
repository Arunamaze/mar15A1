package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajji\\eclipse-workspace\\Amaze\\Adactin_Hotel\\Driver\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	driver.get(" http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement user = driver.findElement(By.id("username"));
	user.sendKeys("");
	 Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_9);
		r.keyRelease(KeyEvent.VK_9);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		Thread.sleep(1000);
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("Z1KG7G");
	

	
	Thread.sleep(1000);
	
	
WebElement log = driver.findElement(By.id("login"));
log.click();

WebElement sel = driver.findElement(By.id("location"));
Select s = new Select(sel);
s.selectByIndex(5);

WebElement sel1 = driver.findElement(By.name("hotels"));
Select s1 = new Select(sel1);
s1.selectByValue("Hotel Sunshine");

WebElement sel2 = driver.findElement(By.name("room_type"));
Select s2 = new Select(sel2);
s2.selectByValue("Standard");

WebElement sel3 = driver.findElement(By.id("room_nos"));
Select s3 = new Select(sel3);
s3.selectByIndex(2);
   
WebElement indate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
indate.sendKeys("08/11/2023");

WebElement outdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
outdate.sendKeys("09/11/2023");

WebElement sel4 = driver.findElement(By.id("adult_room"));
Select s4 = new Select(sel4);
s4.selectByIndex(2);

WebElement sel5 = driver.findElement(By.name("child_room"));
Select s5 = new Select(sel5);
s5.selectByIndex(0);

WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
sub.click();

WebElement c = driver.findElement(By.id("radiobutton_0"));
c.click();

WebElement con = driver.findElement(By.id("continue"));
con.click();

WebElement first = driver.findElement(By.id("first_name"));
first.sendKeys("");
r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_SHIFT);
Thread.sleep(500);

r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_R);
r.keyRelease(KeyEvent.VK_R);
r.keyRelease(KeyEvent.VK_SHIFT);
Thread.sleep(500);

r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_U);
r.keyRelease(KeyEvent.VK_U);
r.keyRelease(KeyEvent.VK_SHIFT);
Thread.sleep(500);

r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_N);
r.keyRelease(KeyEvent.VK_N);
r.keyRelease(KeyEvent.VK_SHIFT);
Thread.sleep(500);
WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
last.sendKeys("");
r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_K);
r.keyRelease(KeyEvent.VK_K);
r.keyRelease(KeyEvent.VK_SHIFT);
Thread.sleep(500);

r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_U);
r.keyRelease(KeyEvent.VK_U);
r.keyRelease(KeyEvent.VK_SHIFT);
Thread.sleep(500);

r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_M);
r.keyRelease(KeyEvent.VK_M);
r.keyRelease(KeyEvent.VK_SHIFT);
Thread.sleep(500);

r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_SHIFT);
Thread.sleep(500);

r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_R);
r.keyRelease(KeyEvent.VK_R);
r.keyRelease(KeyEvent.VK_SHIFT);

WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
add.sendKeys("188 IndiraNagar ussoor Vellore-632105 TamilNadu India");

WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));
credit.sendKeys("7639112233883875");

WebElement sel6 = driver.findElement(By.id("cc_type"));
Select s6 = new Select(sel6);
s6.selectByIndex(2);

WebElement sel7 = driver.findElement(By.id("cc_exp_month"));
Select s7 = new Select(sel7);
s7.selectByIndex(5);

WebElement sel8 = driver.findElement(By.id("cc_exp_year"));
Select s8 = new Select(sel8);
s8.selectByValue("2024");

WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
ccv.sendKeys("");
r.keyPress(KeyEvent.VK_7);
r.keyRelease(KeyEvent.VK_7);
Thread.sleep(500);
r.keyPress(KeyEvent.VK_6);
r.keyRelease(KeyEvent.VK_6);
Thread.sleep(500);
r.keyPress(KeyEvent.VK_3);
r.keyRelease(KeyEvent.VK_3);
Thread.sleep(500);

WebElement book = driver.findElement(By.xpath("//input[@type='button']"));
book.click();
String attribute = book.getAttribute("value");
System.out.println(attribute);
Thread.sleep(5000);
WebElement orderNo = driver.findElement(By.id("order_no"));
String attribute2 = orderNo.getAttribute("value");
System.out.println("Order Number :"+attribute2);

WebElement myiti = driver.findElement(By.id("my_itinerary"));
myiti.click();


WebElement cancel = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
cancel.click();
Alert a = driver.switchTo().alert();
a.accept();
WebElement message = driver.findElement(By.id("search_result_error"));
String text = message.getText();
System.out.println(text);





		

}}
