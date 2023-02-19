package Govind_Maddala.SeleniumWithJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindmaddala\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Opening website
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);	
		//Round Trip
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div")).click();
		//destination
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]")).click();
		//Banglore was selected
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[6]")).click();
		//Chennai was selected
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[8]")).click();
		//
		//from date
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[4]/div[1]/div")).click();
		//to date
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[4]/div[1]/div")).click();
		
		
		//changing currency to USD
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[3]")).click();
		
		//Passengers 
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
				 //for 3 adults, 2child and 2 kids
		for(int i=1;i<=2;i++)
		{
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click(); //3 adult
			driver.findElement(By.cssSelector("div[data-testid='Children-testID-plus-one-cta']")).click(); //2 child
			driver.findElement(By.cssSelector("div[data-testid='Infant-testID-plus-one-cta']")).click(); //2kids
		}
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']")).click();
		
		//selecting family and frnds check box
		driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[1]/div/div/div[1]")).click();
		
		//search
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();	
		
//		//check-box
//		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div/div[1]/div/div[1]")).click();
//		
//		//continue
//		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div/div[3]/div")).click();
		//driver.close();
	}
}