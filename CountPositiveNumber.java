package com.company;
//import java.io.IOException;
import java.util.Scanner;

// Main class
// BufferedReaderTest
class CountPositiveNumber{

    // Main driver method
    public static void main(String[] args)
           // throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int N = sc.nextInt();
        int []arr = new int[N];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i]>0){
                count++;
            }
        }
        System.out.println(count);




    }
}
