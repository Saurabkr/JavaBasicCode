package com.company;

import java.util.Scanner;

public class OddEven {

    public void checkNumber(int a){
      if(a%2==0){
          System.out.println("Even");
      }
      else{
          System.out.println("Odd");
      }
    }
    public static void main(String[] args) {
       OddEven OE= new OddEven();
       OE.checkNumber(5);

    }
}
