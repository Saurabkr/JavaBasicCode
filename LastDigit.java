package com.company;
import java.util.*;

public class LastDigit {

    public void checkNumber(int a, int b){
       int temp=0, temp1=0;
       temp =  a%100;
       temp1 = b%100;
       if(temp==temp1){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }
    }
    public static void main(String[] args) {
        LastDigit LD = new LastDigit();
        LD.checkNumber(456 , 236);

    }
}
