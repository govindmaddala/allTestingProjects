package alpha;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demoA 
{
	//private static org.apache.logging.log4j.Logger log= LogManager.getLogger(demoAlpha.class.getName());
	private static Logger log= LogManager.getLogger(demoA.class.getName());
	public static void main(String[] args) 
	{
		log.debug("alpha Debug");
		log.info("alpha Info");
		log.error("alpha I'm error");
		log.fatal("alpha I'm fatal");
	}

}
