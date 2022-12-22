package com.patikadev;

public class Calculator {
	  // 4 temel iþlemi yapmak için 4 ayrý metot oluþturuyoruz
	  public double add(double x, double y) {
	    return x + y;
	  }
	  
	  public double subtract(double x, double y) {
	    return x - y;
	  }
	  
	  public double multiply(double x, double y) {
	    return x * y;
	  }
	  
	  public double divide(double x, double y) {
	    return x / y;
	  }
	  
	  // Üs alma iþlemini yapmak için bir metot oluþturuyoruz
	  public double power(double x, double y) {
	    return Math.pow(x, y);
	  }
	  
	  // Karekök alma iþlemini yapmak için bir metot oluþturuyoruz
	  public double squareRoot(double x) {
	    return Math.sqrt(x);
	  }
	  
	  // Türev alma iþlemini yapmak için bir metot oluþturuyoruz
	  public double derivative(double[] coefficients, int degree) {
		return degree;
	    // Katsayýlarý ve dereceyi kullanarak türevini hesaplýyoruz
	    // ...
	  }
	  
	  // Integral alma iþlemini yapmak için bir metot oluþturuyoruz
	  public double integral(double[] coefficients, int degree) {
		return degree;
	    // Katsayýlarý ve dereceyi kullanarak integralini hesaplýyoruz
	    // ...
	  }
	  
	  // Faktöriyel hesaplama iþlemini yapmak için bir metot oluþturuyoruz
	  public long factorial(int x) {
	    long result = 1;
	    for (int i = 1; i <= x; i++) {
	      result *= i;
	    }
	    return result;
	  }
	  
	  // Mod alma iþlemini yapmak için bir metot oluþturuyoruz
	  public double mod(double x, double y) {
	    return x % y;
	  }
	  
	  // Mutlak deðer hesaplama iþlemini yapmak için bir metot oluþturuyoruz
	  public double absoluteValue(double x) {
	    return Math.abs(x);
	  }

	public char[] integral(double x) {
	
		return null;
	}

	public char[] abs(double x) {
		
		return null;
	}
	}