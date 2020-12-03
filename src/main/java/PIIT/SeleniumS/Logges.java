package PIIT.SeleniumS;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logges {
	
	public static Logger lg = Logger.getLogger(Logges.class.getName());

	public static void main(String[] args) {
		/*
		 * 1. Download and add log4j dependencies into pom file
		 * 2. Create properties file under project
		 * 3. Create 'Logger' instance in to class
		 * 4. Give path for our properties files
		 */

		PropertyConfigurator.configure("C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Logged.properties");
		lg.info("This is our first logs for use");
		
		/*
		 * log4j.appender.Appender.Append=false
		 * if properties file we mention 'false' its override every execution
		 * if we mention 'true' its added new log in every execution
		 */
		
	}

}

