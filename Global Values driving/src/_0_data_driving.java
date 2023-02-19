import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class _0_data_driving {

	public static void main(String[] args) throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\CG-DTE\\eclipse-workspace\\Global Values driving\\src\\data.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("Sname")); //maddala

        System.out.println(prop.getProperty("midname1"));
       
        System.out.println(prop.getProperty("midname2"));
      
        System.out.println(prop.getProperty("name"));
        
        //modifies on run time
        prop.setProperty("Sname", "Maddala");
        System.out.println(prop.getProperty("Sname")); //Maddala
        
        //How to change data.properties file also
        FileOutputStream fos=new FileOutputStream("C:\\Users\\CG-DTE\\eclipse-workspace\\Global Values driving\\src\\data.properties");
        prop.store(fos, null);
        
        
        
	}

}
