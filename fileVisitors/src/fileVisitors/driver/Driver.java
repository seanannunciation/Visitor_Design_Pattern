package fileVisitors.driver;

import java.lang.NumberFormatException;
import java.lang.RuntimeException;
import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.FileProcessor;
import fileVisitors.util.TreeBuilder;
import fileVisitors.store.Results;
import fileVisitors.visitor.VisitorI;
import fileVisitors.visitor.PopulateVisitor;
import fileVisitors.visitor.PalindromeHighlight;
import fileVisitors.visitor.PrimeLength;
import fileVisitors.visitor.PrintTree;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;

public class Driver {
	
	/**
	 * main method in Driver class
	 * @param args
	 */
	public static void main(String[] args) {

		String ipFile = null;
		String opFile = null;
		int debugValueSetter = -1;
		
		FileProcessor fileP = null;
		Results r = null;
	    TreeBuilder tb = null;
		
		try {
			if(3 == args.length) {
       	        ipFile = args[0];
	            opFile = args[1];
	            
	            debugValueSetter = Integer.parseInt(args[2]);
	            if(!(debugValueSetter >= 0 && debugValueSetter <= 4)) {
	            	throw new RuntimeException("Debug value must be integers between 0 and 4 inclusive");
	            }
	            MyLogger.setDebugValue(debugValueSetter);
			}
			else {
				throw new RuntimeException("Invalid number of arguments. Please enter 5 arguments");
			}
		}
		catch (Exception e) {
			System.err.println("exception occurred while parsing arguments");
			e.printStackTrace();
			System.exit(1);
		}
		

		try {
			fileP = new FileProcessor(ipFile);
		}
		catch(FileNotFoundException e) {
			System.err.println(" input file not found.");
			e.printStackTrace();
			System.exit(1);
		}

		r = new Results(opFile);
	    tb = new TreeBuilder();
		
		VisitorI populate = new PopulateVisitor(fileP);
		VisitorI palindrome = new PalindromeHighlight();
		VisitorI prime = new PrimeLength();
		VisitorI printv = new PrintTree(r);
		
		tb.accept(populate);
		tb.accept(palindrome);
		tb.accept(prime);
		tb.accept(printv);
	}
}
