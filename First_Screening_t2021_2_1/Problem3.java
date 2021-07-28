/*Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

Output: (examples)
1) input a = 1, then output : 1
2) input a = 2, then output : 1
3) input a = 3, then output : 1, 3, 5
4) input a = 4, then output : 1, 3, 5
5) input a = 5, then output : 1, 3, 5, 7, 9
6) input a = 6, then output : 1, 3, 5, 7, 9
.
.
7) input a = x, then output : 1, 3, 5, 7, .......*/

package First_Screening_t2021_2_1;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int a = sc.nextInt();
		
		if (a % 2 != 0)
		{
			for(int i = 1; i<a+1; i++)
			{
				if (i % 2 != 0) {
					a++;
					System.out.print(i+",");
				}			
			}
		}
		else if(a % 2 == 0)
		{
			for(int i = 1; i<=a-1; i++)
			{
				if (i % 2 != 0) {
					a++;
					System.out.print(i+",");
				}			
			}
		}

	}

}
