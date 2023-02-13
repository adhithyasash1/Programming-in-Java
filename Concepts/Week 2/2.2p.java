/*  Write a program to accept a string input from user and print the characters at even indices. */

import java.util.*;

class FClass {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    evenDisplay(s1);
  }

  //Define evenDisplay(String) method here

  public static void evenDisplay(String s){
    for(int i=0;i<s.length();i=i+2){
        System.out.print(s.charAt(i));
    }
  }

}