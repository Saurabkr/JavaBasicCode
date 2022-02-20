package com.company;
import java.util.*;

public class checkTheNumber {
    public void checkNumber(){
        Scanner sc=  new Scanner(System.in);
        int a = sc.nextInt();
        if( a >0){
            System.out.println("positive");
        }
        else if(a<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
    public static void main(String[] args) {


        checkTheNumber p = new checkTheNumber();
        p.checkNumber();

    }
}
