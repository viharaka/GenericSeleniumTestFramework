import org.apache.log4j.Logger;

class A
{
	final static Logger logger = Logger.getLogger(A.class);
	public static void main(String[] args) {
		System.out.println(logger);
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " );
		}
		logger.warn("This is warn : ");
		logger.error("This is error : ");
		logger.fatal("This is fatal : ");

		System.out.println("ssfsefs");	
	}
}