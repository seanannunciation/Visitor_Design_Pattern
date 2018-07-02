package fileVisitors.util;

public class Node {
	
	private String word = null;
	private Node left = null;
	private Node right = null;
		
	/**
	 * constructor for node
	 * @param wordI - incoming word
	 */
	public Node(String wordI) {
		MyLogger.writeMessage("Node constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
		word = wordI;
		left = null;
		right = null;
	}
	
	/**
	 * @return String - word stored in Node
	 */
	public String getWord() {
		return word;
	}
	
	/** 
	 * @return left Node
	 */
	public Node getLeft() {
		return left;
	}
	
	/**
	 * @return right Node
	 */
	public Node getRight() {
		return right;
	}
	
	/**
	 * @param wordI - word to be updated
	 */
	public void setWord(String wordI) {
		word = null;
		word = wordI;
	}
	
	/**
	 * @param n - node to set left node
	 */
	public void setLeft(Node n) {
		left = n;
	}
	
	/**
	 * @param n - node to set right node
	 */
	public void setRight(Node n) {
		right = n;
	}
}
