package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class demoB 
{
	private static Logger log= LogManager.getLogger(demoB.class.getName());
	public static void main(String[] args) 
	{
		log.debug("beta Debug");
		log.info("beta Info");
		log.error("beta I'm error");
		log.fatal("beta I'm fatal");
	}

}
