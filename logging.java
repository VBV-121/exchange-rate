package currency;

import org.apache.log4j.Logger;

public class logging {

	private static final Logger LOGGER = Logger.getLogger(All.class);
	
	public void logg() {
		//logging site connection events 
		try {
			LOGGER.info("CONNECTION ESTABLISHED");
		} catch (Exception e) {
			LOGGER.error("CONNECTION BROKEN");
		}
	}
}
