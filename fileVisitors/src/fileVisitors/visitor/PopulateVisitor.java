package fileVisitors.visitor;

import fileVisitors.util.FileProcessor;
import fileVisitors.util.TreeBuilder;
import fileVisitors.util.MyLogger;

public class PopulateVisitor implements VisitorI{
	
	private FileProcessor fp = null;
	private String word = null;
	
	/**
	 * @param fpI - FileProcessor reference
	 */
	public PopulateVisitor (FileProcessor fpI) {
		MyLogger.writeMessage("PopulateVisitor constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
		fp = fpI;
	}
	
	/**
	 * @param tb - TreeBuilder reference
	 */
	public void visit(TreeBuilder tb) {
		MyLogger.writeMessage("PopulateVisitor's visit() method called", MyLogger.DebugLevel.IN_RUN);
		while((word = fp.readLine()) != null) {
			try {
                tb.insert(word);
                MyLogger.writeMessage("Word: '" + word + "' inserted into tree", MyLogger.DebugLevel.IN_RESULTS);
    		}
			catch(Exception e) {
				System.err.println("Something went wrong with inserting word into tree");
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

}
