package Coding_test;

import java.util.Scanner;

public class Baby_Gin_Game {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	int sortedN[] = new int[6];
	int number = in.nextInt(); //6�ڸ� ���� �Է�
	int dN = 100000,temp=number;
	int count=0;
	
	for(int i=0;i<sortedN.length;i++) {
		sortedN[i]=temp/dN;
		temp=number%dN;
		dN /= 10;
	} // �� ���ڸ� �ڸ������� �迭�� ����

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
	} // �� ���ڸ� �ڸ������� �迭�� ����
	
	if(count>2) {
		System.out.println("Baby-Gin Success!!!");
	}
	else {
		System.out.println("Baby-Gin Fail�ФФ�");

	}
		
	}
	
	
	
}
