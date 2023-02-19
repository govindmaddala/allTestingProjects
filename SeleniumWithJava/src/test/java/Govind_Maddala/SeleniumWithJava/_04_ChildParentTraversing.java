package Govind_Maddala.SeleniumWithJava;
//Success
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_ChildParentTraversing {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver surf=new ChromeDriver();
		
		surf.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(surf.findElement(By.xpath("//body/header/div/button[1]/following-sibling::button[2]/parent::div/parent::header/a[2]")).getText());
		
		//Free Access to InterviewQues/ResumeAssistance/Material
		/*
		 Here: //body/header/div/button[1]/following-sibling::button[2]/parent::div/parent::header/a[2]
		  * //body/header/div/button[1] --> from header to Practice button via division
		  * button[1]/following-sibling::button[2] --> from Practice button to signup button
		  * following-sibling::button[2]/parent::div --> from signup button to div
		  * parent::div/parent::header/a[2] --> from division to header part and then to anchor tag area containing following text
		  * 			"Free Access to InterviewQues/ResumeAssistance/Material"
		 * */
		
		
		
		//parse the string to get required word: and here it is get "Access" word
		String line=surf.findElement(By.xpath("//body/header/div/button[1]/following-sibling::button[2]/parent::div/parent::header/a[2]")).getText();
		String[] linearray=line.split("to"); //[Free Access InterviewQues/ResumeAssistance/Material]
		String[] HalfOffirstlinearray= linearray[0].split(" ");  //[Free Access] -->[Free] [Access]
		System.out.println(HalfOffirstlinearray[1]); //[Access]
		
		
		
		//parse the string to get required word: and here it is get "InterviewQues" word
		String line1=surf.findElement(By.xpath("//body/header/div/button[1]/following-sibling::button[2]/parent::div/parent::header/a[2]")).getText();
		String[] linearray1=line1.split("/"); 		
		//[(Free Access to InterviewQues) (ResumeAssistance) (Material)] i.e splitting done @2 places where '/' is there.
		System.out.println("@0="+linearray1[0]+" @1="+linearray1[1]+" @2="+linearray1[2]); 
		//@0=Free Access to InterviewQues @1=ResumeAssistance @2=Material
		System.out.println(linearray1[0].split("to")[1].trim()); //(Free Access to InterviewQues) == [(free Access) (Interviews)]
		//OUTPUT:InterviewQues
		surf.close();
		//
	}

}
