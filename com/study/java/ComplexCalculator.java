package com.study.java;

import java.util.*;

public class ComplexCalculator  {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double result = 0;
    String nextOperation = " ";
    double firstNumber = 0;
    double secondNumber = 0;
    String operation = " ";

    do {
    //   do {
    //     try {
//
          System.out.print("Please, enter a number: ");
          firstNumber = in.nextDouble();
          System.out.print("Please, enter the next number: ");
          secondNumber = in.nextDouble();
          System.out.print("Select the operation you want to perform (+,-,*,/): ");
          operation = in.next();

      //     if ((!operation.equals("+")) || (!operation.equals("-")) || (!operation.equals("*")) || (!operation.equals("/"))) {
      //       throw (new Exception("Not an operator"));
      //     }
      //
      //     } catch (InputMismatchException e) {
      //       System.out.println("Not a number");
      //     } catch (Exception e) {
      //       System.out.println(e.getMessage());
      //     }
      // } while (true);


      if (operation.equals("+")) {
        result = addition(firstNumber,secondNumber);
        System.out.printf("The result of the addition is: " + result + "%n");
      }else if (operation.equals("-")) {
        result = substraction(firstNumber,secondNumber);
        System.out.printf("The result of the substraction is: " + result + "%n");
      }else if (operation.equals("*")) {
        result = multiplication(firstNumber,secondNumber);
        System.out.printf("The result of the multiplication is: " + result + "%n");
      }else if (operation.equals("/")) {
        result = division(firstNumber,secondNumber);
        System.out.printf("The result of the division is: " + result + "%n");
      }

      System.out.print("Do you want to perform another operation? (Y/N): ");
      nextOperation = in.next();
    } while (nextOperation.equalsIgnoreCase("Y"));

    in.close();



  // static String getInput trhows Exception (){
  //   return
  // }

  // static String chooseOperation(String operator){
  //
  }

  static double addition(double numA, double numB){
    double num1 = numA;
    double num2 = numB;
    double result = num1 + num2;
    return result;
  }

  static double substraction(double numA, double numB){
    double num1 = numA;
    double num2 = numB;
    double result = num1 - num2;
    return result;
  }

  static double multiplication(double numA, double numB){
    double num1 = numA;
    double num2 = numB;
    double result = num1 * num2;
    return result;
  }

  static double division(double numA, double numB){
    double num1 = numA;
    double num2 = numB;
    double result = num1 / num2;
    return result;
  }

}
