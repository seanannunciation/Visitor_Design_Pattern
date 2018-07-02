package fileVisitors.visitor;

import fileVisitors.util.Node;
import fileVisitors.util.TreeBuilder;
import fileVisitors.util.VisitorHelper;
import fileVisitors.util.MyLogger;

public class PalindromeHighlight implements VisitorI {
	
	private VisitorHelper vh = new VisitorHelper();
	
	/**
	 * constructor for Palindrome Highlight
	 */
	public PalindromeHighlight () {
		MyLogger.writeMessage("PalindromeHighlight constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
	}

	/**
	 * @param tb - treeBuilder reference
	 */
	public void visit(TreeBuilder tb) {
		MyLogger.writeMessage("PalindromeHighlight's visit() method called", MyLogger.DebugLevel.IN_RUN);
		inorderVal(tb.getRoot());
	}
	
	/**
	 * @param r - root node of tree to traverse
	 */
	private void inorderVal(Node r) {
		if (r != null) {
			inorderVal(r.getLeft());
			if (vh.isPalindrome(r.getWord().toUpperCase())) {
				r.setWord(r.getWord().toUpperCase());
			}
			inorderVal(r.getRight());
		}
	}
}
