package searchproduct;

import java.nio.file.DirectoryStream.Filter;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;



public class Search {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromeDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));
		searchbox.sendKeys("samsung mobile"+Keys.ENTER);
		
		WebElement filter=driver.findElement(By.xpath("//*[@id=\'p_36/1318505031\']/span/a/span"));
		filter.click();
		
		List<WebElement> values = driver.findElements(By.cssSelector("[class='a-price-whole']"));
		Map<WebElement, Integer> map = new HashMap<WebElement,Integer>();
		for(int i=0;i<values.size();i++)   {
			
		if(values.get(i).getText() !="") {
			
		map.put(values.get(i), Integer.parseInt(values.get(i).getText().replaceAll(",", "")));
		
		List<Entry<WebElement, Integer>> price = new ArrayList<Map.Entry<WebElement, Integer>>();
	price.sort(Entry.comparingByValue());
	
		for(Entry product : price) {
			
		System.out.println(product.getValue());
			
	price.get(price.size()-1).getKey().click();
		}}}}}
		
		
		
		
		
		
		
		
			
			
			
			
			
	
