package Coding_test;
/*
 * 땅따먹기 게임
 * 행은 자유 / 열은 4개로 정해져있다.
 * 각 행을 지나며 얻은 점수가 최대가 될 때의 값을 구한다.
 * 조건 - 한 번 밟은 열은 다음 행에서 같은 열의 점수판을 밟지 못한다.
 */
import java.util.Scanner;


public class ddang {

	public static void main(String[] args) {		
		int row,column;
		Scanner in =new Scanner(System.in);
		row =in.nextInt();
		column=in.nextInt();
		
		
		int land[][]=new int[row][column];
	
		
		box arr[][]=new box[row][2];
		
		
		for(int j=0;j<row;j++) {
			for(int k=0;k<column;k++) {
				land[j][k]=in.nextInt();
			}

		} //점수 행렬 만들기

		int first=0,second=0,temp1=0,temp2=0;
		
		for(int j=0;j<row;j++) {
			first=0;
			second=0;
			for(int k=0;k<column;k++) {
				if(land[j][k]>first) {
					second=first;
					first = land[j][k];
					temp1=k;
				}
				else if(land[j][k]>second && land[j][k]!=first) {
					second = land[j][k];
					temp2=k;
				}
			}
			arr[j][0] = new box(first,temp1);
			arr[j][1] = new box(second,temp2);
		}
		int sum_1=arr[0][0].value,sum_2=arr[0][1].value;
		
		for(int j=0;j<row-1;j++) {
			if(arr[j][0].index!=arr[j+1][0].index) {
				sum_1 += arr[j+1][0].value;
			}
			else {
				sum_1 += arr[j+1][1].value;
			}
			}
		
		for(int j=0;j<row-1;j++) {
			if(arr[j][1].index!=arr[j+1][0].index) {
				sum_2 += arr[j+1][0].value;
			}
			else {
				sum_2 += arr[j+1][1].value;
			}
			}
	if(sum_1>sum_2)
		System.out.println(sum_1);
	else
		System.out.println(sum_2);
	
	}

}
class box{
	 int value;
	 int index;
	box(int value,int index){
		this.value=value;
		this.index = index;
	}
	
}
