package Coding_test;

import java.util.Scanner;

public class Gravity_array {
	/* 상자가 쌓여져있는 방이 있다. 이 방을 90도 회전후 각 상자들의 낙차들 중
	 * 가장큰 값을 출력하시오.
	 * 첫 출에는 테스트 케이스 횟수
	 * 두번째 줄에는 각 케이스의 가로 세로 크기 - 가로 세로의 크기는 2이상 100이하
	 * 세번째 줄에는 쌓여있는 상자의 수를 입력한다.
	 *  */
	public static void main(String argv[]) {
	 
	int test_case;
	Scanner input = new Scanner(System.in);
	int[][] arr = new int[100][100];
	int row,column;
	int count=0;

	int box[];
	//test_case=input.nextInt();
	
	//for(int i=0;i<test_case;i++) {
	int max=0;
	row = input.nextInt();
	column=input.nextInt();
	box = new int[row];
	for(int j=0;j<row;j++) {
		box[j] = input.nextInt();
		for(int k=0;k<box[j];k++) {
			arr[j][k]=1;
		}

	} // 방을 박스로 채우기
	
	for(int j=0;j<row;j++) {
		for(int k=0;k<column;k++) {
			System.out.printf("%d ",arr[j][k]);
		}
			System.out.println();
	}
	for(int j=0;j<column;j++) {
		count=0;
		for(int k=0;k<row;k++) {	
			if(arr[k][j]==1) {
				for(int p=k;p<row;p++) {
					if(arr[p][j]==0)
					count+=1;
				}
				break;
			}
			}
		if(count>max)
			max=count;
		}
		
	
	
	System.out.printf("%d ",max);
	//}
	
	
	}
}
