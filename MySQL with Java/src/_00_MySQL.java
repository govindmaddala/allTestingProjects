import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class _00_MySQL 
{

	public static void main(String[] args) throws SQLException 
	{
//		//Browser invocation
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driverss//chromedriver.exe");
////		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/signup");
//		
//		//Connection to database
//		//Connection con=DriverManager.getConnection("jdbc:mysql://"+"localhost"+":"+"3306"+"/fb", "root", "210795");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fb", "root", "210795");
//		
//		//A cursor type statemen is created to execute queries
//		Statement s=con.createStatement();	
//		
//		//Executing queries
//		ResultSet data=s.executeQuery("select * from signup");
//		while(data.next())
//		{
//			driver.findElement(By.name("firstname")).sendKeys(data.getString("firstname"));
//			driver.findElement(By.name("lastname")).sendKeys(data.getString("surname"));
//		}
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsw", "root", "210795");
		Statement statement = con.createStatement();
		ResultSet data= statement.executeQuery("select * from sms;");
		System.out.println(data);
	}

}
