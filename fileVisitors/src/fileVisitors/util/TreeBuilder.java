package fileVisitors.util;

import fileVisitors.visitor.VisitorI;

public class TreeBuilder {
	private Node root;
	
	public TreeBuilder() {
		MyLogger.writeMessage("TreeBuilder constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
		root = null;
	}
	
	/**
	 * insert node into BST
	 * @param wordI - word to be stored in node
	 */
	public void insert (String wordI) {
		root = insertVal(root, wordI);
	}
	
	/**
	 * helper function for inserting
	 * @param rootI - root as incoming parameter
	 * @param val - String to be inserted in Node
	 * @return root node
	 */
	private Node insertVal(Node rootI, String val) {
		if(rootI == null) {
			rootI = new Node(val);
		}
		else {
			if (((rootI.getWord()).compareTo(val)) > 0) {
				rootI.setLeft(insertVal(rootI.getLeft(), val));
			}
			else if (((rootI.getWord()).compareTo(val)) < 0) {
				rootI.setRight(insertVal(rootI.getRight(), val));
			}
			else if (((rootI.getWord()).compareTo(val)) == 0) {}
		}
		return rootI;
	}

	/**
	 * @return Node - root node
	 */
	public Node getRoot() {
		return root;
	}
	
	/**
	 * accept method of visitor pattern
	 * @param visitor - VisitorI object
	 */
	public void accept(VisitorI visitor) {
		visitor.visit(this);
	}
	
	/**
	 * @return word at root node
	 */
	public String toString() {
		return "Word in root node: " + root.getWord();
	}
}

/**Binary Search Tree implementation references:
 *http://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 *http://www.sanfoundry.com/java-program-implement-binary-search-tree/
*/