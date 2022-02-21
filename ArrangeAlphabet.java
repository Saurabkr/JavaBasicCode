package com.company;


public class ArrangeAlphabet {

    public void checkCharacter(){

        char c = 'i';
      char d = 'g';
        int ascii = (int)'i';
        int ascii1 = (int)'g';
        if(ascii>ascii1){
            System.out.println(c+ ","+ d );
        }
        else{
            System.out.println(d+ "," +c);
        }


    }
    public static void main(String[] args) {

ArrangeAlphabet A = new ArrangeAlphabet();
A.checkCharacter();

    }
}
