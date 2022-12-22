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
        // Toplama iþlemi için iki sayý giriþi alýp sonucu ekrana yazdýrýyoruz
        System.out.println("Enter the first number:");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double y = scanner.nextDouble();
        System.out.println(calculator.add(x, y));
      } else if (operation.equals("subtract")) {
        // Çýkarma iþlemi için iki sayý giriþi alýp sonucu ekrana yazdýrýyoruz
      
      } else if (operation.equals("multiply")) {
        // Çarpma iþlemi için iki sayý giriþi alýp sonucu ekrana yazdýrýyoruz
        
      } else if (operation.equals("divide")) {
        // Bölme iþlemi için iki sayý giriþi alýp sonucu ekrana yazdýrýyoruz
        
      } else if (operation.equals("power")) {
        // Üs alma iþlemi için iki sayý giriþi alýp sonucu ekrana yazdýrýyoruz
       
      } else if (operation.equals("sqrt")) {
        // Karekök alma iþlemi için bir sayý giriþi alýp sonucu ekrana yazdýrýyoruz
       
      } else if (operation.equals("derivative")) {
        // Türev alma iþlemi için katsayýlar ve derece giriþlerini alýp sonucu ekrana yazdýrýyoruz
      
      }else if (operation.equals("integral")) {
          // integral iþlemi için bir sayý giriþi alýp sonucu ekrana yazdýrýyoruz
          System.out.println("Enter a number:");
          double x = scanner.nextDouble();
          System.out.println(calculator.integral(x));
        } else if (operation.equals("factorial")) {
          // factorial iþlemi için bir sayý giriþi alýp sonucu ekrana yazdýrýyoruz
          System.out.println("Enter a number:");
          int x = scanner.nextInt();
          System.out.println(calculator.factorial(x));
        } else if (operation.equals("mod")) {
          // mod iþlemi için iki sayý giriþi alýp sonucu ekrana yazdýrýyoruz
          System.out.println("Enter the first number:");
          int x = scanner.nextInt();
          System.out.println("Enter the second number:");
          int y = scanner.nextInt();
          System.out.println(calculator.mod(x, y));
        } else if (operation.equals("abs")) {
          // abs iþlemi için bir sayý giriþi alýp sonucu ekrana yazdýrýyoruz
          System.out.println("Enter a number:");
          double x = scanner.nextDouble();
          System.out.println(calculator.abs(x));
        } else {
          // Geçersiz bir iþlem girildiðinde bir hata mesajý yazdýrýyoruz
          System.out.println("Invalid operation");
        }
      }
    }
  }