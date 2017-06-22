package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Tokens{
	List<String> list2 = new ArrayList<String> ();	
}
public class Files {
	public static void main(String[] args) throws Exception {
		
		BufferedReader add1 = null;
		//BufferedReader temp1 = null;
		
		add1 = new BufferedReader(new FileReader("NewFiles.text"));
		
		//FileWriter outFile = new FileWriter("NewText.txt");
		//BufferedWriter outStream = new BufferedWriter(outFile);
		
		List<String> list1 = new ArrayList<String> ();
		
		String Currentln;
		
		while ((Currentln = add1.readLine()) != null) {
            list1.add(Currentln);
		}
		
		Tokens[] st = new Tokens[list1.size()];
		
		for(int j = 0; j < list1.size(); j++ ){
			StringTokenizer  st1 = new StringTokenizer(list1.get(j)," \\ ");
			int a = st1.countTokens();
			st[j] = new Tokens();
		    while (st1.hasMoreTokens()) {
		    	st[j].list2.add(st1.nextToken());
		    }
		    System.out.println(st[j].list2.get(a-2));
		}
		 
		
		
		add1.close();
	
		//outStream.close();
		/*
		*4 Constraints
		*6 Functions
		*5 Indexes
		*7 Java
		*1 Packages
		*2 Packages_body
		*3 Procedures
		*8 Scripts
		*9 Sequences
		*10 Synonyms
		*11 Tables
		*16 Table_Types
		*15 Triggers
		*13 Types
		*12 Types_body
		*14 Views
		*/
	
	}
} 