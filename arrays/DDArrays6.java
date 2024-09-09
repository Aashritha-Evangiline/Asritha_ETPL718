package com.evergent.corejava.arrays;

public class DDArrays6 {

	public static void main(String[] args) {
		String arr[][]=new String[5][5];
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
					arr[i][j]="JAVA";
				     
				
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
