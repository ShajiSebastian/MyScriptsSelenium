package Scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.reporters.jq.Main;



public class Log4j_script {
	
	static Logger logger = LogManager.getLogger(Log4j_script.class);
	//		LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		System.out.println("Invoked browser in TestNG");
		logger.info("Log4j info message");
		logger.error("log4j error message");
		logger.warn("This is a warning message");
		System.out.println("Log4j script completed");
	}

}
