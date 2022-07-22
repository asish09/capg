package com.demo.samples;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=8; int b=4 ;double pi=3.14;int r=6;
		double area1;
		double area2;
		double area3;
		area1=(h*b)/2;
		area2=pi*r*r;
		area3=(2*pi*r*h)+2*pi*r*r;
		System.out.println("Area of Triangle"+area1);
		System.out.println("Area of Circle"+area2);
		System.out.println("Area of Cylinder"+area3);
		
	}

}
