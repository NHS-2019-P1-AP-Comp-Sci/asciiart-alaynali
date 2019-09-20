/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */


/**
 * output:
 * 
 * 
 * VICTOR RODRIGUEZ IS BACK FROM THE DEAD
 *     ____     ____
 *    /    \___/    \
 *   /               \ 
 *  /  | RODRIGUEZ |  \
 *  |__|    ___    |__|
 *     |   / | \   |
 *     |   \_|_/   |
 *     |   / | \   |
 *     |   \_|_/   |
 *     |___________|
 *   
 *   
 */  

public class ASCIIArt {
	// goes to the next line
	public static void newLine() {
		System.out.println();
	}
	
	// upper neck/shoulder region
	public static void shoulderTop() {
		System.out.print("     ____");
	}
	public static void shoulderEnd() {
		System.out.print("/    \\");
	}
	public static void shoulder() {
		shoulderTop();
		shoulderTop();
		newLine();
		System.out.print("    ");
		shoulderEnd();
		System.out.print("___");
		shoulderEnd();
		newLine();
		System.out.print("   /\t\t   \\");
		newLine();
	}
	
	// sleeves/name
	public static void sleeveEnd() {
		System.out.print("|__|");
	}
	public static void name() {
		System.out.print("/  | RODRIGUEZ |  \\");
	}
	public static void sleeve() {
		System.out.print("  ");
		name();
		newLine();
		System.out.print("  ");
		sleeveEnd();
		System.out.print("    ___    ");
		sleeveEnd();
		newLine();
	}
	
	// back/number
	public static void shirtEdge() {
		System.out.print("   |   ");
	}
	public static void numberHalf() {
		System.out.print("  ");
		shirtEdge();
		System.out.print("/ | \\");
		shirtEdge();
		newLine();
		
		System.out.print("  ");
		shirtEdge();
		System.out.print("\\_|_/");
		shirtEdge();
		newLine();
	}
	public static void number() {
		numberHalf();
		numberHalf();
	}
	
	// end of shirt
	public static void shirtBottom() {
		System.out.print("     |___________|\n");
	}
	
	public static void main (String [] args) {
		System.out.println("\n\"VICTOR RODRIGUEZ IS BACK FROM THE DEAD !!\"\n");
		shoulder();
		sleeve();
		number();
		shirtBottom();
	}
}