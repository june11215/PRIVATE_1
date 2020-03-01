package Coding_test;

import java.util.Scanner;

public class Baby_Gin_Game {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	int number = in.nextInt(); //6자리 숫자 입력
	int answer=0;

	int count[] = new int[10];
	
	for(int i=0;i<6;i++) {
		count[number%10]++;
		number /=10;
	}
	
		for(int i=0;i<count.length;i++) {
			if(count[i]>=3)
				answer++;
			}
		for(int i=0;i<count.length-2;i++) {
			if(count[i]>0 && count[i+1]>0 && count[i+2]>0)
				answer++;
			if(count[i]>1 && count[i+1]>1 && count[i+2]>1)
				answer++;
			}
		
	if(answer>=2)
		System.out.println("Win!");
	else
		System.out.println("Lose...");
				
	}
}	
	
	
	

