package com.example.Shapes;
import java.util.Scanner;
import com.example.utils.Mathutils;
public class Circle {
	
	public static void main(String[] args) { 
		
		Mathutils m = new Mathutils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter radius of circle");
		
		double r = sc.nextDouble();
		
		double area = m.getPi()*r*r;
		
		System.out.println(area);
		
	}

}
