package lh.study.logger;
import java.io.IOException;

import org.apache.log4j.*;
public class MyApp {
static Logger logger = Logger.getLogger("process[myTest1]");
public static void main(String[] args) throws IOException {
	BasicConfigurator.configure();
	FileAppender fa = new FileAppender(null, "D:\\test.txt");
	
	logger.debug("test");
	logger.info("Enter application");
	logger.warn("this is a warning");
	logger.error("this is an error");
	logger.fatal("this is fatal");
	Bar bar = new Bar();
	bar.dolt();
	
}
}
class Bar {
	static Logger logger = Logger.getLogger("Bar.class");
	public void dolt() {
//		logger.
		logger.debug("dit it again!");
	}
}