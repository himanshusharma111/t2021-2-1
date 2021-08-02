/*input = ABDEFoutput = GFECB or input = XTD output = EUY */
package First_Screening_t2021_2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		char ch = 0; 
		char nextchar = 0;
		int ascii = 0;
		String revchar = null;
		char[] rev = null; 
		
		List list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in); 
		
		char[] chline = sc.next().toCharArray();  
		for(int i=0; i<chline.length; i++)
		{		
				ch = chline[i];
			  	ascii = (int)ch; 
			  	
				//if user enters Z then ascii value should be A
			  	if (ascii == 90) 
			  	{
			  		ascii = 65-1;
				}
			  	
				ascii++ ;    
				 nextchar = (char)ascii;
				 revchar = String.valueOf(nextchar); 
				 rev = revchar.toCharArray();
				 
				 for (char c : rev) 
				 { 
					 list.add(c);
				 }		
		}
		for(int l=list.size()-1; l>=0; l--)
		{
			System.out.print(list.get(l));
		}	
	}

}
