package Pack;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int input[][]=new int[T][10];
		
		for(int i=0;i<T;i++) 
			for(int j=0;j<10;j++){
			input[i][j]=sc.nextInt();
		}
		
		for(int test_case = 0; test_case < T; test_case++) {
			int sum = 0;
			for(int j=0;j<10;j++)
		{
		
	     
		if(input[test_case][j]%2==1)
			sum += input[test_case][j];
		
		
		}
			System.out.println("#"+(test_case+1)+" "+sum);
		}
	}

}
