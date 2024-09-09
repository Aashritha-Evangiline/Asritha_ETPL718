package com.evergent.corejava.collections1;

import java.util.Enumeration;
import java.util.Vector;
// Index starts from 0
//Enumerator --> normal order iteration
//Preserves order of insertion

public class CF7_VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(0,"Aashritha");
		v.add(100.00);
		v.add(1);
		System.out.println(v);
		System.out.println("_______________");
		//Iteration using enumeration
		Enumeration e = v.elements();

		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());	
		}
	}
}
