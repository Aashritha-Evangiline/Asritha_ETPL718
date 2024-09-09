package com.evergent.corejava.arrays;

public class DDArrays2 {

	public static void main(String[] args) {
		                                        /* 7 1 1 1 1
		                                           1 7 1 1 1
		                                           1 1 7 1 1 
		                                           1 1 1 7 1
		                                           1 1 1 1 7
		                                         */
		int arr[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j)
				{
					System.out.print("7 ");
				}
				else {
					System.out.print("1 ");
				}
				
			}
			System.out.println();
		}

	}

}
