import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Baseclass;

public class VerifyTitleHomepage extends Baseclass {
	@Test
	public void TC() {
		String et="Swag Labs";
		 String ht=driver.getTitle();
		 Assert.assertEquals(et,ht,"Both are not matching");
		System.out.println("TC is pass");
} 
}
