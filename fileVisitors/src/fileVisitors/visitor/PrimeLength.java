package fileVisitors.visitor;

import fileVisitors.util.Node;
import fileVisitors.util.TreeBuilder;
import fileVisitors.util.VisitorHelper;
import fileVisitors.util.MyLogger;

public class PrimeLength implements VisitorI {
	
	private VisitorHelper vh = new VisitorHelper();
	
	/**
	 * PrimeLength constructor
	 */
	public PrimeLength () {
		MyLogger.writeMessage("PrimeLength constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
	}

	/**
	 * @param tb - TreeBuilder reference
	 */
	public void visit(TreeBuilder tb) {
		MyLogger.writeMessage("PrimeLength's visit() method called", MyLogger.DebugLevel.IN_RUN);
		inorderVal(tb.getRoot());
	}
	
	/**
	 * @param r - root node for traversing
	 */
	private void inorderVal(Node r) {
		if (r != null) {
			inorderVal(r.getLeft());
			if (vh.isLengthPrime(r.getWord())) {
				r.setWord(r.getWord() + "-PRIME");
			}
			inorderVal(r.getRight());
		}
	}
}
