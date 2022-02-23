package com.company;
import java.util.*;

public class SumOfOodDigit {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int oodSum= 0;
      int r;
     while(n>0){
       r = n%10;

        if(r%2!=0){
            oodSum += r;
        }
         n = n/10;

      }

        System.out.println(oodSum);

        }


    }

