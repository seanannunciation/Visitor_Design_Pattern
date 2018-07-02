package fileVisitors.visitor;

import fileVisitors.util.Node;
import fileVisitors.util.TreeBuilder;
import java.io.FileNotFoundException;
import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;

public class PrintTree implements VisitorI {
	
	private Results rs = null;
	
	/**
	 * @param rsI - Results reference
	 */
	public PrintTree (Results rsI) {
		MyLogger.writeMessage("PrintTree constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
		rs = rsI;
	}

	/**
	 * @param tb - TreeBuilder reference
	 */
	public void visit(TreeBuilder tb) {
		MyLogger.writeMessage("PrintTree's visit() method called", MyLogger.DebugLevel.IN_RUN);
		inorderVal(tb.getRoot());

		rs.writeToStdout();
		
		try {
			rs.writeToFile();
		}
		catch(FileNotFoundException e) {
			System.err.println("Output file cannot be generated");
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/**
	 * @param r - root node for traversing
	 */
	private void inorderVal(Node r) {
		if (r != null) {
			inorderVal(r.getLeft());
			rs.storeNewResult(r.getWord());
			inorderVal(r.getRight());
		}
	}
}
