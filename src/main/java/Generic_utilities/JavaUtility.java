package Generic_utilities;

import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random ran= new Random();
		return ran.nextInt(100);
	}
}