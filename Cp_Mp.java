package com.company;
import java.util.*;

public class Cp_Mp {
    void CostOrMarkedPrice(){
      Scanner sc = new Scanner(System.in);
      float n = sc.nextInt();
      float sp = sc.nextInt();
      float percent = sc.nextInt();
      if(n==1){
          float mp= (sp*100)/(100-percent);
          System.out.println(mp);
      }
      if(n==2){
          float cp = (sp*100)/(100+percent);
          System.out.println(cp);
      }

    }
    public static void main(String[] args) {
        Cp_Mp a = new Cp_Mp();
        a.CostOrMarkedPrice();
    }
}
