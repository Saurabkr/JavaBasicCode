package com.company;
import java.util.*;

public class Diff_SumOfOddEvenDigit{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1;
        if(n<0){
            n1= Math.abs(n);
        }
        else{
            n1 = n;
        }
        int r=0, even=0,odd=0,diff=0;

        while(n1 != 0){

            r = n1%10;
            if(r % 2 == 0) {
                even+=r;
            }
            else{
                odd+=r;
            }

            n1/=10;

        }
        diff=odd-even;
        System.out.println(diff);
    }
}
