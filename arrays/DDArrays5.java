package com.evergent.corejava.arrays;

public class DDArrays5 {

	public static void main(String[] args) {
		/* 1  2  3  4  5
		 * 6  7  8  9  10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 */
		 int arr[][]=new int[5][5];
			int count =1;
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					
						arr[i][j]=count;
					      count++;
					
				}
			}
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}

		
	}

}
