/*Problem-4: Get the total count of number list in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
(examples)
input: [1,2,8,9,12,46,76,82,15,20,30]
Output:
{1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}*/

package First_Screening_t2021_2_1;

import java.util.HashMap;
import java.util.Map.Entry;

public class Problem4 {

    static int Answer[];
    static void countfunc(int arr[], int n)
    {	
        int maximumval = arr[0];
        for (int i = 1; i < n; i++)
        	maximumval = Math.max(arr[i], maximumval); //storing the maximum element of arr[] 
    
 
        int count[] = new int[maximumval + 1]; // array is start from 0 this is why MAX+1; // 0 to 82 contains // element
 
        Answer = new int[maximumval + 1]; // 82 size indexes of ans global 

        for (int i = 0; i < n; ++i)
            ++count[arr[i]];
 
      
        for (int i = 1; i <= maximumval; ++i)
            for (int j = i; j <= maximumval; j += i)
                Answer[i] += count[j];
        return;
    }
 
    static int Multiples(int k)
    {
        return Answer[k];
    }
 
    public static void main(String args[])
    {
        int arr[] = {1,2,8,9,12,46,76,82,15,20,30};
        int n = arr.length;//11
        
        countfunc(arr, n);
        
        for(int i=1; i<=9; i++)
        {
        	 int k = i;
   
             HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
             map.put(k, Multiples(k));
             
             for (Entry<Integer, Integer> entry : map.entrySet())
                 System.out.print("["+ entry.getKey() +" : "+ entry.getValue()+"]");
             
        }
        
       
    }
}

