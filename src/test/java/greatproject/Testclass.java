package greatproject;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Testclass {
	@Test
	
	public void testing ()
	{
		System.out.println("testing");
	}
	@Test
	 public void testing2()
	 {
		Reporter.log("Testing");
		 System.out.println("Testing2");
		
	}

}
