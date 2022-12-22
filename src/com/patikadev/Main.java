package com.patikadev;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    
    while (true) {
      System.out.println("Enter an operation (add, subtract, multiply, divide, power, sqrt, derivative, integral, factorial, mod, abs):");
      String operation = scanner.nextLine();
      
      if (operation.equals("add")) {
        // Toplama i�lemi i�in iki say� giri�i al�p sonucu ekrana yazd�r�yoruz
        System.out.println("Enter the first number:");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double y = scanner.nextDouble();
        System.out.println(calculator.add(x, y));
      } else if (operation.equals("subtract")) {
        // ��karma i�lemi i�in iki say� giri�i al�p sonucu ekrana yazd�r�yoruz
      
      } else if (operation.equals("multiply")) {
        // �arpma i�lemi i�in iki say� giri�i al�p sonucu ekrana yazd�r�yoruz
        
      } else if (operation.equals("divide")) {
        // B�lme i�lemi i�in iki say� giri�i al�p sonucu ekrana yazd�r�yoruz
        
      } else if (operation.equals("power")) {
        // �s alma i�lemi i�in iki say� giri�i al�p sonucu ekrana yazd�r�yoruz
       
      } else if (operation.equals("sqrt")) {
        // Karek�k alma i�lemi i�in bir say� giri�i al�p sonucu ekrana yazd�r�yoruz
       
      } else if (operation.equals("derivative")) {
        // T�rev alma i�lemi i�in katsay�lar ve derece giri�lerini al�p sonucu ekrana yazd�r�yoruz
      
      }else if (operation.equals("integral")) {
          // integral i�lemi i�in bir say� giri�i al�p sonucu ekrana yazd�r�yoruz
          System.out.println("Enter a number:");
          double x = scanner.nextDouble();
          System.out.println(calculator.integral(x));
        } else if (operation.equals("factorial")) {
          // factorial i�lemi i�in bir say� giri�i al�p sonucu ekrana yazd�r�yoruz
          System.out.println("Enter a number:");
          int x = scanner.nextInt();
          System.out.println(calculator.factorial(x));
        } else if (operation.equals("mod")) {
          // mod i�lemi i�in iki say� giri�i al�p sonucu ekrana yazd�r�yoruz
          System.out.println("Enter the first number:");
          int x = scanner.nextInt();
          System.out.println("Enter the second number:");
          int y = scanner.nextInt();
          System.out.println(calculator.mod(x, y));
        } else if (operation.equals("abs")) {
          // abs i�lemi i�in bir say� giri�i al�p sonucu ekrana yazd�r�yoruz
          System.out.println("Enter a number:");
          double x = scanner.nextDouble();
          System.out.println(calculator.abs(x));
        } else {
          // Ge�ersiz bir i�lem girildi�inde bir hata mesaj� yazd�r�yoruz
          System.out.println("Invalid operation");
        }
      }
    }
  }