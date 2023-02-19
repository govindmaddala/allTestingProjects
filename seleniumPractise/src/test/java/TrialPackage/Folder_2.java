package TrialPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Folder_2 {
	
	@Parameters({"testlevelParam"})
	@Test
	public void classB(String param) {
		System.out.println("Class B from Folder 2");
		System.out.println(param);
	}

}
