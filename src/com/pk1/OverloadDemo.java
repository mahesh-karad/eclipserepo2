package com.pk1;

public class OverloadDemo {
    public void add(int a,int b)
    {
    	System.out.println(a+b);
    }
    public void add(float a,int b)
    {
    	System.out.println(a+b);
    }
    public void add(char a,char b)
    {
    	System.out.println(a+b);
    }
    
	public static void main(String[] args) {
	OverloadDemo o= new OverloadDemo();
	o.add(10,20);
	o.add(12.12f, 20);
	o.add('a', 'b');
	System.out.println("this is new message");
	}

}
