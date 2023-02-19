package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ParentChildSiblings 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver browser=new ChromeDriver();
		browser.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Parent-->Child-->Siblings Traversing
		//General syntax: Parent - child: tagname/tagname/....
		//General syntax: Siblings: tagname/following-sibling::tagname[index number]
		System.out.println(browser.findElement(By.xpath("//body/div[1]/div[4]/fieldset/label[1]/following-sibling::label[1]")).getText()); //Option2
		/*
		 //body/div[1]/div[4]/fieldset/label[1]/following-sibling::label[1]
		 Here: //body/div[1]/div[4]/fieldset/label[1] is parent to child traversing
		 	   label[1]/following-sibling::label[1] is sibling to sibling traversing 
		  */
		browser.close();
	}
}
