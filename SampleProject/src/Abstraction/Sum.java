package Abstraction;

import Collection.add;

public class Sum {

	public static void main(String[] args) {
		add obj=new add();
		obj.sum();
	}
	public void sum()
	{
		int a=9;
		int b=8;
		
		int c=a+b;
		System.out.println(c);
	}
	}


