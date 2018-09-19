/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  Try other methods here:
		String upperCase = sample.toUpperCase();
		System.out.println ("sample.toupperCase() = " + upperCase);
		System.out.println ("After toupperCase(), sample = " + sample);
		
		System.out.println(sample.length());
		
		String example1 = "U";
		String example2 = "p";
		System.out.println(example1.compareTo(example2));
	
		//experiment with substring
		String starter= "start middle end";
		int psn1=starter.indexOf("middle");
		System.out.print(starter.substring(psn1,psn1+7));
	}
}