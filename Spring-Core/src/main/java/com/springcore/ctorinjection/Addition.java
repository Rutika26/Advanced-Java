package com.springcore.ctorinjection;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a,double b){
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Ctor : double , double");
	} 
	
	public Addition(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Ctor : int , int");
	}
	
	public Addition(String a,String b){
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Ctor : String , String");
	}
	
	public void doSum() {
		System.out.println("A = " + this.a);
		System.out.println("B = " + this.b);
		System.out.println("Sum is " + (this.a+this.b));
	}
}
