package Generic_utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	public FileInputStream fisp;
	public String readDataFromPropertyFile(String key)throws Throwable{
	 FileInputStream fisp=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\HybridSwagLabsFrameWork\\src\\main\\resources\\commondata.properties");
	 Properties p=new Properties();
	 p.load(fisp);
	 return p.getProperty(key);
	}
	}

