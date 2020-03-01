package Coding_test;

import java.util.Scanner;

public class Baby_Gin_Game {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	int sortedN[] = new int[6];
	int number = in.nextInt(); //6자리 숫자 입력
	int dN = 100000,temp=number;
	int count=0;
	
	for(int i=0;i<sortedN.length;i++) {
		sortedN[i]=temp/dN;
		temp=number%dN;
		dN /= 10;
	} // 각 숫자를 자릿수별로 배열에 저장

	for(int i=0;i<sortedN.length;i++)
		for(int j=0;j<sortedN.length;j++) {
			if(sortedN[i]<sortedN[j]) {
				temp=sortedN[j];
				sortedN[j]=sortedN[i];
				sortedN[i]=temp;
			}
		}
	
	for(int i=0;i<sortedN.length-2;i++) {
		if((sortedN[i]==sortedN[i+1]&&sortedN[i]==sortedN[i+2])||
				(sortedN[i]+1==sortedN[i+1]&&sortedN[i+1]+1==sortedN[i+2]) ) {
			count++;
		}
	} // 각 숫자를 자릿수별로 배열에 저장
	
	if(count>2) {
		System.out.println("Baby-Gin Success!!!");
	}
	else {
		System.out.println("Baby-Gin Failㅠㅠㅠ");

	}
		
	}
	
	
	
}
