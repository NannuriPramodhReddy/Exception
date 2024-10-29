package com.example.math;

public class Calculator {
	private int a;
	private int b;
	
	
	
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int add()
	{
		return a+b;
	}

    public int sub()
    {
    	return a-b;
    }

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", add=" + add() + ", sub=" + sub() + "]";
	}
}
