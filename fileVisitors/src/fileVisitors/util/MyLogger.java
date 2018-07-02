package fileVisitors.util;

public class MyLogger {

    /*DEBUG_VALUE=4 [Print to stdout everytime a constructor is called]
      DEBUG_VALUE=3 [Print to stdout everytime a visit method is called]
      DEBUG_VALUE=2 [Print to stdout everytime word is read and inserted into tree]
      DEBUG_VALUE=1 [Print to stdout the contents of results]
      DEBUG_VALUE=0 [No output is printed from the application to stdout. It writes to the output file though]
    */

	public static enum DebugLevel {
    	RELEASE,
    	FROM_RESULTS,
    	IN_RESULTS,
    	IN_RUN,
    	CONSTRUCTOR
	};
	
	private static DebugLevel debugLevel;

	/**
	 * @param levelIn - Debuglevel coming in
	 */
    public static void setDebugValue (int levelIn) {
    	switch (levelIn) {
    		case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
    		case 3: debugLevel = DebugLevel.IN_RUN; break;
    		case 2: debugLevel = DebugLevel.IN_RESULTS; break;
    		case 1: debugLevel = DebugLevel.FROM_RESULTS; break;
    		case 0: debugLevel = DebugLevel.RELEASE; break;
    	}
    }

    /**
     * @param levelIn - debuglevel to set
     */
    public static void setDebugValue (DebugLevel levelIn) {
    	debugLevel = levelIn;
    }

    // @return None
    /**
     * @param message - message to be printed
     * @param levelIn - debuglevel
     */
    public static void writeMessage (String  message, DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    /**
	 * @return String
	 */
    public String toString() {
    	return "Debug Level is " + debugLevel;
    }
}
