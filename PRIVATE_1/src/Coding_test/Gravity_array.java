package Coding_test;

import java.util.Scanner;

public class Gravity_array {
	/* ���ڰ� �׿����ִ� ���� �ִ�. �� ���� 90�� ȸ���� �� ���ڵ��� ������ ��
	 * ����ū ���� ����Ͻÿ�.
	 * ù �⿡�� �׽�Ʈ ���̽� Ƚ��
	 * �ι�° �ٿ��� �� ���̽��� ���� ���� ũ�� - ���� ������ ũ��� 2�̻� 100����
	 * ����° �ٿ��� �׿��ִ� ������ ���� �Է��Ѵ�.
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

	} // ���� �ڽ��� ä���
	
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
