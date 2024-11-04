import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class stores braille characters in a binary tree. 
 * @author Catie Baker and YOUR NAME HERE
 *
 */
public class BrailleTree {
	

	/**
	 * Creates the Braille tree from the alphabet in the provided file.
	 * The file should be formated in the following approach. The first line
	 * will be number with the number of dots in the braille character (e.g. 6 or 8)
	 * Then the file will have the translation guide, one braille character per line, with
	 * first the braille encoding as a series of bits representing the
	 * dots in a top to bottom, left to right order. Then after the encoding
	 * there will be a space followed by the text that braille character
	 * represents. In addition, it adds the all 0 encoding (000000 for six dot braille)
	 * as a space.
	 * @param filename the name of the file that stores the encoding mapping
	 */
	public BrailleTree(String filename) {

	}
	
	/**
	 * Adds the braille character with the provided binary 
	 * encoding to the tree with the provided text. If there is
	 * already something with that encoding in the tree, it replaces
	 * that text. 
	 * @param binary the braille encoding of the character
	 * @param text the text that the character represents
	 */
	public void add(String binary, String text) {
		//must implement using recursion with the helper method below
	}
	
	/**
	 * Adds the braille character with the provided binary 
	 * encoding to the tree with the provided text. If there is
	 * already something with that encoding in the tree, it replaces
	 * that text. 
	 * @param binary the remaining binary path that needs to be followed
	 * @param text the text to add to the tree
	 * @param curr the subtree to add the text to
	 * @return the node that is the root of the subtree
	 */
	private BrailleNode add(String binary, String text, BrailleNode curr) {

		
	}
	

	/**
	 * Gets the text associated with the provided braille character
	 * @param binary the binary encoding of the braille character
	 * @return the text associated with the braille character or
	 * the empty string if there is no such encoding in the tree
	 */
	public String getText(String binary) {
		//must implement using recursion with the helper method below

	}
	
	/**
	 * Gets the text associated with the provided braille character
	 * @param binary the remaining binary path that needs to be followed
	 * @return the text associated with the braille character or the
	 * empty string if there is no such encoding in the tree
	 */
	private String getText(String binary, BrailleNode curr) {

	}
	
	/**
	 * Finds and returns the braille encoding for the provided text
	 * @param text the text to find the braille encoding of
	 * @return the binary braille encoding that has that text or 
	 * the empty string if that text is not in the tree.
	 */
	public String getBraille(String text) {
		//must implement using recursion with the helper method below

	}
	
	/**
	 * Finds and returns the braille encoding for the provided text
	 * @param text the text to find the braille encoding of
	 * @param curr the current node that you are checking
	 * @param path the binary encoding the represents the path 
	 * to the current node 
	 * @return the binary braille encoding that has that text or 
	 * the empty string if that text is not in the tree.
	 */
	private String getBraille(String text, BrailleNode curr, String path) {
		
	}
	
	/**
	 * Given a file written in braille, it translates it to the
	 * text provided in the tree and writes it to a new file, outfile.
	 * @param infile the braille file to translate
	 * @param outfile the file to write the translation to
	 */
	public void translateFile(String infile, String outfile) {
	
	}

	
	/**
	 * Class representing a node in a BrailleTree. Nodes without
	 * associated text (e.g. inner nodes) should store the empty string 
	 * (indicating that those nodes do not store text as they are not
	 * a complete cell).
	 * @author Catie Baker
	 */
	
	//DO NOT CHANGE THIS CLASS
	private class BrailleNode {
		private String text;
		private BrailleNode left;
		private BrailleNode right;
		
				
		/**
		 * Creates a BrailleNode with the provided text value
		 * @param data the text to store in the node
		 */
		public BrailleNode(String data) {
			this.text = data;
			this.right = null;
			this.left = null;
		}

		/**
		 * Gets the text stored in the node
		 * @return the text stored in the node
		 */
		public String getText() {
			return text;
		}

		/**
		 * Sets the text stored in the node
		 * @param data the text to store in the node
		 */
		public void setText(String data) {
			this.text = data;
		}

		/**
		 * Gets the left child of the node
		 * @return the left child of the node
		 */
		public BrailleNode getLeft() {
			return left;
		}
		
		/**
		 * Sets the left child of the node
		 */
		public void setLeft(BrailleNode left) {
			this.left = left;
		}

		/**
		 * Gets the right child of the node
		 * @return the right child of the node
		 */
		public BrailleNode getRight() {
			return right;
		}

		/**
		 * Sets the right child of the node
		 */
		public void setRight(BrailleNode right) {
			this.right = right;
		}
		
		
	}
}
