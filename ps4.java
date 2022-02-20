package com.company;
import java.util.Scanner;
import java.util.Random;

public class ps4 {
    public static void main(String[] args) {

        System.out.println("1 for paper");
        System.out.println("2 for scissors");
        System.out.println("3 for rock");



      Scanner sc=new Scanner(System.in);
      Random ra=new Random();
      byte m1;
      m1=sc.nextByte();
      switch(m1)
      {
          case 1:
              System.out.println("user entered 1");
              break;
          case 2:
              System.out.println("user entered 2");
              break;
          case 3:
              System.out.println("user entered 3");
              break;
          default:
              System.out.println("you have enterd the out of bound number");
      }

        System.out.println("now it's computer turn");
      int comptnum=ra.nextInt(3);
      switch(comptnum)
      {
          case 1:
              System.out.println("computer entered the 1");
              break;
          case 2:
              System.out.println("computer entered the 2");
              break;
          case 3:
              System.out.println("computer entered the 3");
              break;
          default:
              System.out.println("sometime computer got flopped");
      }

      if(m1==comptnum)
      {
          System.out.println("match draw");
      }

    }


}
