
Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=input.txt  -Darg1=output.txt -Darg2=debugLevel

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.”

[Date: 11/22/2017]

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)

Arraylist for storing results:
	Best: O(1) for add() and O(1) for remove 
	Average: O(1) for add() and O(N) for remove
	Worst: O(1) for add() and O(N) for remove

BST for storing words:
	For all three operations we have to traverse through the entire
	tree, which makes it's time complexity as O(N) for all the 
	operations in all cases (Assuming the size of word as constant).
	Best: Insert O(1), Update O(1) [We are never deleting node]
	Average: Insert O(Log(N)), Update O(Log(N))
	Worst: Insert O(N), Update O(N)
		[Assuming input file is randomly distributed, it is very 
		unlikely for the Worst case to happen]
	
-----------------------------------------------------------------------

Provide list of citations (urls, etc.) from where you have taken code
(if any).

1) Binary Search Tree implementation references:
http://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
http://www.sanfoundry.com/java-program-implement-binary-search-tree/

2) isPalindrome() implementation reference:
http://componentsprogramming.com/palindromes

3) isNumberPrime() implementation source:
https://www.programiz.com/java-programming/examples/prime-number

4) Motivation to select Scanner over BufferedReader:
https://stackoverflow.com/questions/2231369/scanner-vs-bufferedreader

5) Motivation to use PrintWriter over BufferedWriter
https://stackoverflow.com/questions/1747040/difference-between-java-io-printwriter-and-java-io-bufferedwriter