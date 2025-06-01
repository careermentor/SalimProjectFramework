package utilties;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile
{

	
	public static String readconfigfile(String name) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		return prop.get(name).toString();
		
	}
	
	public static String readelementfile(String name) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		return prop.get(name).toString();
		
	}
	
}
