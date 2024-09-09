package com.evergent.corejava.javabeans;

import java.io.Serializable;
// Scenario 1 :- Set value by setter and retrieve by getter
class EmployeeBean implements Serializable{
    private int eno;
	private String ename;
	private double sal;
	
  public void setEno(int eno) {
	 this.eno=eno;
  }
  public void setEname(String ename) {
	 this.ename=ename;
  }
  public void setSal(double sal) {
	 this.sal= sal;
  }
  public int getEno() {
	 return eno;
  }
  public String getEname() {
	 return ename;
  }
  public double getSal() {
	 return sal;
  }
}

public class EmployeeBeanImpl {
	public static void main(String[] args) {
		//Setting value to the bean
		EmployeeBean emp = new EmployeeBean();
	
		emp.setEname("Aashritha");
		emp.setEno(123);
		emp.setSal(2000000);
		//Getting value from the bean
		System.out.println(emp.getEname());
		System.out.println(emp.getEno());
		System.out.println(emp.getSal());
	}
}
