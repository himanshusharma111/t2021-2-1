package First_Screening_t2021_2_1;

import java.util.HashMap;
import java.util.Map.Entry;

public class Problem4 
{
	public static void main(String args[])
    {
        int arr[] = {1,2,8,9,12,46,76,82,15,20,30};
        int count=0;
        
        HashMap<Integer, Integer>map2 = new HashMap<Integer, Integer>();
          
        for(int i=1; i<=9; i++) 
        {
        	count=0;
        	for(int j=0; j<arr.length; j++)
        	{
        		if(arr[j]%i==0) 
        		{
        			count++;
        		}
        	}
        	map2.put(i, count); 
        }
   
        for (Entry<Integer, Integer> entry : map2.entrySet())
            System.out.print("["+ entry.getKey() +" : "+ entry.getValue()+"]");
    }
}

