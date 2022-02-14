package com.company;
import java.util.*;





public class DigitFrequency {
    public void digitFrequency() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();

        int rem = 0;
        int count = 0;
        while (N > 0) {
            rem = N % 10;
            if (N % 10 == d) {
                count++;
            }
            N = N / 10;
        }
        System.out.println(count);
    }


    public static void main(String[] args) {

        DigitFrequency d = new DigitFrequency();
        d.digitFrequency();


    }
    }

