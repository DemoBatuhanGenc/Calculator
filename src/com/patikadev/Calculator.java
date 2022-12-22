package com.patikadev;

public class Calculator {
	  // 4 temel i�lemi yapmak i�in 4 ayr� metot olu�turuyoruz
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
	  
	  // �s alma i�lemini yapmak i�in bir metot olu�turuyoruz
	  public double power(double x, double y) {
	    return Math.pow(x, y);
	  }
	  
	  // Karek�k alma i�lemini yapmak i�in bir metot olu�turuyoruz
	  public double squareRoot(double x) {
	    return Math.sqrt(x);
	  }
	  
	  // T�rev alma i�lemini yapmak i�in bir metot olu�turuyoruz
	  public double derivative(double[] coefficients, int degree) {
		return degree;
	    // Katsay�lar� ve dereceyi kullanarak t�revini hesapl�yoruz
	    // ...
	  }
	  
	  // Integral alma i�lemini yapmak i�in bir metot olu�turuyoruz
	  public double integral(double[] coefficients, int degree) {
		return degree;
	    // Katsay�lar� ve dereceyi kullanarak integralini hesapl�yoruz
	    // ...
	  }
	  
	  // Fakt�riyel hesaplama i�lemini yapmak i�in bir metot olu�turuyoruz
	  public long factorial(int x) {
	    long result = 1;
	    for (int i = 1; i <= x; i++) {
	      result *= i;
	    }
	    return result;
	  }
	  
	  // Mod alma i�lemini yapmak i�in bir metot olu�turuyoruz
	  public double mod(double x, double y) {
	    return x % y;
	  }
	  
	  // Mutlak de�er hesaplama i�lemini yapmak i�in bir metot olu�turuyoruz
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