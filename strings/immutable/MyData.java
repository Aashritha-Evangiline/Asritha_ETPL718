package com.evergent.corejava.strings.immutable;

final class ImmutableString{
	private final String value;
	
	ImmutableString(String value){
		
		this.value=value;
	}
	public String MyValue() {
		
		return value;
	}
	public String toString() {
		
		return value;
	}
}
public class MyData {
	public static void main(String[] args) {
		ImmutableString is = new ImmutableString("Aash");
		System.out.println(is.MyValue() +" 'my value'");
		System.out.println(is +" 'toString'");
	}
}
